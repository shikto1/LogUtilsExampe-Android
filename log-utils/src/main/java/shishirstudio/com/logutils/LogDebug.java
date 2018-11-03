package shishirstudio.com.logutils;

import android.util.Log;

public class LogDebug {

    private static String TAG = "From Log Debug Class";

    public static void logD(String logText){
        Log.d(TAG, logText);
    }
}
