package com.example.springtemplate;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App {
	private static App instance = null;

    public AppInfo appinfo = null;

    public App() {
        App.instance = this;
        this.appinfo = AppInfo.create();
        System.out.println("STARTDATETIME " + this.appinfo.startDatetime);
    }

    public static App getInstance() {
        return App.instance;
    }
}
