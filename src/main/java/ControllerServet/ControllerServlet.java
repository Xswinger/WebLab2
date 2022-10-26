package ControllerServet;

import dto.ValuesValidator;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "Controller Servlet", value = "/controller")
public class ControllerServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.setStatus(405);
        resp.getWriter().println("Available method: POST");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        if (ValuesValidator.validInputValues(req.getParameter("x_coordinate"),
                req.getParameter("y_coordinate"),
                req.getParameter("r_coordinate"))) {
            getServletContext().getRequestDispatcher("/areaCheck").forward(req, resp);
        }
    }
}
