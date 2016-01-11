package app.gamming.com.gammingapp.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by hamdi on 1/11/2016.
 */
public class ResultGame{

    private String serverVersion;
    private List<Game> allAvailableWorlds= new ArrayList<>();;


    public void setServerVersion(String serverVersion) {
        this.serverVersion = serverVersion;
    }

    public void setAllAvailableWorlds(List<Game> allAvailableWorlds) {
        this.allAvailableWorlds = allAvailableWorlds;
    }

    public String getServerVersion() {
        return serverVersion;
    }

    public List<Game> getAllAvailableWorlds() {
        return allAvailableWorlds;
    }
}
