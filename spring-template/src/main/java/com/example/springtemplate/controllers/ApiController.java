package com.example.springtemplate.controllers;

import com.example.springtemplate.App;
import com.example.springtemplate.AppInfo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {
    @GetMapping("/api")
    AppInfo GET() {
        return App.getInstance().appinfo;
    }
}
