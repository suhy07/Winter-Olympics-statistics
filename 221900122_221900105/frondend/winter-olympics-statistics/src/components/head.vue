<template>
    <el-container class="head_div">
      <el-row>
        <el-col :span="10">
          <img class="head_img img1" src="@/assets/冬奥统计.png">
        </el-col>
        <el-col :span="2">
          <img class="head_img img2" src="@/assets/竖线.png">
        </el-col>
        <el-col :span="12">
          <img class="head_img img3" src="@/assets/五环.png">
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
    border-width: 0px;
    position: absolute;
    left: 0px;
    top: 0px;
    width: 100%;
    height: 75px;
    background: inherit;
    background-color: rgba(69, 137, 214, 1);
    box-sizing: border-box;
    border-width: 1px;
    border-style: solid;
    border-color: rgba(121, 121, 121, 1);
    border-left: 0px;
    border-top: 0px;
    border-right: 0px;
    border-bottom: 0px;
    border-radius: 0px;
    -moz-box-shadow: 0px 5px 5px 19px rgba(152, 141, 216, 0.349019607843137) inset;
    -webkit-box-shadow: 0px 5px 5px 19px rgb(152 141 216 / 35%) inset;
    box-shadow: 0px 5px 5px 19px rgb(152 141 216 / 35%) inset;
}
.head_img{
    border-width: 0px;
    height: 46.86px;
    margin-top: 15px;
    margin-bottom: 15px;
}
.img1{
    margin-left: 80px;
}
.img2{
    margin-left: 55px; 
    width: 2px;
}
.img3{
    margin-left: 30px;
}
</style>