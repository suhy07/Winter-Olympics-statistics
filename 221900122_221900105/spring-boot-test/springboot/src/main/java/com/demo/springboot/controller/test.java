package com.demo.springboot.controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class test {
    public static void main(String[] args) {
        String filename = "./springboot/total.json";
//        File file=new File("test.txt");
//        try {
//            file.createNewFile();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        String s;
        StringBuffer stringBuffer = new StringBuffer("");
        try{
            BufferedReader bufferedReader = new BufferedReader(new FileReader(filename));
            while((s=bufferedReader.readLine()) != null) {
                stringBuffer.append(s);
            }
            System.out.println(stringBuffer);
            bufferedReader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
