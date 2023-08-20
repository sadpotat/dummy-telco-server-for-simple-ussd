package Models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;


@JacksonXmlRootElement(localName = "XmlRobi")
public class XmlRobi {
//    @JacksonXmlProperty(localName = "transactionid")
    private String transactionId;
//    @JacksonXmlProperty(localName = "paymentfrom")
    private String paymentFrom;
//    @JacksonXmlProperty(localName = "paymentto")
    private String topUpAcc;
//    @JacksonXmlProperty(localName = "amount")
    private String amountt; // Getters and setters }
    @JsonCreator
    public XmlRobi( @JsonProperty("transactionid") String transactionid,
                    @JsonProperty("paymentfrom") String paymentfrom,
                    @JsonProperty("topupacc") String paymentto,
                    @JsonProperty("amount") String amount) {
//
        transactionId = transactionid;
        paymentFrom = paymentfrom;
        topUpAcc = paymentto;
        amountt = amount;
    }

    public String getTransactionid() {
        return transactionId;
    }

    public void setTransactionid(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getPaymentfrom() {
        return paymentFrom;
    }

    public void setPaymentfrom(String paymentFrom) {
        this.paymentFrom = paymentFrom;
    }

    public String getPaymentto() {
        return topUpAcc;
    }

    public void setPaymentto(String topUpAcc) {
        this.topUpAcc = topUpAcc;
    }

    public String getAmountt() {
        return amountt;
    }

    public void setAmountt(String amountt) {
        this.amountt = amountt;
    }

    public boolean hasNull() {
        return transactionId==null || paymentFrom==null || topUpAcc==null || amountt==null;
    }
}
