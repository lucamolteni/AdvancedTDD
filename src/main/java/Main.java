import org.eclipse.jetty.server.Handler;
import org.eclipse.jetty.server.Request;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.handler.AbstractHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws Exception {
        Handler handler=new AbstractHandler()
        {
            @Override
            public void handle(String target, Request baseRequest, HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
                response.setContentType("text/html");
                response.setStatus(HttpServletResponse.SC_OK);
                response.getWriter().println("<h1>Ciao da Jetty Embedded</h1>");
                ((Request)request).setHandled(true);
            }
        };

        Server server = new Server(8080);
        server.setHandler(handler);
        server.start();
    }
}
