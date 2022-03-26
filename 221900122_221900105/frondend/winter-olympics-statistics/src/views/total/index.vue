<template> 
    <div class="total-container">
        <div class="total-card total-body">
            <div class="total-card total-title">
                <div class="total-text">排名</div>
                <div class="total-text">国家/地区</div>
                <img class="total-img" src="@/assets/gold.png">
                <div class="total-text">金牌</div>
                <img class="total-img" src="@/assets/gray.png">
                <div class="total-text">银牌</div>
                <img class="total-img" src="@/assets/bronze.png">
                <div class="total-text">铜牌</div>
                <div class="total-text">总数</div>
            </div>
            <div class="total-list">
                <div v-for="i in medalList" :key="i">
                    <div class="total-text-box total-text total-list-text">{{i.rank}}</div>
                    <img class="total-list-img" :src="['./static/assets/'+i.countryid+'.png']">
                    <div class="total-text total-list-text total-list-text-country total-text-box1">{{i.countryname}}</div>
                    <div class="total-text-box total-text total-list-text total-list-text-gold">{{i.gold}}</div>
                    <div class="total-text-box total-text total-list-text">{{i.silver}}</div>
                    <div class=" total-text-box total-text total-list-text total-list-text-bronze">{{i.bronze}}</div>
                    <div class=" total-text-box total-text total-list-text">{{i.count}}</div>
                </div>
            </div>
        </div>
    </div>
</template>
<script>
import {getMedalList} from "@/api/medal";
export default{
    data() {
        return {
            medalList:{}
        }
    },mounted(){
        this.initMedal()
    },
    methods:{
    initMedal(){
      var t=getMedalList()
      console.log(t)
      t.then((result)=>{
        console.log(result)
        this.medalList=result.medalList.sort(function(a,b){
          return a.rank-b.rank
        })
       })
      }
    }
}
</script>
<style scoped>
.total-container{
    position: absolute;
    top: 55px;
    width:1200px;
}
.total-card{
    background-color: rgba(255, 255, 255, 1);
    border-width: 1px;
    border-radius: 188px;
    box-shadow: 0px 0px 10px rgb(170 170 170 / 35%);
    border-style: dotted;
    border-color: #F2F2F2;
}
.total-text{
    display: inline-block;
    position: relative;
    top:-15px;
    left: 55px;
    background: inherit;
    background-color: rgba(255, 255, 255, 0);
    font-family: '华光标题宋_CNKI', sans-serif;
    font-style: normal;
    font-size: 18px;
    color: #FFFFFF;
    margin: 0 85px 0 1px;
}
.total-text-box{
    width: 20px;
    margin: 0px 132px 0 0;
}
.total-text-box1{
    position: absolute;
    margin: 0 30px 0 0;
    width: 90px;
}
.total-list{
    position: absolute;
    top: 160px;
    left: 60px;
}
.total-list-text{
    font-family: 'Arial Normal', 'Arial', sans-serif;
    font-weight: 100;
    font-size: 15px;
    color:black;
}
.total-list-text-gold{
    position: relative;
    left: 35px;
}
.total-list-text-bronze{
    position: relative;
    left: 79px;
    
}
.total-list-text-country{
    position: relative;
    left: 30px;
}
.total-list-img{
    width: 50px;
    position: relative;
    left: 28px;
    top: 4px;
}
.total-img{
    position: relative;
    top:4px;
    left: 55px;
}
.total-body{
    position: absolute;
    top:60px;
    left:5%;
    height: 1900px;
    width: 90%;
    border-radius: 60px;
}
.total-title{
    position:absolute;
    top:60px;
    left: 5%;
    background-color: #4589D6;
    width: 90%;
    height: 55px;
}
</style>