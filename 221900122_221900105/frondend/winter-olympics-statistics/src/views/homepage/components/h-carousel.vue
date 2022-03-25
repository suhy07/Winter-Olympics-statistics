<template>
  <el-carousel indicator-position="outside">
    <el-carousel-item>
      <img class="carousel-img" src="@/assets/u259.jpg">
    </el-carousel-item>
        <el-carousel-item>
      <img class="carousel-img" src="@/assets/u260.jpg">
    </el-carousel-item>
        <el-carousel-item>
      <img class="carousel-img" src="@/assets/u261.jpg">
    </el-carousel-item>
  </el-carousel>
</template>

<style scpoed>
.carousel-img{
  width: 800px;
}
.el-carousel{
  position: relative;
  top: 50px;
     height: 800px;
}
.el-carousel__arrow{
  position: relative;
  top: 300px;
}
.el-carousel__indicator{
  position: relative;
  top: 200px;
}
  .el-carousel__item{
    height: 500px;
  }
  .el-carousel__item:nth-child(2n) {
    background-color: #A2CEE8;
  }
  
  .el-carousel__item:nth-child(2n+1) {
    background-color: #A2CEE8;
  }
</style>