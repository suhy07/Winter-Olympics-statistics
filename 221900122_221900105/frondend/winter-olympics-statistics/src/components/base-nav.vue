<template>
    <el-container class="nav-div">
      <el-row>
        <el-col :span="2">
            <img class="nav-img nav-img1" src="@/assets/北京2022.png">
            <img class="head-img nav-img2" src="@/assets/竖线.png">
        </el-col>
        <el-col :span="22">
            <div class="nav-text">
                <span class="nav-text1">奖牌总榜</span>
                <span class="nav-text2">每日赛程</span>
                <span class="nav-text3">奖牌地图</span>
            </div>
        </el-col>
      </el-row>
    </el-container>
</template>
export default {
  name: "nav", 
  data() {
    return {
    }
  }
}
<style>
.nav-div {
    position:inherit;
    height: 55px;
    background-color: rgba(136, 153, 243, 1);
     -moz-box-shadow: 0px -12px 5px 16px rgba(192, 228, 248, 1) inset;
    -webkit-box-shadow: 0px -12px 5px 16px rgb(192 228 248) inset;
    box-shadow: 0px -2px 5px 10px rgb(192 228 248) inset; 
}
.nav-img{
    height: 28px;
    margin-top: 12px;
    margin-bottom: 10px;
}
.nav-img1{
    margin-left: 60px;
    margin-bottom: 0;
}
.nav-img2{
    margin-top: 6px;
    margin-left: 76px;
    height: 5px;
    width: 100px;
}
.nav-text{
    font-size: 15px;
    color:#FFF;
    margin-top: 15px;
}
.nav-text1{
    margin-left: 500px;
}
.nav-text2{
    margin-left: 100px;
}
.nav-text3{
    margin-left: 100px;
}
</style>