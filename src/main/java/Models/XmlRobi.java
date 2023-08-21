package Models;

import Responses.XmlRobiRes;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;


@JacksonXmlRootElement(localName = "XmlRobi")
public class XmlRobi {
    @JacksonXmlProperty(localName = "transactionid")
    private String transactionId;
    @JacksonXmlProperty(localName = "paymentfrom")
    private String paymentFrom;
    @JacksonXmlProperty(localName = "topupacc")
    private String topUpAcc;
    @JacksonXmlProperty(localName = "amount")
    private String amountt;
    private XmlRobiRes res;

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getPaymentFrom() {
        return paymentFrom;
    }

    public void setPaymentFrom(String paymentFrom) {
        this.paymentFrom = paymentFrom;
    }

    public String getTopUpAcc() {
        return topUpAcc;
    }

    public void setTopUpAcc(String topUpAcc) {
        this.topUpAcc = topUpAcc;
    }

    public String getAmountt() {
        return amountt;
    }

    public void setAmountt(String amountt) {
        this.amountt = amountt;
    }

    public XmlRobiRes getRes() {
        return res;
    }

    public void setRes(XmlRobiRes res) {
        this.res = res;
    }

    public boolean hasNull() {
        return transactionId==null || paymentFrom==null || topUpAcc==null || amountt==null;
    }
}
