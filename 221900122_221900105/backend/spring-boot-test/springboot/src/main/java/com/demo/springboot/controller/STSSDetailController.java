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
@RequestMapping("api/stss-detail")  //再加一层路径
public class STSSDetailController {

    @Autowired
    DetailService detailService;

    /////////////////////////////////////
    //     "title": "女子500米预赛第1组",    "venuename": "国家高山滑雪中心",  "startdatecn": "2022-02-07 09:30:00",
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





        ////
        int first= result.indexOf('(');

        StringBuffer s1=new StringBuffer(result);
        StringBuffer s2=new StringBuffer();
        s2=s1.replace(0,first+1,"");
        String s3=s2.toString();
        int last=s3.lastIndexOf(';');
        StringBuffer s4=new StringBuffer(s3);
        s2 = s4.replace(last-1,last+1,"");
        result = s2.toString();

        ////

        return result;
    }



    ////////////////////////////////////


    /////////////////////////////////////
    //"CompetitorName": "苏珊娜·舒尔廷",   "NocName": "荷兰",
    // "Result": "42.379"
    // "Date": "2022-02-05",

    @ResponseBody
    @RequestMapping("/record")
    public String DetailRecordService(@RequestParam(name = "subitemcode") String subitemcode) {
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
            String sql ="select * from detail where subitemcode ="+"'"+subitemcode+"'";

            System.out.print(sql); System.out.print('\n');
            ResultSet rs = null;
            temStr = subitemcode;
            String Surl="https://api.cntv.cn/olympic/getBjOlyDtResult?code="+temStr+"&serviceId=2022dongao&type=DT_RECORD&t=jsonp&cb=cbGetRecord";
//https://api.cntv.cn/olympic/getBjOlyDtResult?code=STKW500M--------------------------&serviceId=2022dongao&type=DT_RECORD&t=jsonp&cb=cbGetRecord
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





        ////
        int first= result.indexOf('(');

        StringBuffer s1=new StringBuffer(result);
        StringBuffer s2=new StringBuffer();
        s2=s1.replace(0,first+1,"");
        String s3=s2.toString();
        int last=s3.lastIndexOf(';');
        StringBuffer s4=new StringBuffer(s3);
        s2 = s4.replace(last-1,last+1,"");
        result = s2.toString();

        ////

        return result;
    }



    ////////////////////////////////////


    /////////////////////////////////////
    // "Order": "1"  这个是顺序不是号码，Bib是号码    "Bib": "38" "AthleteName": "马什梅耶"  "Rank": "2"
    // "NocName": "意大利" "CompetitorName": "费代丽卡·布里尼奥内"
    //  "Result": "44.681"

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
            String Surl="https://api.cntv.cn/olympic/getBjOlyDtResult?code="+temStr+"&serviceId=2022dongao&type=DT_RESULT&t=jsonp&cb=cbGetResult";
//https://api.cntv.cn/olympic/getBjOlyDtResult?code=STKW500M--------------HEAT000100--&serviceId=2022dongao&type=DT_RESULT&t=jsonp&cb=cbGetResult
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


//




        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }




        ////
        int first= result.indexOf('(');

        StringBuffer s1=new StringBuffer(result);
        StringBuffer s2=new StringBuffer();
        s2=s1.replace(0,first+1,"");
        String s3=s2.toString();
        int last=s3.lastIndexOf(';');
        StringBuffer s4=new StringBuffer(s3);
        s2 = s4.replace(last-1,last+1,"");
        result = s2.toString();

        ////

        return result;
    }



    ////////////////////////////////////


}


