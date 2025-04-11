package com.bridgelabz.practice;

import org.json.JSONArray;
import org.json.JSONObject;

public class CreateJsonObject {
    public static void main(String[] args) {
        JSONArray subjects=new JSONArray();
        subjects.put("Physics");
        subjects.put("Chemistry");
        subjects.put("Maths");

        JSONObject student=new JSONObject();
        student.put("name","vashu");
        student.put("age",17);
        student.put("subjects",subjects);

        System.out.println(student.toString(1));

    }
}
