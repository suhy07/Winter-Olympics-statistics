## 作业基本信息
|这个作业属于哪个课程|[2022年福大-软件工程;软件工程实践-W班](https://bbs.csdn.net/forums/se-se_practice)|
|--    |--    |
|这个作业要求在哪里|[软件工程实践结对作业二](https://bbs.csdn.net/topics/605307940)
|结对学号|221900122 22900105|
|这个作业的目标|完成冬奥会网站的开发 部署云端服务器 NABCD模型分析|
|其他参考文献|各大博客网站|

@[toc]
### 1、仓库链接和代码规范链接
>[冬奥统计--网页展示](https://suhy07.github.io/Pairing-operation)
>[冬奥统计--项目资源及原型仓库](https://github.com/suhy07/Pairing-operation.git)
>[冬奥统计--gitcode镜像仓库](https://gitcode.net/qq_45815609/pairproject/)
>[后端代码规范](https://gitcode.net/qq_45815609/pairproject/-/blob/dev-backend/221900122_221900105/backend/codestyle.md)
### 2、PSP表格

<table>
    <thead>
        <tr>
            <th>PSP</th>
            <th>Personal Software Process Stages</th>
            <th>预估耗时（分钟）</th>
            <th>实际耗时（分钟）</th>
        </tr>
    </thead>
    <tbody>
        <tr>
            <td>Planning</td>
            <td><b>计划</b></td>
            <td>34</td><td>45</td>
        </tr>
        <tr><td>• Estimate</td>
            <td>• 估计这个任务需要多少时间</td>
            <td>11</td>
            <td>13</td>
        </tr>
        <tr><td>• Division of tasks</td>
            <td>• 任务分工</td>
            <td>13</td>
            <td>27</td>
        </tr>
        <tr>
            <td>Development</td>
            <td><b>开发</b></td>
            <td>796</td>
            <td>893</td>
        </tr>
        <tr>
            <td>• Analysis</td>
            <td>• 需求分析</td>
            <td>11</td>
            <td>14</td>
        </tr>
        <tr>
            <td>• Design</td>
            <td>• 界面初步设计</td>
            <td>10</td>
            <td>7</td>
        </tr>
        <tr>
            <td>• Pair discussion</td>
            <td>• 结对讨论</td>
            <td>20</td>
            <td>22</td>
        </tr>
        <tr>
            <td>• Frontend homepage design</td>
            <td>• 前端主页设计</td>
            <td>60</td>
            <td>83</td>
        </tr>
        <tr>
            <td>• Frontend medal list design </td>
            <td>• 前端奖牌总榜设计</td>
            <td>30</td>
            <td>23</td>
        </tr>
        <tr>
            <td>• Frontend detailed competition design</td>
            <td>• 前端详细赛况设计</td>
            <td>120</td>
            <td>181</td>
        </tr>
        <tr>
            <td>• Frontend medal map design</td>
            <td>• 前端奖牌地图设计</td>
            <td>80</td>
            <td>87</td>
        </tr>
         <tr>
            <td>• Backend medal board design </td>
            <td>• 后端奖牌榜设计</td>
            <td>67</td>
            <td>79</td>
        </tr>
           <tr>
            <td>• Backend daily schedule design </td>
            <td>• 后端每日赛程设计</td>
            <td>97</td>
            <td>109</td>
        </tr>
          <tr>
            <td>• Backend detailed competition design </td>
            <td>• 后端详细赛况设计</td>
            <td>88</td>
            <td>67</td>
        </tr>
        <tr>
            <td>Reporting</td>
            <td><b>报告</b></td>
            <td>45</td>
            <td>57</td>
        </tr>
        <tr>
            <td>• Summary and evaluation</td>
            <td>• 总结评价</td>
            <td>15</td>
            <td>15</td>
        </tr>
        <tr>
            <td></td>
            <td>合计</td>
            <td>1457</td>
            <td>1715</td>
        </tr>
    </tbody>
</table>

### 3、成品展示
>><b>每日赛程</b>
>>
>>展示各项目的详细赛程，显示比赛时间、大项名称、比赛名称、场馆等信息
>>支持通过选择、切换比赛日期、项目、场馆的形式来筛选用户希望查看的赛程
>>支持点击查看详细赛况
>
>><b>详细赛况</b>
>>
>>展示单项比赛的成绩公报，包含对应项目的参赛选手、得分、排行等比赛数据
>>（因为不同项目的成绩形式不一样，可挑选至少3个你感兴趣的小项目来进行界面设计，例如：高山滑雪-女子滑降）
>
>><b>奖牌地图</b>
>>
>>以世界地图的形式直观地展示各个参赛国家的奖牌数
>>在地图上使用不同的颜色代表大致的奖牌数区间，颜色深浅表示奖牌数的多少
>>鼠标点击或移动到每个国家会高亮显示奖牌信息
>


### 4、结对讨论过程描述
##### 4.1 结对过程

> 前期我们使用腾讯QQ聊天交流进行了简单的任务分工和探索，并制作PSP表格，以及接着建立了git仓库。
> 
> ![初期交流](https://img-blog.csdnimg.cn/img_convert/c97d21c022bedc6bed58799b085905b3.png)
> <center>分工与建仓库截图</center>
> 
> 接着我们讨论了需要的数据结构，最终采取json格式，并确认json各字段大概是什么。
> ![git仓库](https://img-blog.csdnimg.cn/img_convert/98537752d5643b513e9f7c78a091727b.png)
><center>数据结构的交流</center>
>
> [外链图片转存失败,源站可能有防盗链机制,建议将图片保存下来直接上传(img-Ms5VcuYp-1648228143863)(https://i.niupic.com/images/2022/03/26/9XhB.png)]
><center>Axure Cloud</center>
>
>根据日期筛选赛程的测试
>
>![commit](https://img-blog.csdnimg.cn/img_convert/7933de09f12f94e21f030cda67384a36.png)
><center>接口测试交流</center>
>![commit](https://img-blog.csdnimg.cn/img_convert/0e2263dc033e575fd80e4d9dce182dbe.png)
><center>commit详情2</center>
>![commit](https://img-blog.csdnimg.cn/img_convert/3474d12d41ed7e91802001c7d585b716.png)
><center>commit详情3</center>
##### 4.2.2 任务分工

>|任务项|负责成员|
>|--    |--    |
>|PSP表格|陈玮鑫|
>|需求分析|苏海元|
>|前端主页设计|苏海元|
>|前端奖牌榜设计|苏海元|
>|前端详细赛况设计|苏海元|
>|后端主页设计|陈玮鑫|
>|后端奖牌榜设计|陈玮鑫|
>|后端详细赛况设计|陈玮鑫|
>|设计复审|苏海元、陈玮鑫|
>|博文维护|陈玮鑫、苏海元|
>|思路分析及报告总结|苏海元、陈玮鑫|

##### 4.2.2 设计思路

###### 主页

>主页负责的功能经分析后定为：奖牌榜数目概览、冬奥新闻推送、标题栏导航、奖牌地图预览.
>顶头标题栏导航，直接使用Axure交互事件进行内部跳转实现。
>新闻推送里包含每日赛程功能，支持切换日期、项目、场馆的形式使用户能够直观筛选。这里使用动态面板设置日期、项目、场馆等多个状态，在其中嵌套中继器进行赛程内容展示。添加热区链接赛程对应的详细赛况，达到演示效果。
>奖牌地图和奖牌榜在后续组件制作完成后，适配至主页显示即可。

###### 奖牌地图

>
>奖牌地图要求能显示每个国家的奖牌信息，并且有渐变和高亮。此处我们首先在网络上寻找了世界地图的的svg文件，之后使用Axure将svg分割为图形得到各个国家的图形。
>之后设置每个国家的选中状态，并添加交互，使鼠标移入时变为选中，鼠标移出时取消选中，即可实现每个国家的选中效果。
>
>此处有一个小插曲，就在我们准备提交作业时，助教提醒我们中国地图很可能有问题。很庆幸在本此作业注意到了此地图问题，经检查，果然我们的地图中存在很大问题，后续采用绘图方案将我国地图补全（国家主权和领土圣神不可侵犯）。
>
>![重新绘制后的图片](https://img-blog.csdnimg.cn/c780d6b8a32749e59e0f38379d418e26.png#pic_center)
><center>重新绘制我国的藏南、南海领土</center>
>&nbsp;
>
>![这才是中国](https://img-blog.csdnimg.cn/701a69ea8bc046f0b5411d79dce46a9e.png?x-oss-process=image/watermark,type_d3F5LXplbmhlaQ,shadow_50,text_Q1NETiBAc3VoeTA3,size_17,color_FFFFFF,t_70,g_se,x_16#pic_center)
><center>这才是中国</center>
>&nbsp;

###### 冰球赛况
>    冰球赛况页面实现了以下功能：
>&nbsp;&nbsp;1.设置下拉选项卡，实现日期，项目筛选。
>&nbsp;&nbsp;2.设置页面跳转。
>&nbsp;&nbsp;3.嵌套中继器进行赛程详细内容展示。
>&nbsp;&nbsp;4.设置"冬奥统计"页面跳转，点击回到主页面。
###### 高山滑雪赛况
>    高山滑雪赛况页面实现了以下功能：
>&nbsp;&nbsp;1.设置下拉选项卡，实现日期，项目筛选。
>&nbsp;&nbsp;2.设置页面跳转。
>&nbsp;&nbsp;3.嵌套中继器进行赛程详细内容展示。
>&nbsp;&nbsp;4.设置"冬奥统计"页面跳转，点击回到主页面。
###### 速度滑冰赛况
>    速度滑冰赛况页面实现了以下功能：
>&nbsp;&nbsp;1.设置下拉选项卡，实现日期，项目筛选。
>&nbsp;&nbsp;2.设置页面跳转。
>&nbsp;&nbsp;3.嵌套中继器进行赛程详细内容展示。
>&nbsp;&nbsp;4.设置"冬奥统计"页面跳转，点击回到主页面。
>&nbsp;&nbsp;5.按照成绩排序。

###### 奖牌榜
>
>&nbsp;&nbsp;奖牌榜需要对各国奖牌情况进行展示，中国代表队需要高亮。这里设计好背景和标题栏之后，使用Axure的中继器将数据导入实现。这里有发现中继器展示的数据之间无法直接设置间隔，我们采用了在中继器中塞入空白组件，以达到margin的效果。最后将制作好的组件在主页进行重构。

#### 4.3 成果展示

###### 主页
>
>&nbsp;&nbsp;主页能够进行导航，预览展示奖牌榜信息，展示新闻轮播图，根据场馆等信息进行赛事筛选，并能点击跳转至详细页面。
>![主页动态](https://img-blog.csdnimg.cn/6e3fc5a2a8214f2fb3cc10f7ba7e06d7.gif#pic_center)
><center>主页动态展示</center>
>&nbsp;
>
>![主页](https://img-blog.csdnimg.cn/4da39822ddfb44978e1025fbc39d58d8.png?x-oss-process=image/watermark,type_d3F5LXplbmhlaQ,shadow_50,text_Q1NETiBAc3VoeTA3,size_20,color_FFFFFF,t_70,g_se,x_16#pic_center)
><center>主页展示</center>
>&nbsp;


###### 奖牌地图
>
>&nbsp;&nbsp;鼠标移入每个国家后，在地图上会高亮显示当前选中的国家，并展示该国家的信息
>![奖牌地图](https://img-blog.csdnimg.cn/6cf8038bb3064003a4fb61ff3908e64b.png?x-oss-process=image/watermark,type_d3F5LXplbmhlaQ,shadow_50,text_Q1NETiBAc3VoeTA3,size_20,color_FFFFFF,t_70,g_se,x_16#pic_center)
><center>奖牌地图</center>
>&nbsp;
>
>![动态](https://img-blog.csdnimg.cn/58e1b417d60c4757ac480aef3e9acf1e.gif#pic_center)
><center>奖牌地图动态展示</center>

###### 冰球赛况
>
>![冰球赛况](https://img-blog.csdnimg.cn/9afcd6f5c6e1446ebfee2edd0eed06d3.png?x-oss-process=image/watermark,type_d3F5LXplbmhlaQ,shadow_50,text_Q1NETiBAVmVuc2VDaGVu,size_20,color_FFFFFF,t_70,g_se,x_16#pic_center)
><center>冰球</center>
>&nbsp;
>
###### 高山滑雪赛况
>
>![高山滑雪赛况](https://img-blog.csdnimg.cn/d2021dad2dd94df6a1635e914f005779.png?x-oss-process=image/watermark,type_d3F5LXplbmhlaQ,shadow_50,text_Q1NETiBAVmVuc2VDaGVu,size_20,color_FFFFFF,t_70,g_se,x_16#pic_center)
><center>高山滑雪</center>
>&nbsp;
###### 速度滑冰赛况
>![速度滑冰赛况](https://img-blog.csdnimg.cn/4b037a54efff4aa2ba1af2f525f1132c.png?x-oss-process=image/watermark,type_d3F5LXplbmhlaQ,shadow_50,text_Q1NETiBAVmVuc2VDaGVu,size_20,color_FFFFFF,t_70,g_se,x_16#pic_center)
><center>速度滑冰</center>
>&nbsp;
###### 奖牌榜
>
>&nbsp;&nbsp;展示各个国家的奖牌数量,对中国代表团进行高亮
>
>![奖牌榜](https://img-blog.csdnimg.cn/a8a62dd9a8204cb5a75f123d9b03d280.png?x-oss-process=image/watermark,type_d3F5LXplbmhlaQ,shadow_50,text_Q1NETiBAc3VoeTA3,size_20,color_FFFFFF,t_70,g_se,x_16#pic_center)
><center>奖牌榜</center>
>&nbsp;

#### 5、设计实现过程
页面设计方面我们参考之前的原型设计开发，分为以下模块
1. 主页
2. 奖牌地图
3. 每日赛程
4. 详细赛况

前后端交互我们采用 vue+sprinboot开发，考虑数据持久化的要求，我们使用mysql存储数据，前端通过vue与向后端发送请求与数据，后端使用sprinboot 封装接口，处理前端请求，将数据库的数据封装成json发送给前端，数据得以显示在页面上。

###### 5.1 前端设计
>
>&nbsp;&nbsp;首次体验做原型设计，此次项目中学会了原型工具Axure的使用，设计过程中大量进行资料查找，且一直对原先的设计不满意，云端对原型进行版本管理后不断改进迭代，最后将成果发布至github.io。一次不错的原型设计实践。

###### 5.2 后端设计
######  5.2.1 后端数据库设计
>初期爬取json数据，对其分析发现字段数过大，于是采用navicat导入json数据，从而自动创建大量字段，减少了很多工作量
###### 5.2.2 后端数据接口设计
>对接前端队友的需求，创建所需要的类，为后续从数据库获取数据后，转换成json格式：
>1.奖牌榜数据接口: 利用jdbc语句从数据库将所有奖牌榜数据返回给前端
>2.每日赛程数据接口: 在对前端传入的参数预处理后，利用sql条件查询语句从数据库将所需的赛程数据返回给前端
>3.详细赛况数据接口: 由于每个项目页面不同，所需的数据也不同，故对接前端队友需求，创建相对应的控制类
###### 5.3 评价

#### 6、代码说明
######  后端主要代码

数据类，将数据库的每张表封装成类，方便后续转json。
``````
package com.demo.springboot.bean;
import com.demo.springboot.bean.Medal;
import java.util.ArrayList;
public class MedalData {
    public int getNum() {
        return num;
    }
    public void setNum(int num) {
        this.num = num;
    }
    private int num;
    public ArrayList<Medal> getMedalList() {
        return medalList;
    }
    public void setMedalList(ArrayList<Medal> medalList) {
        this.medalList=new ArrayList<>();
        for (Medal m:
                medalList) {
            this.medalList.add(m);
        }
    }
    private ArrayList<Medal> medalList;
}
``````

接口控制类，将前端的请求处理，返回目标数据得json
``````
@RestController
@RequestMapping("/api/medal")  //再加一层路径
public class MedalController {

    @Autowired
    MedalService medalService;
    @ResponseBody
    @RequestMapping("/data")
    public String MedalService(){
        MedalData medalData=new MedalData();
        ArrayList<Medal>  temp=new ArrayList<>();
        int count=0;
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
        return json;
    }
}

``````

#### 7、心路历程和收获
221900105：
>心路历程：万事开头难，一开始总是被配置各种依赖库折磨，后来在查询资料和救助同学后，慢慢走入正轨，后面开发也越来越熟练。

>收获：此次结对编程，让我更加明白合作的重要性，明确的分工能够很大的提高效率。同时队友也能提供很大的帮助。此次我负责后端编程，更加理解了前后端分离的意义以及如何实现，并对sprinboot有了相对更深的理解。


#### 8、评价结对队友
>
>suhy:玮鑫同学查找资料能力较为快速，初期找到了一些网页设计模板进行参考。对于项目的工作积极性也比较高，能快速完成我们分工的任务，结对时我们能相互进行学习。最后，和玮鑫同学分工合作，沟通交流顺利，项目完成顺利。
> 
>221900105陈玮鑫对221900122苏海元的评价：
>苏海元同学学习能力强大，仅仅只是阅览一段晦涩难懂的教程，在短时间内就能掌握一些相关组件的用法。初次之外，对于原型设计他总是能冒出一些好的点子，例如以图表展示国家排行榜，首页加上一些视频链接等等。海元同学的编程能力也相当不错，期待他在接下来实现过程之中的表现。