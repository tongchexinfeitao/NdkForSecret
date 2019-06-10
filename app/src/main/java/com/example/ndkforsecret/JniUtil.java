package com.example.ndkforsecret;

public class JniUtil {
    // 加载原生库,库名由CMakeLists.txt可知
    static {
        System.loadLibrary("HelloJni");
    }

    public native static String getMyName();

    public native static int add(int first , int second);
}
