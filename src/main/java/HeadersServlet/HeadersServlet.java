package HeadersServlet;

import dto.HeadersManager;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.concurrent.locks.ReentrantLock;

@WebServlet(name = "HeadersServlet", value = "/headers")
public class HeadersServlet extends HttpServlet {
    private final ReentrantLock reentrantLock = new ReentrantLock();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        doPost(req, resp);
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.setContentType("text/html");
        PrintWriter writer = resp.getWriter();
        reentrantLock.lock();
        for (String key: HeadersManager.getInstance().getHeadersMap().keySet()) {
            writer.println(key + ":" + HeadersManager.getInstance().getHeadersMap().get(key) + "<br>");
        }
        reentrantLock.unlock();
    }
}
