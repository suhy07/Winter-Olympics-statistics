<template>
    <div class="h-goldlist-container">
        <div class="h-goldlist-card">
          <el-row>
            <el-col :span="6">
              <div class="h-goldlist-card-num">
                <span class="h-goldlist-text h-goldlist-card-num-text">1</span>
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
        return {}
    }
  }
</script>
<style>
.h-goldlist-container{
  overflow:hidden; width:760px
}
.h-goldlist-card{
    margin-top: 5px;
    margin-left: 15px;
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
</style>