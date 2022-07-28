package co.grandcircus.donutsapi;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Donut {
    private int id;
    @JsonProperty("ref")
    private String donutInfo;
    private String name;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getDonutInfo() {
        return donutInfo;
    }
    public void setDonutInfo(String donutInfo) {
        this.donutInfo = donutInfo;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
}
