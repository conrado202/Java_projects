package com.javafortesters.chap005testwithourownclasses.domainobject.examples;

public class TestAppEnv {

// Inicjalizacja metod statycznych, "final" - wartosc niemoze byc zmienona po tym jak zostala do niej przypisana wczessniej wartosc
    public static final String DOMAIN = "192.123.0.3";
    public static final String PORT = "67";

    public static String getUrl() {
        return "http://" + DOMAIN + ":" + PORT;
    }

}
