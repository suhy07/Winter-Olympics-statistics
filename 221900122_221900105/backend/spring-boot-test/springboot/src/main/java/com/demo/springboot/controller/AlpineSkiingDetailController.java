package com.demo.springboot.controller;


import com.demo.springboot.service.DetailService;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;


import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;

import com.demo.springboot.bean.*;
import com.alibaba.fastjson.*;

@RestController
@RequestMapping("api/alpine-skiing-detail")  //再加一层路径
public class AlpineSkiingDetailController {

    @Autowired
    DetailService detailService;

    /////////////////////////////////////
    //  "title": "女子大回转第一轮",    "venuename": "国家高山滑雪中心",  "startdatecn": "2022-02-07 09:30:00",
    //       "itemcodename": "高山滑雪",

    @ResponseBody
    @RequestMapping("/title")
    public String DetailTitleService(@RequestParam(name = "documentcode") String documentcode) {
        // 处理date



        //
        String result=null;
        String json=null;
        String url = "jdbc:mysql://47.98.173.217:3306/winter-olympics-statistics";
        String username = "winter-olympics-statistics";
        String password = "Test@123456ZXC";
        Connection conn = null;
        String temStr=null;
//2.获取与数据库的链接
        try {
            conn = DriverManager.getConnection(url, username, password);
            Statement st = null;
//3.获取用于向数据库发送sql语句的statement
            String str="四人雪车第4轮";
            st = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);

//4.向数据库发sql
            String sql ="select * from detail where documentcode ="+"'"+documentcode+"'";

            System.out.print(sql); System.out.print('\n');
            ResultSet rs = null;

            rs = st.executeQuery(sql);
            temStr = documentcode;
            OkHttpClient client = new OkHttpClient().newBuilder()
                    .build();
            Request request = new Request.Builder()
                    .url("https://api.cntv.cn/olympic/getBjOlyMatch?t=jsonp&cb=cbGetScheduleInfo&serviceId=2022dongao&id="+temStr)
                    .method("GET", null)
                    .build();
            try {
                Response response = client.newCall(request).execute();
                result=response.body().string();
            } catch (IOException e) {
                e.printStackTrace();
            }



        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }





        System.out.print(result);

        return result;
    }


    ////////////////////////////////////


    /////////////////////////////////////
    // "Order": "1"  这个是顺序不是号码，Bib是号码    "Bib": "38" "AthleteName": "马什梅耶"  "Rank": "2"
    // "NocName": "意大利" "CompetitorName": "费代丽卡·布里尼奥内"  "UnitName": "女子大回转第一轮",
    // "Order": "1",  "Result": "57.98" "Order": "2","Result": "57.99"  "Result": "1:55.97" (总成绩)

    @ResponseBody
    @RequestMapping("/people")
    public String DetailPeopleService(@RequestParam(name = "documentcode") String documentcode) {
        // 处理date


 //
        //
        String result=null;
        String json=null;
        String url = "jdbc:mysql://47.98.173.217:3306/winter-olympics-statistics";
        String username = "winter-olympics-statistics";
        String password = "Test@123456ZXC";
        Connection conn = null;
        String temStr=null;
//2.获取与数据库的链接
        try {
            conn = DriverManager.getConnection(url, username, password);
            Statement st = null;
//3.获取用于向数据库发送sql语句的statement
            String str="四人雪车第4轮";
            st = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);

//4.向数据库发sql
            String sql ="select * from detail where documentcode ="+"'"+documentcode+"'";

            System.out.print(sql); System.out.print('\n');
            ResultSet rs = null;
            temStr = documentcode;
            String Surl="https://api.cntv.cn/olympic/getBjOlyDtResult?code="+temStr+"&serviceId=2022dongao&type=DT_START_LIST&t=jsonp&cb=cbGetStartList";
//https://api.cntv.cn/olympic/getBjOlyDtResult?code=ALPWGS----------------FNL-000100--&serviceId=2022dongao&type=DT_START_LIST&t=jsonp&cb=cbGetStartList
            rs = st.executeQuery(sql);

            OkHttpClient client = new OkHttpClient().newBuilder()
                    .build();
            Request request = new Request.Builder()
                    .url(Surl)
                    .method("GET", null)
                    .build();
            try {
                Response response = client.newCall(request).execute();
                result=response.body().string();
            } catch (IOException e) {
                e.printStackTrace();
            }


        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }


        System.out.print(result);

        return result;
    }

    ////////////////////////////////////


}


