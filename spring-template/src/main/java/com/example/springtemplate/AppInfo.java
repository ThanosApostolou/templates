package com.example.springtemplate;

import java.time.LocalDateTime;

public class AppInfo {
    public String startDatetime = "";

    public static AppInfo create() {
        AppInfo appinfo = new AppInfo();
        appinfo.startDatetime = LocalDateTime.now().toString();
        return appinfo;
    }
}
