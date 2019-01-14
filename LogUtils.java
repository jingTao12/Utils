import android.util.Log;


public class LogUtils {
    public static final boolean isDebug = true;//可以在application的onCreate（）中初始化
    private static String TAG = "ida";

    public static void i(String msg) {//info 信息
        if (isDebug) {
            Log.i(TAG, msg);
        }
    }
    public static void e(String msg) {//error 错误
        if (isDebug) {
            Log.e(TAG, msg);
        }
    }
    public static void d(String msg) {//debug 调试
        if (isDebug) {
            Log.d(TAG, msg);
        }
    }
    public static void w(String msg) {//warn 警告
        if (isDebug) {
            Log.w(TAG, msg);
        }
    }
    // 自己定义的tag
    public static void i(String tag,String msg) {//info
        if (isDebug) {
            Log.i(tag, msg);
        }
    }
    public static void e(String tag,String msg) {//error
        if (isDebug) {
            Log.e(tag, msg);
        }
    }
    public static void d(String tag,String msg) {//debug
        if (isDebug) {
            Log.d(tag, msg);
        }
    }
    public static void w(String tag,String msg) {//warn
        if (isDebug) {
            Log.w(tag, msg);
        }
    }
}

​
