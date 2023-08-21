package Servlets;

import Controllers.RequestParsers;
import Controllers.Responses;
import Models.XmlTT;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class Teletalk extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        resp.setStatus(200);
        PrintWriter out = resp.getWriter();

        // parsing request json
        XmlTT rdata = RequestParsers.getXmlTeletalk(req, resp, out);
        if (rdata == null) return;

        Responses.sendXML(resp, out, rdata.getRes());
    }
}
