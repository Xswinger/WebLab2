package dto;

import java.io.Serializable;
import java.time.LocalDate;

public class RequestData implements Serializable {
    private Area area;
    private LocalDate currentTime;
    private double executionTime;
    private boolean result;

    public RequestData() {}
    public void setPrimaryData(Area area) {
        setArea(area);
    }

    public void setProcessedData(String time) {
        setCurrentTime(LocalDate.now());
        setExecutionTime((double) (System.nanoTime() - Long.parseLong(time)) / 1000000);
    }

    public Area getArea() {
        return area;
    }

    public void setArea(Area area) {
        this.area = area;
    }

    public LocalDate getCurrentTime() {
        return currentTime;
    }

    public void setCurrentTime(LocalDate currentTime) {
        this.currentTime = currentTime;
    }

    public double getExecutionTime() {
        return executionTime;
    }

    public void setExecutionTime(double executionTime) {
        this.executionTime = executionTime;
    }

    public boolean isResult() {
        return result;
    }

    public void setResult(boolean result) {
        this.result = result;
    }
}
