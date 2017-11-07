package com.coldridge.valley;

import java.io.File;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author J
 * @date 2017/11/07
 */
public class TunnelServlet extends HttpServlet {

    private static final String LINE_SEPARATOR = System.getProperty(" line.separator");

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        File doc = new File(req.getRealPath("/doc"));
        File[] files = doc.listFiles();
        StringBuffer buffer = new StringBuffer();
        buffer.append("<table>");
        for (File file : files) {
            buffer.append("<tr>");
            buffer.append("<a href='../doc/" + file.getName() + "' target='_blank'> " + file.getName() + "</a></td>");
            buffer.append("</tr><br>");
        }
        buffer.append("</table");
        req.getSession().setAttribute("table", buffer.toString());
        req.getRequestDispatcher("/WEB-INF/index.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req, resp);
    }
}
