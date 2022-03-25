package com.demo.springboot.controller;


import com.demo.springboot.service.MedalService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.sql.*;
import java.util.ArrayList;

import com.demo.springboot.bean.*;
import com.alibaba.fastjson.*;

@RestController
@RequestMapping("/api/Medal")  //再加一层路径
public class MedalController {

    @Autowired
    MedalService medalService;


    /////////////////////////////////////
    @ResponseBody
    @RequestMapping("/data")
    public String MedalService(){


        MedalData medalData=new MedalData();
        ArrayList<Medal>  temp=new ArrayList<>();
        int count=0;
        //
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
            st = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);

//4.向数据库发sql
            String sql ="select * from total";

            System.out.print(sql);
            ResultSet rs = null;

            rs = st.executeQuery(sql);

//5.取出结果集的数据
//            rs.afterLast();
//            rs.previous();
            // System.out.println("title=" + rs.getObject("title"));


            //}
            while( rs.next())
            {
                Medal medal=new Medal();
                medal.setBronze(rs.getString("bronze"));
                medal.setCount(rs.getString("count"));
                medal.setCountryid(rs.getString("countryid"));
                medal.setCountryname(rs.getString("countryname"));
                medal.setGold(rs.getString("gold"));
                medal.setRank(rs.getString("rank"));
                medal.setSilver(rs.getString("silver"));

                temp.add(medal);
                count++;
            }
            medalData.setMedalList(temp);
            medalData.setNum(count);
            json=JSON.toJSONString(medalData);


        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

//        OkHttpClient client = new OkHttpClient().newBuilder()
//                .build();
//        Request request = new Request.Builder()
//                .url("https://api.cntv.cn/Olympic/getBjOlyMatch?t=jsonp&cb=cbGetScheduleInfo&serviceId=2022dongao&id="+temStr)
//                .method("GET", null)
//                .build();
//        try {
//            Response response = client.newCall(request).execute();
//            // System.out.print(response.body().string());
//        } catch (IOException e) {
//            e.printStackTrace();
//        }


        return json;
    }



}


