package co.grandcircus.donutsapi;

import java.util.List;


public class DonutResponse {

    private int count;

    private List<Donut> results;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public List<Donut> getResults() {
        return results;
    }

    public void setResults(List<Donut> results) {
        this.results = results;
    }



}
