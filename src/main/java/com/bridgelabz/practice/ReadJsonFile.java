package com.bridgelabz.practice;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

class Details{
    private String name;
    private String email;

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email=email;
    }

}
public class ReadJsonFile {
    public static void main(String[] args) throws IOException {
        ObjectMapper mapper=new ObjectMapper(); //read json and convert it to java
        Details user=mapper.readValue(new File("C:\\Users\\Manvi\\Desktop\\bridgelabz-workspace\\java-json-handling\\src\\main\\java\\com\\bridgelabz\\practice\\user.json"),Details.class);

        System.out.println("Name: "+user.getName());
        System.out.println("Email: "+user.getEmail());
    }
}
