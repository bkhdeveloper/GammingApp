package app.gamming.com.gammingapp.model;

import java.io.Serializable;

/**
 * Created by hamdi on 1/10/2016.
 */
public class Game{

    private static final long serialVersionUID = 7766100460024055390L;

    private String country;
    private String id;
    private String language;
    private String mapURL;
    private String name;
    private String url;
    private WorldStatus worldStatus;

    public Game() {
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getMapURL() {
        return mapURL;
    }

    public void setMapURL(String mapURL) {
        this.mapURL = mapURL;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public WorldStatus getWorldStatus() {
        return worldStatus;
    }

    public void setWorldStatus(WorldStatus worldStatus) {
        this.worldStatus = worldStatus;
    }
}
