package app.gamming.com.gammingapp.thread;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.res.Resources;
import android.os.AsyncTask;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import app.gamming.com.gammingapp.R;
import app.gamming.com.gammingapp.model.Game;
import app.gamming.com.gammingapp.model.ResultGame;
import app.gamming.com.gammingapp.model.User;
import app.gamming.com.gammingapp.service.XyralityService;
import retrofit.Call;
import retrofit.Callback;
import retrofit.GsonConverterFactory;
import retrofit.Response;
import retrofit.Retrofit;

/**
 * Created by hamdi on 1/10/2016.
 */
public class ListGamesAsync extends  AsyncTask<Void,Integer,List<Game>> {


    private Context mContext;
    private ProgressDialog mProgress;
    private Resources mRes;
    private XyralityService mXyralityService;
    private User mUserModel;

    public ListGamesAsync(Context pContext,User pUser) {
        mContext = pContext;
        mRes=pContext.getResources();
        mXyralityService= new Retrofit.Builder().
                baseUrl(XyralityService.ENDPOINT).
                addConverterFactory(GsonConverterFactory.create()).
                build().create(XyralityService.class);
        mUserModel=pUser;
    }

    @Override
    protected void onPreExecute() {
        super.onPreExecute();

        mProgress = new ProgressDialog(mContext);
        mProgress.setTitle(R.string.title_async_loading);
        mProgress.setMessage(mRes.getString(R.string.msg_async_loading));
        mProgress.setCancelable(false);
        mProgress.show();
    }

    @Override
    protected List<Game> doInBackground(Void... params) {

        Call<ResultGame> a= mXyralityService.getGameResult(mUserModel);
        a.enqueue(new Callback<ResultGame>() {
            @Override
            public void onResponse(Response<ResultGame> response, Retrofit retrofit) {
                System.out.println("response code :"+response.body().getAllAvailableWorlds());
            }

            @Override
            public void onFailure(Throwable t) {
                System.out.println("ERRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR code :"+t);
            }
        });

        return new ArrayList<>();
    }

    @Override
    protected void onPostExecute(List<Game> result) {
        super.onPostExecute(result);

        System.out.println("RESULT : "+result.toString());
        if(mProgress.isShowing())
            mProgress.hide();
    }
}
