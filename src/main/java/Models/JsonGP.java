package Models;

import Responses.JsonGPRes;

public class JsonGP {
    private String transactionid;
    private String agent;
    private String recipient;
    private String topup;
    private JsonGPRes res;

    public String getTransactionid() {
        return transactionid;
    }

    public void setTransactionid(String transactionid) {
        this.transactionid = transactionid;
    }

    public String getAgent() {
        return agent;
    }

    public void setAgent(String agent) {
        this.agent = agent;
    }

    public String getRecipient() {
        return recipient;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    public String getTopup() {
        return topup;
    }

    public void setTopup(String topup) {
        this.topup = topup;
    }

    public JsonGPRes getRes() {
        return res;
    }

    public void setRes(JsonGPRes res) {
        this.res = res;
    }

    public boolean hasNull() {
        return transactionid==null || agent==null || recipient==null || topup==null;
    }
}
