package com.example;

import com.example.json.Example;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.stream.JsonReader;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;

public class Application {
    public static void main(String[] args) throws IOException {
        String path = Application.class.getResource("/json.json").getFile();
        String json = Files.readString(Path.of(path));
        Example example = new Gson().fromJson(json, Example.class);
        System.out.println("o = " + example);
    }
}
