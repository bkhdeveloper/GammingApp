package app.gamming.com.gammingapp.model;

import java.io.Serializable;

/**
 * Created by hamdi on 1/10/2016.
 */
public class User  {

    private static final long serialVersionUID = 7766100448024055390L;
    private String login;
    private String password;
    private String deviceType;
    private String deviceId;


    public User() {
    }

    public User(String login, String password, String deviceType, String deviceId) {
        this.login = login;
        this.password = password;
        this.deviceType = deviceType;
        this.deviceId = deviceId;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }
}
