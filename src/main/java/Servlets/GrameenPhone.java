package Servlets;

import Controllers.RequestParsers;
import Controllers.Responses;
import Models.JsonGP;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class GrameenPhone extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        resp.setStatus(200);
        PrintWriter out = resp.getWriter();

        // parsing request json
        JsonGP rdata = RequestParsers.getJsonGP(req, resp, out);
        if (rdata == null) return;

        Responses.sendJSON(resp, out, rdata.getRes());
    }
}