package Servlets;

import Controllers.RequestParsers;
import Models.XmlRobi;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class Robi extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        resp.setStatus(200);
        PrintWriter out = resp.getWriter();

        // parsing request json
        XmlRobi rdata = RequestParsers.getXmlRobi(req, resp, out);
        if (rdata == null) return;

        System.out.println(rdata.getAmountt());
        System.out.println(rdata.getPaymentfrom());
        System.out.println(rdata.getPaymentto());
        System.out.println(rdata.getTransactionid());

        out.println("<response><res>Top-up Success</res></response>");
        out.close();
    }
}
