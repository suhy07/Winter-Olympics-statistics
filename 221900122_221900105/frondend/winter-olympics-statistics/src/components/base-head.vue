<template>
    <el-container class="head_div">
      <el-row>
        <el-col :span="10">
          <img class="head_img head_img1" src="@/assets/冬奥统计.png">
        </el-col>
        <el-col :span="2">
          <img class="head_img head_img2" src="@/assets/竖线.png">
        </el-col>
        <el-col :span="12">
          <img class="head_img head_img3" src="@/assets/五环.png">
        </el-col>
      </el-row>
    </el-container>
</template>
export default {
  name: "head", 
  data() {
    return {
      value: "world",
    }
  }
}
<style>
.head_div {
    height: 55px;
    background-color: rgba(69, 137, 214, 1);
     -moz-box-shadow: 0px 5px 5px 19px rgba(152, 141, 216, 0.349019607843137) inset;
    -webkit-box-shadow: 0px 5px 5px 19px rgb(152 141 216 / 35%) inset;
    box-shadow: 0px 5px 5px 19px rgb(152 141 216 / 35%) inset;
}
.head_img{
    height: 36.86px;
    margin-top: 10px;
    margin-bottom: 10px;
}
.head_img1{
    margin-left: 80px;
}
.head_img2{
    margin-left: 55px; 
    width: 2px;
}
.head_img3{
    margin-left: 30px;
}
</style>