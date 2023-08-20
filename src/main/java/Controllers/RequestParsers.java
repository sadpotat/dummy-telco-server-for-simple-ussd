package Controllers;

import Models.JsonBL;
import Responses.JsonBLRes;
import Models.JsonGP;
import Responses.JsonGPRes;
import Models.XmlRobi;
import Models.XmlTT;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.google.gson.Gson;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Map;


public class RequestParsers {

    public static int getQueryInt(HttpServletRequest req, String param){
        Map<String, String> params = Utils.queryToMap(req.getQueryString());
        try {
            String data = params.get(param);
            return Integer.parseInt(data);
        } catch (Exception e){
            System.out.println("could not find " + param + " in request query");
            return -1;
        }
    }

    public static String getQueryString(HttpServletRequest req, String param) {
        Map<String, String> params = Utils.queryToMap(req.getQueryString());
        try {
            return params.get(param).toLowerCase();
        } catch (Exception e){
            System.out.println("could not find " + param + " in request query");
            return "";
        }
    }


    private static String getReqBody(HttpServletRequest req) {
        try{
            StringBuilder sb = new StringBuilder();
            BufferedReader reader = req.getReader();
            String line;
            while ((line = reader.readLine()) != null) {
                sb.append(line);
            }
            return sb.toString();
        } catch (Exception e){
            System.out.println("failed to get body parameters");
            return "";
        }
    }

    public static JsonGP getJsonGP(HttpServletRequest req, HttpServletResponse resp, PrintWriter out) {
        JsonGP rdata = new JsonGP();
        JsonGPRes res = new JsonGPRes();
        try{
            String data = getReqBody(req);
            res.setMessage("Top-up Success");
            res.setStat("okay");
            if (!data.startsWith("{") || !data.endsWith("}")){
                res.setMessage("Wrong request format. Please send in JSON format");
                res.setStat("failed");
            } else {
                rdata = new Gson().fromJson(data, JsonGP.class);
                if( rdata.hasNull()){
                    res.setMessage("Missing keys");
                    res.setStat("failed");
                }
            }
            res.setTransactionID(rdata.getTransactionid()==null ? "missing": rdata.getTransactionid());
        } catch (Exception e){
            Responses.internalServerError(resp, out);
            return null;
        }
        res.setWhen(ZonedDateTime.now());
        rdata.setRes(res);
        return rdata;
    }


    public static JsonBL getJsonBL(HttpServletRequest req, HttpServletResponse resp, PrintWriter out) {
        JsonBL rdata = new JsonBL();
        JsonBLRes res = new JsonBLRes();
        try{
            String data = getReqBody(req);
            res.setText("Success");
            res.setStatus("success");
            if (!data.startsWith("{") || !data.endsWith("}")){
                res.setText("Wrong request format. Please send in JSON format");
                res.setStatus("Fail");
            } else {
                rdata = new Gson().fromJson(data, JsonBL.class);
                if( rdata.hasNull()){
                    res.setText("Missing keys");
                    res.setStatus("Fail");
                }
            }
            res.setTrackingID(rdata.getTrackingid()==null ? "missing": rdata.getTrackingid());
        } catch (Exception e){
            Responses.internalServerError(resp, out);
            return null;
        }
        res.setTime(ZonedDateTime.now());
        rdata.setRes(res);
        return rdata;
    }

    public static XmlRobi getXmlRobi(HttpServletRequest req, HttpServletResponse resp, PrintWriter out) {
        try{
            String data = getReqBody(req);
            if (!data.startsWith("<") || !data.endsWith(">")){
                out.println("Wrong request format. Please send in XML format");
                out.close();
                return null;
            }

            // Step 1: Create an XMLMapper instance from Jackson
            XmlMapper xmlMapper = new XmlMapper();
            // Step 2: Parse the XML string into a Java object
            XmlRobi rdata = xmlMapper.readValue(data, XmlRobi.class);
            if( rdata.hasNull()){
                out.println("Missing keys");
                out.close();
                return null;
            }

            return rdata;
        } catch (Exception e){
            Responses.internalServerError(resp, out);
            return null;
        }

    }

    public static XmlTT getXmlTeletalk(HttpServletRequest req, HttpServletResponse resp, PrintWriter out) {
        try{
            String data = getReqBody(req);
            if (!data.startsWith("<") || !data.endsWith(">")){
                out.println("Wrong request format. Please send in XML format");
                out.close();
                return null;
            }

            // Step 1: Create an XMLMapper instance from Jackson
            XmlMapper xmlMapper = new XmlMapper();
            // Step 2: Parse the XML string into a Java object
            XmlTT rdata = xmlMapper.readValue(data, XmlTT.class);
            if( rdata.hasNull()){
                out.println("Missing keys");
                out.close();
                return null;
            }

            return rdata;
        } catch (Exception e){
            Responses.internalServerError(resp, out);
            return null;
        }
    }
}
