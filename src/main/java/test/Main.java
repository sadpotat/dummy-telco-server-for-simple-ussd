package test;

import Models.XmlTT;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

public class Main {
    public static void main(String[] args) throws UnsupportedEncodingException, JsonProcessingException {
//        String json = "{transactionid: 13223, recipient: 112, agent: nagad, topup: 20.5}";
//        String encodedJson = java.net.URLEncoder.encode(json, "UTF-8");;
//        System.out.println(encodedJson);
//        String decodedJson = URLDecoder.decode(encodedJson, "UTF-8");
//        System.out.println(decodedJson);

        String xml = "<param><trackingid>testid123</trackingid>" +
                "<sender>nagad</sender>" +
                "<target>114</target>" +
                "<topup>50</topup></param>";
        String encodedXml = java.net.URLEncoder.encode(xml, "UTF-8");
        System.out.println(encodedXml);
        String decodedXml = URLDecoder.decode(encodedXml);

        System.out.println(xml);
        System.out.println(decodedXml);

        XmlMapper xmlMapper = new XmlMapper();
        XmlTT rdata = xmlMapper.readValue(xml, XmlTT.class);
        if (rdata==null){
            System.out.println("fail");
        }

        System.out.println(rdata.getTopUpId());
        System.out.println(rdata.getTargett());
        System.out.println(rdata.getSenderr());
        System.out.println(rdata.getTopUp());


    }
}
