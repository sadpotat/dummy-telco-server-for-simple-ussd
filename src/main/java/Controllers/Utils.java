package Controllers;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Utils {

    public static HashMap<String, String> queryToMap(String query) {
        if(query == null) {
            return null;
        }
        HashMap<String, String> result = new HashMap<>();
        for (String param : query.split("&")) {
            String[] entry = param.split("=");
            if (entry.length > 1) {
                result.put(entry[0], entry[1]);
            }else{
                result.put(entry[0], "");
            }
        }
        return result;
    }

    public static String createTrackingID(){
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        int bound = characters.length();
        int length = 12;

        Random rand = new Random();
        StringBuilder builder = new StringBuilder(length);

        for (int i=0; i<length; i++){
            builder.append(characters.charAt(rand.nextInt(bound)));
        }
        return builder.toString();
    }
}
