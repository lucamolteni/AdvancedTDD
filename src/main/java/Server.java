import org.eclipse.jetty.server.Handler;
import org.eclipse.jetty.server.Request;
import org.eclipse.jetty.server.handler.AbstractHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Server {
    public void startServer() throws Exception {
        HtmlGenerator htmlGenerator = new HtmlGenerator();

        Portiere portiere = new Portiere(htmlGenerator);

        Handler handler=new AbstractHandler()
        {
            @Override
            public void handle(String target, Request baseRequest, HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
                response.setContentType("text/html");
                response.setStatus(HttpServletResponse.SC_OK);

                String name = request.getParameter("name");
                String html = portiere.saluta(name);
                response.getWriter().println(html);

                ((Request)request).setHandled(true);
            }
        };

        org.eclipse.jetty.server.Server server = new org.eclipse.jetty.server.Server(8080);
        server.setHandler(handler);
        server.start();
    }
}
