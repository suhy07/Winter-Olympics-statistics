package com.demo.springboot.controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class test {
    public static void main(String[] args) {
        String result="cbGetStartList({dafdaf});" ;
        int first= result.indexOf('(');

        StringBuffer s1=new StringBuffer(result);
        StringBuffer s2=new StringBuffer();
        s2=s1.replace(0,first+1,"");
        String s3=s2.toString();
        int last=s3.lastIndexOf(';');
        System.out.print(s3); System.out.print('\n');
       StringBuffer s4=new StringBuffer(s3);
       s2 = s4.replace(last-1,last+1,"");
       System.out.print(s2);
//        String filename = "./springboot/total.json";
////        File file=new File("test.txt");
////        try {
////            file.createNewFile();
////        } catch (IOException e) {
////            e.printStackTrace();
////        }
//        String s;
//        StringBuffer stringBuffer = new StringBuffer("");
//        try{
//            BufferedReader bufferedReader = new BufferedReader(new FileReader(filename));
//            while((s=bufferedReader.readLine()) != null) {
//                stringBuffer.append(s);
//            }
//            System.out.println(stringBuffer);
//            bufferedReader.close();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }


    }
}
