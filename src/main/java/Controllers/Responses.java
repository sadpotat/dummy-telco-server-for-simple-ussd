package Controllers;

import com.google.gson.Gson;

import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

public class Responses {

    public static void internalServerError(HttpServletResponse resp, PrintWriter out){
        resp.setStatus(500);
        out.println("Internal Server Error");
        out.close();
    }

    public static void sendJSON(HttpServletResponse resp, PrintWriter out, Object obj) {
        resp.setStatus(200);
        Gson gson = new Gson();
        String jsonStr = gson.toJson(obj);
        resp.setContentType("application/json");
        resp.setCharacterEncoding("UTF-8");
        out.print(jsonStr);
        out.close();
    }

    public static void sendResponse(String resStr, PrintWriter out) {
        String[] responses = resStr.split("__");
        for (String line: responses)
            out.println(line);
        out.close();
    }
}
