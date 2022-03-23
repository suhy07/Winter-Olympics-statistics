<template>
    <el-container class="head-div">
      <el-row>
        <el-col :span="10">
          <img class="head-img head-img1" src="@/assets/冬奥统计.png">
        </el-col>
        <el-col :span="2">
          <img class="head-img head-img2" src="@/assets/竖线.png">
        </el-col>
        <el-col :span="12">
          <img class="head-img head-img3" src="@/assets/五环.png">
        </el-col>
      </el-row>
    </el-container>
</template>
export default {
  name: "head", 
  data() {
    return {
    }
  }
}
<style>
.head-div {
    height: 55px;
    background-color: rgba(69, 137, 214, 1);
     -moz-box-shadow: 0px 5px 5px 19px rgba(152, 141, 216, 0.349019607843137) inset;
    -webkit-box-shadow: 0px 5px 5px 19px rgb(152 141 216 / 35%) inset;
    box-shadow: 0px 5px 5px 19px rgb(152 141 216 / 35%) inset;
}
.head-img{
    height: 36.86px;
    margin-top: 10px;
    margin-bottom: 10px;
}
.head-img1{
    margin-left: 80px;
}
.head-img2{
    margin-left: 55px; 
    width: 2px;
}
.head-img3{
    margin-left: 35px;
}
</style>