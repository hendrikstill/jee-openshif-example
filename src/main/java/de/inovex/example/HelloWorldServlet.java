package de.inovex.example;

import java.io.IOException;

import javax.inject.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

/**
 * 
 */
@SuppressWarnings("serial")
@WebServlet("/HelloWorld")
public class HelloWorldServlet extends HttpServlet {

    @Inject
    HelloWorldService helloWorldService;

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.setContentType("text/html");
        resp.getWriter().println("<html><body><h1>");
        resp.getWriter().println(helloWorldService.createHelloMessage("Hendrik"));
        resp.getWriter().println("</h1></body></html>");

    }
}