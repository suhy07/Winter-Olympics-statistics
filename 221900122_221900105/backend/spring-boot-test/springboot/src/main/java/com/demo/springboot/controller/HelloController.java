package com.demo.springboot.controller;

import com.demo.springboot.bean.Detail;
import com.demo.springboot.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.*;

import com.alibaba.fastjson.*;

@RestController
@RequestMapping("/api")  //再加一层路径
public class HelloController {

    @Autowired
    HelloService helloService;

    @ResponseBody
    @RequestMapping("/hello/{name}/{age}")  //控制路径
    public String hello(@PathVariable("age") String name, @PathVariable("name") int age) {  // hello?name=3
        return "hello "+ name+" your age is"+age;
    }
/////////////////////////////////////
    @ResponseBody
    @RequestMapping("/service")
    public String helloService(@RequestParam(name = "date") String date) {
        // 处理date
        String aimdate="2022-02-"+date;

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
            String sql ="select * from detail where startdatecn ="+"'"+aimdate+"'";
            System.out.print(sql);
            ResultSet rs = null;

            rs = st.executeQuery(sql);
            rs.next();
//5.取出结果集的数据
//            rs.afterLast();
//            rs.previous();
            // System.out.println("title=" + rs.getObject("title"));


            //}
            Detail detail=new Detail();
            temStr = rs.getString("documentcode");
            detail.setAdcode(rs.getString("adcode"));
            detail.setAlbumurl(rs.getString("albumurl"));
            detail.setAwaycode(rs.getString("awaycode"));
            detail.setAwayid(rs.getString("awayid"));
            detail.setAwayname(rs.getString("awayname"));
            detail.setAwayscore(rs.getString("awayscore"));
            detail.setCombatflag(rs.getString("combatflag"));
            detail.setDeletedflag(rs.getString("deletedflag"));
            detail.setDocumentcode(rs.getString("documentcode"));
            detail.setEnddatecn(rs.getString("enddatecn"));
            detail.setH5pageid(rs.getString("h5pageid"));
            detail.setHomecode(rs.getString("homecode"));
            detail.setHomeid(rs.getString("homeid"));
            detail.setHomename(rs.getString("homename"));
            detail.setHomescore(rs.getString("homescore"));
            detail.setId(rs.getString("id"));
            detail.setImageurl(rs.getString("imageurl"));
            detail.setItemcode(rs.getString("itemcode"));
            detail.setItemcodename(rs.getString("itemcodename"));
            detail.setLivecode(rs.getString("livecode"));
            detail.setLiveurl(rs.getString("liveurl"));
            detail.setLockflag(rs.getString("lockflag"));
            detail.setMedal(rs.getString("medal"));
            detail.setMvlivecode(rs.getString("mvlivecode"));
            detail.setMvliveurl(rs.getString("mvliveurl"));
            detail.setPageid(rs.getString("pageid"));
            detail.setReserve1(rs.getString("reserve1"));
            detail.setReserve2(rs.getString("reserve2"));
            detail.setReserve3(rs.getString("reserve3"));
            detail.setStartdatecn(rs.getString("startdatecn"));
            detail.setStatus(rs.getString("status"));
            detail.setStatusname(rs.getString("statusname"));
            detail.setSubitemcode(rs.getString("subitemcode"));
            detail.setSubitemname(rs.getString("subitemname"));
            detail.setTitle(rs.getString("title"));
            detail.setTotalguid(rs.getString("totalguid"));
            detail.setTotaltitle(rs.getString("totaltitle"));
            detail.setTotalurl(rs.getString("totalurl"));
            detail.setVenue(rs.getString("venue"));
            detail.setVenuename(rs.getString("venuename"));
            detail.setVrlivecode(rs.getString("vrlivecode"));
            detail.setVrliveurl(rs.getString("vrliveurl"));
            detail.setVrtotalcode(rs.getString("vrtotalcode"));
            detail.setVrtotalurl(rs.getString("vrtotalurl"));

            json=JSON.toJSONString(detail);
            System.out.print("chenvense\n");
            System.out.print(json);


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
    @ResponseBody
    @GetMapping("/json")
    public String export() throws IOException {
         String filename = "./springboot/data/data/total.json";
         String s;
         StringBuffer stringBuffer = new StringBuffer("");
         BufferedReader bufferedReader = new BufferedReader(new FileReader(filename));
         while((s=bufferedReader.readLine()) != null) {
             stringBuffer.append(s);
         }
         bufferedReader.close();
//         return stringBuffer.toString();
        return "cbGetScheduleInfo({\"data\":{\"homecode\":\"\",\"homescore\":\"\",\"venue\":\"YSC\",\"lockflag\":\"0\",\"vrtotaltitle\":\"\",\"venuename\":\"\\u56fd\\u5bb6\\u96ea\\u8f66\\u96ea\\u6a47\\u4e2d\\u5fc3\",\"awayname\":\"\",\"totaltitle\":\"\",\"startdatecn\":\"2022-02-20 11:20:00\",\"vrtotalcode\":\"\",\"awayid\":\"\",\"vrliveurl\":\"\",\"title\":\"\\u56db\\u4eba\\u96ea\\u8f66\\u7b2c4\\u8f6e\",\"pageid\":\"bobsleigh\",\"vrtotalurl\":\"\",\"combatflag\":\"0\",\"vrlivecode\":\"\",\"mvliveurl\":\"\",\"mvlivecode\":\"\",\"enddatecn\":\"2022-02-20 12:10:00\",\"medal\":\"1\",\"id\":\"OGMM164249724175910048\",\"livecode\":\"\",\"itemcodename\":\"\\u96ea\\u8f66\",\"subitemname\":\"\\u56db\\u4eba\\u96ea\\u8f66\",\"adcode\":\"\",\"deletedflag\":\"0\",\"reserve1\":\"startlist\",\"statusname\":\"\\u7ed3\\u675f\",\"reserve3\":\"\",\"reserve2\":\"CHN\",\"totalguid\":\"\",\"awaycode\":\"\",\"awayscore\":\"\",\"albumurl\":\"\",\"tabList\":[],\"subitemcode\":\"BOBOTEAM4-------------------------\",\"itemcode\":\"BOB-------------------------------\",\"imageurl\":\"\",\"homename\":\"\",\"totalurl\":\"\",\"homeid\":\"\",\"h5pageid\":\"\",\"documentcode\":\"BOBOTEAM4-------------FNL-000400--\",\"status\":\"FINISHED\",\"liveurl\":\"\"}});\n";
    }
}


