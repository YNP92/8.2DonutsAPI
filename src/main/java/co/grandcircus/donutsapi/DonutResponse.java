package co.grandcircus.donutsapi;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DonutResponse {
    @JsonProperty("count")
    private int numberOfDonts;
    @JsonProperty("results")
    private List<Donut> donutResults;

    public int getNumberOfDonts() {
        return numberOfDonts;
    }

    public void setNumberOfDonts(int numberOfDonts) {
        this.numberOfDonts = numberOfDonts;
    }

    public List<Donut> getDonutResults() {
        return donutResults;
    }

    public void setDonutResults(List<Donut> donutResults) {
        this.donutResults = donutResults;
    }

}
