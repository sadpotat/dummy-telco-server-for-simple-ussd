package Models;

import Responses.XmlTTRes;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;


@JacksonXmlRootElement(localName = "XmlTT")
public class XmlTT {
    @JacksonXmlProperty(localName = "topupid")
    private String topUpId;
    @JacksonXmlProperty(localName = "sender")
    private String senderr;
    @JacksonXmlProperty(localName = "target")
    private String targett;
    @JacksonXmlProperty(localName = "topup")
    private String topUp;
    private XmlTTRes res;

    public String getTopUpId() {
        return topUpId;
    }

    public void setTopUpId(String topUpId) {
        this.topUpId = topUpId;
    }

    public String getSenderr() {
        return senderr;
    }

    public void setSenderr(String senderr) {
        this.senderr = senderr;
    }

    public String getTargett() {
        return targett;
    }

    public void setTargett(String targett) {
        this.targett = targett;
    }

    public String getTopUp() {
        return topUp;
    }

    public void setTopUp(String topUp) {
        this.topUp = topUp;
    }

    public XmlTTRes getRes() {
        return res;
    }

    public void setRes(XmlTTRes res) {
        this.res = res;
    }

    public boolean hasNull() {
        return topUpId==null || senderr ==null || targett ==null || topUp ==null;
    }
}
