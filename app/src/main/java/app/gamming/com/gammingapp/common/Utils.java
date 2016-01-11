package app.gamming.com.gammingapp.common;

import android.content.Context;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.provider.Settings;
import android.provider.SyncStateContract;

/**
 * Created by hamdi on 1/10/2016.
 */
public class Utils {

    public static String getDeviceId(Context pContext){
        return Settings.Secure.getString(pContext.getContentResolver(), Settings.Secure.ANDROID_ID);
    }
    public static String getDeviceType() {
        return String.format("%s %s",   android.os.Build.MODEL, android.os.Build.VERSION.RELEASE);
    }
}
