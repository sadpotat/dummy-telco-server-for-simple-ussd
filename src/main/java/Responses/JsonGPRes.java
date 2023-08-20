package Responses;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class JsonGPRes {
    private String message;
    private String stat;
    private String transactionID;
    private String when;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getStat() {
        return stat;
    }

    public void setStat(String stat) {
        this.stat = stat;
    }

    public String getTransactionID() {
        return transactionID;
    }

    public void setTransactionID(String transactionID) {
        this.transactionID = transactionID;
    }

    public String getWhen() {
        return when;
    }

    public void setWhen(ZonedDateTime when) {
        this.when = when.format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm"));
    }
}
