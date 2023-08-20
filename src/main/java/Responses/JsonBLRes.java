package Responses;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class JsonBLRes {
    private String text;
    private String status;
    private String trackingID;
    private String time;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTrackingID() {
        return trackingID;
    }

    public void setTrackingID(String trackingID) {
        this.trackingID = trackingID;
    }

    public String getTime() {
        return time;
    }

    public void setTime(ZonedDateTime time) {
        this.time = time.format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm"));
    }
}
