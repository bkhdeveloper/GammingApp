package app.gamming.com.gammingapp.service;

import java.util.List;

import app.gamming.com.gammingapp.model.Game;
import app.gamming.com.gammingapp.model.ResultGame;
import app.gamming.com.gammingapp.model.User;
import retrofit.Call;
import retrofit.http.Body;
import retrofit.http.FormUrlEncoded;
import retrofit.http.Headers;
import retrofit.http.Multipart;
import retrofit.http.POST;
import retrofit.http.PartMap;

/**
 * Created by hamdi on 1/10/2016.
 */
public interface XyralityService {

    public static final String ENDPOINT = "http://backend1.lordsandknights.com";

    @Headers({"Accept: application/json"})
    @POST("/XYRALITY/WebObjects/BKLoginServer.woa/wa/worlds")
    Call<ResultGame> getGameResult(@Body  User user);
}
