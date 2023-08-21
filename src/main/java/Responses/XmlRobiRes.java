package Responses;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

@JacksonXmlRootElement(localName = "XmlRobiRes")
public class XmlRobiRes {
    @JacksonXmlProperty(localName = "resp")
    private String respStr;
    @JacksonXmlProperty(localName = "success")
    private String successStr;
    @JacksonXmlProperty(localName = "transactionid")
    private String transactionID;
    @JacksonXmlProperty(localName = "localtime")
    private String localtimeStr;

    public String getRespStr() {
        return respStr;
    }

    public void setRespStr(String respStr) {
        this.respStr = respStr;
    }

    public String getSuccessStr() {
        return successStr;
    }

    public void setSuccessStr(String successStr) {
        this.successStr = successStr;
    }

    public String getTransactionID() {
        return transactionID;
    }

    public void setTransactionID(String transactionID) {
        this.transactionID = transactionID;
    }

    public String getLocaltimeStr() {
        return localtimeStr;
    }

    public void setLocaltimeStr(ZonedDateTime localtimeStr) {
        this.localtimeStr = localtimeStr.format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm"));
    }
}
