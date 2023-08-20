package Servlets;

import Controllers.RequestParsers;
import Controllers.Responses;
import Models.JsonBL;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;

public class Banglalink extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        resp.setStatus(200);
        PrintWriter out = resp.getWriter();

        // parsing request json
        JsonBL rdata = RequestParsers.getJsonBL(req, resp, out);
        if (rdata == null) return;


        Responses.sendJSON(resp, out, rdata.getRes());
    }

}
