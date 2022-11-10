package ControllerServet;

import dto.HeadersManager;
import dto.ValuesValidator;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;

@WebServlet(name = "Controller Servlet", value = "/controller")
public class ControllerServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.setStatus(405);
        resp.getWriter().println("Available method: POST");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletContext context = getServletContext();
        Enumeration<String> headers = req.getHeaderNames();
        HeadersManager.getInstance().addHeadersOfNewRequest(headers);
        context.setAttribute("headersMap", HeadersManager.getInstance().getHeadersMap());
        if (ValuesValidator.validInputValues(req.getParameter("x_coordinate"),
                req.getParameter("y_coordinate"),
                req.getParameter("r_coordinate"))) {
            getServletContext().getRequestDispatcher("/areaCheck").forward(req, resp);
        }
    }
}
