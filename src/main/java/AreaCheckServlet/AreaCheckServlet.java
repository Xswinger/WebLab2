package AreaCheckServlet;

import dto.Area;
import dto.HitChecker;
import dto.RequestData;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "AreaCheckServlet", value = "/areaCheck")
public class AreaCheckServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Area.getInstance().setValues(Float.parseFloat(req.getParameter("x_coordinate")),
                Float.parseFloat(req.getParameter("y_coordinate")),
                Float.parseFloat(req.getParameter("r_coordinate")));
        RequestData requestData = new RequestData();
        requestData.setPrimaryData(Area.getInstance());
        requestData.setResult(HitChecker.getInstance().checkValues(Area.getInstance()));
        requestData.setProcessedData(req.getParameter("time"));
        HttpSession session = req.getSession();
        if (session.getAttribute("table") == null) {
            session.setAttribute("table", new ArrayList<RequestData>());
        }
        List<RequestData> table = (List<RequestData>) session.getAttribute("table");
        table.add(requestData);
        session.setAttribute("table", table);
        resp.setContentType("text/html");
        req.getRequestDispatcher("/result.jsp").forward(req, resp);
    }
}
