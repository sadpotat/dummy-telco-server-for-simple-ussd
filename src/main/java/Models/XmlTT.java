package Models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;


@JacksonXmlRootElement(localName = "XmlTT")
public class XmlTT {
    private String topUpId;
    private String senderr;
    private String targett;
    private String topUp;
    @JsonCreator
    public XmlTT( @JsonProperty("topupid") String transactionid,
                    @JsonProperty("sender") String paymentfrom,
                    @JsonProperty("target") String paymentto,
                    @JsonProperty("topup") String amount) {
        topUpId = transactionid;
        senderr = paymentfrom;
        targett = paymentto;
        topUp = amount;
    }

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

    public boolean hasNull() {
        return topUpId==null || senderr ==null || targett ==null || topUp ==null;
    }
}
