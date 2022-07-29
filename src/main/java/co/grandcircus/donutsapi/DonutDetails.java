package co.grandcircus.donutsapi;

import java.util.List;

public class DonutDetails {
    private Integer id;
    private String name;
    private int calories;
    private List<String> extras;
    private String photo;
    private String photo_attribution;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public List<String> getExtras() {
        return extras;
    }

    public void setExtras(List<String> extras) {
        this.extras = extras;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getPhoto_attribution() {
        return photo_attribution;
    }

    public void setPhoto_attribution(String photo_attribution) {
        this.photo_attribution = photo_attribution;
    }



}
