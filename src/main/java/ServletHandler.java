import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ServletHandler extends HttpServlet {

    private int value = 0;

    public ServletHandler() {
        System.out.println("create!");
    }

    @Override
    public void init() throws ServletException {
        System.out.println("init!");
        value += 1;
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("get!");
        value += 100;
        resp.getOutputStream().print(value);
    }
}
