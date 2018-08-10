package com.example.mmcomp.texidriver;

import com.google.gson.GsonBuilder;

public class Gson {

    private static final com.google.gson.Gson instance = new GsonBuilder().create();

    // Private constructor prevents instantiation from other classes
    Gson() {
    }

    public static com.google.gson.Gson getInstance() {
        return instance;
    }
}
