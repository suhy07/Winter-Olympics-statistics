<template>
    <div class="h-goldlist-container">
         <div v-for="i in count" :key="i" class="h-goldlist-card">
          <el-row>
            <el-col :span="6">
              <div class="h-goldlist-card-num">
                <span class="h-goldlist-text h-goldlist-card-num-text">{{i}}</span>
              </div>
            </el-col>
            <el-col :span="18">
              <div class="h-goldlist-card-country">
                <img  class="h-goldlist-card-country-img" src="@/assets/NOR.png"/>
                <span class="h-goldlist-text h-goldlist-card-country-text">NOR</span>
              </div>
            </el-col>
          </el-row>
          <div class="h-goldlist-card-medal">
            <img  class="h-goldlist-card-medal-img h-goldlist-card-medal-img-gold" src="@/assets/gold.png"/>
            <span class="h-goldlist-text h-goldlist-card-medal-text h-goldlist-card-medal-text-gold">1</span>
            <img  class="h-goldlist-card-medal-img h-goldlist-card-medal-img-gray" src="@/assets/gray.png"/>
            <span class="h-goldlist-text h-goldlist-card-medal-text h-goldlist-card-medal-text-gray">1</span>
            <img  class="h-goldlist-card-medal-img h-goldlist-card-medal-img-bronze" src="@/assets/bronze.png"/>
            <span class="h-goldlist-text h-goldlist-card-medal-text h-goldlist-card-medal-text-bronze">1</span>
          </div>
         </div>
    </div>
</template>
<script>
  export default {
    data () {
      return {
        count: 10,
        loading: false
      }
    }
  }
</script>
<style>

.h-goldlist-container {
  overflow: scroll;
  -ms-overflow-style: none;
  /** //IE 10+*/
  overflow: -moz-scrollbars-none;
  /** Firefox */
}

/*整个滚动条样式 当width:0;或display:none;时，滚动条不显示*/
/* .h-goldlist-container      ::-webkit-scrollbar {
  display: none;
} */

/*整个滚动条样式*/
.h-goldlist-container::-webkit-scrollbar {
  width: 8px - 1px;
  height: 8px;
  background: transparent;
}

/*设置滚动条上的滚动滑块样式*/
.h-goldlist-container::-webkit-scrollbar-thumb {
  background: transparent;
  -webkit-box-shadow: none;
  box-shadow: none;
}

/*鼠标位于内容上时，滚动条样式*/
.h-goldlist-container:hover::-webkit-scrollbar {
  width: 8px - 1px;
  height: 8px;
  background: transparent;
  border-radius: 6px;
}

/*鼠标位于内容上时，滚动滑块样式*/
.h-goldlist-container:hover::-webkit-scrollbar-thumb {
  background-color: #c1c1c1;
  -webkit-box-shadow: inset 0 0 (8px - 1px) rgba(193, 193, 193, 0.3);
  box-shadow: none;
  border-radius: 10px;
}
#li{
  float: left;
}
.h-goldlist-container{
    white-space: nowrap;
    position: relative;
    left: 0.25%;
    overflow-x: scroll;
    min-width: 0;
    height: 85px;
    width: 1012px;
    border-width: 0px;
    -webkit-overflow-scrolling: touch;
    overflow-y: hidden;
    border-radius: 30px;
}
.h-goldlist-card{
    display: inline-block;
    min-width: 0;
    margin-top: 5px;
    margin-right: 15px;
    width: 116.75px;
    height: 66px;
    background: inherit;
    background-color: rgba(247, 247, 247, 1);
    border-width: 2px;
    border-style: solid;
    border-color: rgba(204, 204, 204, 1);
}
.h-goldlist-text{
    font-family: '华光大黑_CNKI Bold', '华光大黑_CNKI', sans-serif;
    font-size: 2px;
}
.h-goldlist-card-num{
    width: 30px;
    height: 30px;
    background: inherit;
    background-color: rgba(247, 247, 247, 1);
    border-width: 2px;
    border-style: solid;
    border-color: rgba(204, 204, 204, 1);
    border-top: 0 ;
    border-left:0 ;
}
.h-goldlist-card-num-text{
    position: relative;
    top: 4px;
    left: 10px;
}
.h-goldlist-card-country{
    width: 86px;
    height: 30px;
    background: inherit;
    background-color: rgba(247, 247, 247, 1);
    border-width: 2px;
    border-style: solid;
    border-color: rgba(204, 204, 204, 1);
    border-top: 0 ;
    border-right:0 ;
}
.h-goldlist-card-country-img{
    width: 30px;
    position: relative;
    top: 0px;
    left: 8px;
}
.h-goldlist-card-country-text{
    position: relative;
    top: -11px;
    left: 10px;
    font-size: 1px;
    letter-spacing: 0;
}
.h-goldlist-card-medal{
    padding-top:10px;
    padding-left: 10px;
}
.h-goldlist-card-medal-img{
    width: 15px;
    margin-left:5px ;
}
.h-goldlist-card-medal-text{
    position: relative;
    top: -4px;
}
/* 
    .t-ctn {
        width: 100%;
        overflow-x: auto;
    }

    .t-ctn .s-ctn {
        height: 80px;
        white-space: nowrap;
        font-size: 0;
    }

    .t-ctn .s-ctn div {
        font-size: 14px;
        box-sizing: border-box;
        white-space: normal;
        word-wrap: break-word;
        word-break: break-all;
        overflow: hidden;
        display: inline-block;
        width: 100px;
        height: 100%;
        border: 10px solid red;
    } */

</style>