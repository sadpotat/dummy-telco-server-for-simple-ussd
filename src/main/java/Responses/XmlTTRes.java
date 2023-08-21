package Responses;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

@JacksonXmlRootElement(localName = "XmlTTRes")
public class XmlTTRes {
    @JacksonXmlProperty(localName = "val")
    private String valStr;
    @JacksonXmlProperty(localName = "topupstatus")
    private String topUpStatus;
    @JacksonXmlProperty(localName = "topupid")
    private String topUpID;
    @JacksonXmlProperty(localName = "modified")
    private String modifiedStr;

    public String getValStr() {
        return valStr;
    }

    public void setValStr(String valStr) {
        this.valStr = valStr;
    }

    public String getTopUpStatus() {
        return topUpStatus;
    }

    public void setTopUpStatus(String topUpStatus) {
        this.topUpStatus = topUpStatus;
    }

    public String getTopUpID() {
        return topUpID;
    }

    public void setTopUpID(String topUpID) {
        this.topUpID = topUpID;
    }

    public String getModifiedStr() {
        return modifiedStr;
    }

    public void setModifiedStr(ZonedDateTime zoneDateTime) {
        modifiedStr = zoneDateTime.format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss"));
    }
}
