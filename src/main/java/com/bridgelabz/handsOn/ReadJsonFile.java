package com.bridgelabz.handsOn;

import org.json.JSONObject;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Iterator;

public class ReadJsonFile {
    public static void main(String[] args) throws Exception {
        // Step 1: Read JSON file as String
        String content = new String(Files.readAllBytes(Paths.get("C:\\Users\\Manvi\\Desktop\\bridgelabz-workspace\\java-json-handling\\src\\main\\java\\com\\bridgelabz\\handsOn\\data.json")));

        // Step 2: Convert string to JSONObject
        JSONObject json = new JSONObject(content);

        // Step 3: Loop through keys
        Iterator<String> keys = json.keys();
        while (keys.hasNext()) {
            String key = keys.next();
            Object value = json.get(key);
            System.out.println("Key: " + key + ", Value: " + value);
        }
    }
}
