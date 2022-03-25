package com.demo.springboot.controller;

import com.demo.springboot.bean.Schedule;
import com.demo.springboot.service.DetailService;
import com.demo.springboot.service.ScheduleService;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;

import com.demo.springboot.bean.*;
import com.alibaba.fastjson.*;

@RestController
@RequestMapping("/api/ice-ball-detail")  //再加一层路径
public class IceBallDetailController {

    @Autowired
    DetailService detailService;

    /////////////////////////////////////  比赛数据和小组赛上面那个 以及最终的大比分
    // "title": "女冰小组赛轮次 - A组"   "homename": "加拿大" "awayname": "瑞士"
    //    "startdatecn": "2022-02-03 12:10:00"  "homescore": "12"    "awayscore": "1"
    //    "venuename": "国家体育馆"
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
                .url("https://api.cntv.cn/Olympic/getBjOlyMatch?t=jsonp&cb=cbGetScheduleInfo&serviceId=2022dongao&id="+temStr)
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
    // "Order": "1"  这个是顺序不是号码，Bib是号码   "Position": "守门员"  "Bib": "38" "AthleteName": "马什梅耶"
    // "Competitor": "IHOWTEAM6---CAN01"   "Competitor": "IHOWTEAM6---SUI01"  一个Competitor是一个队
    //Order一个队是从1排到结束，可能要用到Competitor
    //"Noc": "CAN"  "NocName": "加拿大" "PPG": "2" （多打少） "FO": "28"（争球） "SOG": "70"（射门）
    //"Result": "12" (得分)  "PIM": "14" "SHG": "0" （短手进球）
    // "Code": "P1" （第一节） "HomePeriodScore": "3" （主场得分） "AwayPeriodScore": "0" （客场得分）
    // 默认所有加时点球都没有
    @ResponseBody
    @RequestMapping("/people")
    public String DetailPeopleService(@RequestParam(name = "documentcode") String documentcode) {
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
            temStr = documentcode;
            String Surl="https://api.cntv.cn/olympic/getBjOlyDtResult?code="+temStr+"&serviceId=2022dongao&type=DT_RESULT&t=jsonp&cb=cbGetResult";
//
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


