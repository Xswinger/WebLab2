package dto;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;

public class RequestData implements Serializable {
    private Area area;
    private String currentTime;
    private String executionTime;
    private boolean result;

    public RequestData() {}
    public void setPrimaryData(Area area) {
        setArea(area);
    }

    public void setProcessedData(String time, long startTime) {
        OffsetDateTime currentTimeObject = OffsetDateTime.now(ZoneOffset.UTC).minusMinutes(Long.parseLong(time));
        setCurrentTime(currentTimeObject.format(DateTimeFormatter.ofPattern("HH:mm:ss")));
        setExecutionTime(String.format("%.9f", (Double)((System.nanoTime() - startTime)/1_000_000_000.0)));
    }

    public Area getArea() {
        return area;
    }

    public void setArea(Area area) {
        this.area = area;
    }

    public String getCurrentTime() {
        return currentTime;
    }

    public void setCurrentTime(String currentTime) {
        this.currentTime = currentTime;
    }

    public String getExecutionTime() {
        return executionTime;
    }

    public void setExecutionTime(String executionTime) {
        this.executionTime = executionTime;
    }

    public boolean isResult() {
        return result;
    }

    public void setResult(boolean result) {
        this.result = result;
    }
}
