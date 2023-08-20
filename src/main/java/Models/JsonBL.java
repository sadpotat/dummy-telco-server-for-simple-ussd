package Models;

import Responses.JsonBLRes;

public class JsonBL {
    private String trackingid;
    private String paymentfrom;
    private String paymentto;
    private String amount;

    private JsonBLRes res;

    public String getTrackingid() {
        return trackingid;
    }

    public void setTrackingid(String trackingid) {
        this.trackingid = trackingid;
    }

    public String getPaymentfrom() {
        return paymentfrom;
    }

    public void setPaymentfrom(String paymentfrom) {
        this.paymentfrom = paymentfrom;
    }

    public String getPaymentto() {
        return paymentto;
    }

    public void setPaymentto(String paymentto) {
        this.paymentto = paymentto;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public JsonBLRes getRes() {
        return res;
    }

    public void setRes(JsonBLRes res) {
        this.res = res;
    }

    public boolean hasNull() {
        return trackingid==null || paymentfrom==null || paymentto==null || amount==null;
    }

}
