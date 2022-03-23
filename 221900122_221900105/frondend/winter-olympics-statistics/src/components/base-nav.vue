<template>
    <el-container class="nav_div">
      <el-row>
        <el-col :span="2">
            <img class="nav_img nav_img1" src="@/assets/北京2022.png">
            <img class="head_img nav_img2" src="@/assets/竖线.png">
        </el-col>
        <el-col :span="22">
            <div class="nav_text">
                <span class="nav_text1">奖牌总榜</span>
                <span class="nav_text2">每日赛程</span>
                <span class="nav_text3">奖牌地图</span>
            </div>
        </el-col>
      </el-row>
    </el-container>
</template>
export default {
  name: "nav", 
  data() {
    return {
      value: "world",
    }
  }
}
<style>
.nav_div {
    margin-top: 3px;
    height: 55px;
    background-color: rgba(136, 153, 243, 1);
     -moz-box-shadow: 0px -12px 5px 16px rgba(192, 228, 248, 1) inset;
    -webkit-box-shadow: 0px -12px 5px 16px rgb(192 228 248) inset;
    box-shadow: 0px -2px 5px 10px rgb(192 228 248) inset; 
}
.nav_img{
    height: 28px;
    margin-top: 12px;
    margin-bottom: 10px;
}
.nav_img1{
    margin-left: 80px;
    margin-bottom: 0;
}
.nav_img2{
    margin-top: 6px;
    margin-left: 76px;
    height: 5px;
    width: 130px;
}
.nav_text{
    font-size: 15px;
    color:#FFF;
    margin-top: 15px;
}
.nav_text1{
    margin-left: 500px;
}
.nav_text2{
    margin-left: 100px;
}
.nav_text3{
    margin-left: 100px;
}
</style>