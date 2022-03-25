package com.demo.springboot.controller;

import com.demo.springboot.bean.Schedule;
import com.demo.springboot.service.ScheduleService;
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
@RequestMapping("/api/schedule")  //再加一层路径
public class ScheduleController {

    @Autowired
    ScheduleService scheduleService;


/////////////////////////////////////
    @ResponseBody
    @RequestMapping("/date")
    public String helloService(@RequestParam(name = "date") String date) {
        // 处理date
        String aimdate="2022-02-"+date+" 00:00:00";
        String aimdate1="2022-02-"+date+" 23:59:59";

        ScheduleData scheduleData =new ScheduleData();
        ArrayList<Schedule>  temp=new ArrayList<>();
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
            String str="四人雪车第4轮";
            st = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);

//4.向数据库发sql
            String sql ="select * from detail where startdatecn >="+"'"+aimdate+"'"+"and startdatecn<="+"'"+aimdate1+"'";

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
                Schedule schedule =new Schedule();
                temStr = rs.getString("documentcode");
                schedule.setAdcode(rs.getString("adcode"));
                schedule.setAlbumurl(rs.getString("albumurl"));
                schedule.setAwaycode(rs.getString("awaycode"));
                schedule.setAwayid(rs.getString("awayid"));
                schedule.setAwayname(rs.getString("awayname"));
                schedule.setAwayscore(rs.getString("awayscore"));
                schedule.setCombatflag(rs.getString("combatflag"));
                schedule.setDeletedflag(rs.getString("deletedflag"));
                schedule.setDocumentcode(rs.getString("documentcode"));
                schedule.setEnddatecn(rs.getString("enddatecn"));
                schedule.setH5pageid(rs.getString("h5pageid"));
                schedule.setHomecode(rs.getString("homecode"));
                schedule.setHomeid(rs.getString("homeid"));
                schedule.setHomename(rs.getString("homename"));
                schedule.setHomescore(rs.getString("homescore"));
                schedule.setId(rs.getString("id"));
                schedule.setImageurl(rs.getString("imageurl"));
                schedule.setItemcode(rs.getString("itemcode"));
                schedule.setItemcodename(rs.getString("itemcodename"));
                schedule.setLivecode(rs.getString("livecode"));
                schedule.setLiveurl(rs.getString("liveurl"));
                schedule.setLockflag(rs.getString("lockflag"));
                schedule.setMedal(rs.getString("medal"));
                schedule.setMvlivecode(rs.getString("mvlivecode"));
                schedule.setMvliveurl(rs.getString("mvliveurl"));
                schedule.setPageid(rs.getString("pageid"));
                schedule.setReserve1(rs.getString("reserve1"));
                schedule.setReserve2(rs.getString("reserve2"));
                schedule.setReserve3(rs.getString("reserve3"));
                schedule.setStartdatecn(rs.getString("startdatecn"));
                schedule.setStatus(rs.getString("status"));
                schedule.setStatusname(rs.getString("statusname"));
                schedule.setSubitemcode(rs.getString("subitemcode"));
                schedule.setSubitemname(rs.getString("subitemname"));
                schedule.setTitle(rs.getString("title"));
                schedule.setTotalguid(rs.getString("totalguid"));
                schedule.setTotaltitle(rs.getString("totaltitle"));
                schedule.setTotalurl(rs.getString("totalurl"));
                schedule.setVenue(rs.getString("venue"));
                schedule.setVenuename(rs.getString("venuename"));
                schedule.setVrlivecode(rs.getString("vrlivecode"));
                schedule.setVrliveurl(rs.getString("vrliveurl"));
                schedule.setVrtotalcode(rs.getString("vrtotalcode"));
                schedule.setVrtotalurl(rs.getString("vrtotalurl"));
                temp.add(schedule);
                count++;
            }
            scheduleData.setDetailList(temp);
            scheduleData.setNum(count);
            json=JSON.toJSONString(scheduleData);



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








    ////////////////////////////////////

    /////////////////////////////////////
    @ResponseBody
    @RequestMapping("/place")
    public String DetailPlaceService(@RequestParam(name = "place") String place) {
        // 处理date


        ScheduleData scheduleData =new ScheduleData();
        ArrayList<Schedule>  temp=new ArrayList<>();
        int count=0;
        //
        String json=null;
        String url = "jdbc:mysql://47.98.173.217:3306/winter-olympics-statistics";
        String username = "winter-olympics-statistics";
        String password = "Test@123456ZXC";
        Connection conn = null;
        String temStr=place;
//2.获取与数据库的链接
        try {
            conn = DriverManager.getConnection(url, username, password);
            Statement st = null;
//3.获取用于向数据库发送sql语句的statement
            String str="四人雪车第4轮";
            st = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);

//4.向数据库发sql
            String sql ="select * from detail where venuename ="+"'"+temStr+"'";

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
                Schedule schedule =new Schedule();
                temStr = rs.getString("documentcode");
                schedule.setAdcode(rs.getString("adcode"));
                schedule.setAlbumurl(rs.getString("albumurl"));
                schedule.setAwaycode(rs.getString("awaycode"));
                schedule.setAwayid(rs.getString("awayid"));
                schedule.setAwayname(rs.getString("awayname"));
                schedule.setAwayscore(rs.getString("awayscore"));
                schedule.setCombatflag(rs.getString("combatflag"));
                schedule.setDeletedflag(rs.getString("deletedflag"));
                schedule.setDocumentcode(rs.getString("documentcode"));
                schedule.setEnddatecn(rs.getString("enddatecn"));
                schedule.setH5pageid(rs.getString("h5pageid"));
                schedule.setHomecode(rs.getString("homecode"));
                schedule.setHomeid(rs.getString("homeid"));
                schedule.setHomename(rs.getString("homename"));
                schedule.setHomescore(rs.getString("homescore"));
                schedule.setId(rs.getString("id"));
                schedule.setImageurl(rs.getString("imageurl"));
                schedule.setItemcode(rs.getString("itemcode"));
                schedule.setItemcodename(rs.getString("itemcodename"));
                schedule.setLivecode(rs.getString("livecode"));
                schedule.setLiveurl(rs.getString("liveurl"));
                schedule.setLockflag(rs.getString("lockflag"));
                schedule.setMedal(rs.getString("medal"));
                schedule.setMvlivecode(rs.getString("mvlivecode"));
                schedule.setMvliveurl(rs.getString("mvliveurl"));
                schedule.setPageid(rs.getString("pageid"));
                schedule.setReserve1(rs.getString("reserve1"));
                schedule.setReserve2(rs.getString("reserve2"));
                schedule.setReserve3(rs.getString("reserve3"));
                schedule.setStartdatecn(rs.getString("startdatecn"));
                schedule.setStatus(rs.getString("status"));
                schedule.setStatusname(rs.getString("statusname"));
                schedule.setSubitemcode(rs.getString("subitemcode"));
                schedule.setSubitemname(rs.getString("subitemname"));
                schedule.setTitle(rs.getString("title"));
                schedule.setTotalguid(rs.getString("totalguid"));
                schedule.setTotaltitle(rs.getString("totaltitle"));
                schedule.setTotalurl(rs.getString("totalurl"));
                schedule.setVenue(rs.getString("venue"));
                schedule.setVenuename(rs.getString("venuename"));
                schedule.setVrlivecode(rs.getString("vrlivecode"));
                schedule.setVrliveurl(rs.getString("vrliveurl"));
                schedule.setVrtotalcode(rs.getString("vrtotalcode"));
                schedule.setVrtotalurl(rs.getString("vrtotalurl"));
                temp.add(schedule);
                count++;
            }
            scheduleData.setDetailList(temp);
            scheduleData.setNum(count);
            json=JSON.toJSONString(scheduleData);



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








    ////////////////////////////////////


    /////////////////////////////////////
    @ResponseBody
    @RequestMapping("/item")
    public String DetailItemService(@RequestParam(name = "item") String item) {
        // 处理date


        ScheduleData scheduleData =new ScheduleData();
        ArrayList<Schedule>  temp=new ArrayList<>();
        int count=0;
        //
        String json=null;
        String url = "jdbc:mysql://47.98.173.217:3306/winter-olympics-statistics";
        String username = "winter-olympics-statistics";
        String password = "Test@123456ZXC";
        Connection conn = null;
        String temStr=item;
//2.获取与数据库的链接
        try {
            conn = DriverManager.getConnection(url, username, password);
            Statement st = null;
//3.获取用于向数据库发送sql语句的statement
            String str="四人雪车第4轮";
            st = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);

//4.向数据库发sql
            String sql ="select * from detail where itemcodename ="+"'"+temStr+"'";

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
                Schedule schedule =new Schedule();
                temStr = rs.getString("documentcode");
                schedule.setAdcode(rs.getString("adcode"));
                schedule.setAlbumurl(rs.getString("albumurl"));
                schedule.setAwaycode(rs.getString("awaycode"));
                schedule.setAwayid(rs.getString("awayid"));
                schedule.setAwayname(rs.getString("awayname"));
                schedule.setAwayscore(rs.getString("awayscore"));
                schedule.setCombatflag(rs.getString("combatflag"));
                schedule.setDeletedflag(rs.getString("deletedflag"));
                schedule.setDocumentcode(rs.getString("documentcode"));
                schedule.setEnddatecn(rs.getString("enddatecn"));
                schedule.setH5pageid(rs.getString("h5pageid"));
                schedule.setHomecode(rs.getString("homecode"));
                schedule.setHomeid(rs.getString("homeid"));
                schedule.setHomename(rs.getString("homename"));
                schedule.setHomescore(rs.getString("homescore"));
                schedule.setId(rs.getString("id"));
                schedule.setImageurl(rs.getString("imageurl"));
                schedule.setItemcode(rs.getString("itemcode"));
                schedule.setItemcodename(rs.getString("itemcodename"));
                schedule.setLivecode(rs.getString("livecode"));
                schedule.setLiveurl(rs.getString("liveurl"));
                schedule.setLockflag(rs.getString("lockflag"));
                schedule.setMedal(rs.getString("medal"));
                schedule.setMvlivecode(rs.getString("mvlivecode"));
                schedule.setMvliveurl(rs.getString("mvliveurl"));
                schedule.setPageid(rs.getString("pageid"));
                schedule.setReserve1(rs.getString("reserve1"));
                schedule.setReserve2(rs.getString("reserve2"));
                schedule.setReserve3(rs.getString("reserve3"));
                schedule.setStartdatecn(rs.getString("startdatecn"));
                schedule.setStatus(rs.getString("status"));
                schedule.setStatusname(rs.getString("statusname"));
                schedule.setSubitemcode(rs.getString("subitemcode"));
                schedule.setSubitemname(rs.getString("subitemname"));
                schedule.setTitle(rs.getString("title"));
                schedule.setTotalguid(rs.getString("totalguid"));
                schedule.setTotaltitle(rs.getString("totaltitle"));
                schedule.setTotalurl(rs.getString("totalurl"));
                schedule.setVenue(rs.getString("venue"));
                schedule.setVenuename(rs.getString("venuename"));
                schedule.setVrlivecode(rs.getString("vrlivecode"));
                schedule.setVrliveurl(rs.getString("vrliveurl"));
                schedule.setVrtotalcode(rs.getString("vrtotalcode"));
                schedule.setVrtotalurl(rs.getString("vrtotalurl"));
                temp.add(schedule);
                count++;
            }
            scheduleData.setDetailList(temp);
            scheduleData.setNum(count);
            json=JSON.toJSONString(scheduleData);



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








    ////////////////////////////////////





}


