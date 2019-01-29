package com.internousdev.testec.action;

import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

class Info {
    public String name;
    public int age;
    public int itemPrice;
}

public class Index {

    public static void main(String[] args) {
        Info info = new Info();
        info.name = "item1";
        info.age = 30;
        info.itemPrice = 300;

        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        try {
            String script = mapper.writeValueAsString(info);
            System.out.println(script);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
