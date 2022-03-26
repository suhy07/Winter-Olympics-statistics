package com.demo.springboot.controller;
import com.demo.springboot.service.MedalService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.sql.*;
import java.util.ArrayList;

import com.demo.springboot.bean.*;
import com.alibaba.fastjson.*;

@RestController
@RequestMapping("/api/medal-map")  //再加一层路径
public class MedalmapController {

    @Autowired
    MedalService medalService;


    /////////////////////////////////////
    @ResponseBody
    @RequestMapping("/data")
    public String MedalService(){


        MedalmapData medalmapData=new MedalmapData();
        ArrayList<Medalmap>  temp=new ArrayList<>();
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
                Medalmap medalmap=new Medalmap();
                medalmap.setName(rs.getString("countryname"));
                medalmap.setAbbr(rs.getString("countryid"));
                medalmap.setRank(rs.getInt("rank"));
                medalmap.setGold(rs.getInt("gold"));
                medalmap.setSilver(rs.getInt("silver"));
                medalmap.setCopper(rs.getInt("bronze"));
                medalmap.setValue(rs.getInt("count"));

                temp.add(medalmap);
                count++;
            }
            medalmapData.setMedalmapList(temp);

            json=JSON.toJSONString(medalmapData);


        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }




        return json;
    }



}


