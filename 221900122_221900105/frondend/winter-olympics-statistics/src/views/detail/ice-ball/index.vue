<template> 
    <div class="ice-ball-container">
        <div class="ice-ball-card ice-ball-body">
            <div class="ice-ball-card ice-ball-title">
                <div class="ice-ball-text">比赛:冰球 女子A组 加拿大 VS 瑞士</div>
            </div>
            <div class="ice-ball-card ice-ball-table-container ice-ball-home">
                <div class="ice-ball-card ice-ball-table-title">
                    <div class="ice-ball-text ice-ball-table-title-text">出场名单</div>
                </div>
                <div class="ice-ball-card ice-ball-table-teamname">
                    <div class="ice-ball-text ice-ball-table-teamname-text">加拿大队</div>
                </div>
                <div class="ice-ball-table ice-ball-card">
                    <div class="ice-ball-th">
                        <div class="ice-ball-text ice-ball-th-text">号码</div>
                        <div class="ice-ball-text ice-ball-th-text">姓名/代表队</div>
                        <div class="ice-ball-text ice-ball-th-text">位置</div>
                    </div>
                    <div class="ice-ball-td" v-for="i in count" :key="i">
                        <div class="ice-ball-text ice-ball-td-text">38</div>
                        <img class="ice-ball-td-img" src="@/assets/IceBall.svg">
                        <div class="ice-ball-text ice-ball-td-text">马什梅耶</div>
                        <div class="ice-ball-text ice-ball-td-text">守门员</div>
                    </div>
                </div>
            </div>
            <div class="ice-ball-card ice-ball-score">
                <div class="ice-ball-card ice-ball-score-main">
                    <img class="ice-ball-score-main-home-img"  src="@/assets/CAN.png" >
                    <div class="ice-ball-text ice-ball-score-main-home-text">俄罗斯奥运队</div>
                    <div class="ice-ball-text ice-ball-score-main-score-text ice-ball-score-main-score-home">15</div>
                    <div class="ice-ball-text ice-ball-score-main-score-text">:</div>
                    <div class="ice-ball-text ice-ball-score-main-score-text ice-ball-score-main-score-any">15</div>
                    <img src="@/assets/ROC.png" class="ice-ball-score-main-any-img">
                    <div class="ice-ball-text ice-ball-score-main-any-text">俄罗斯奥运队</div>
                </div>
                 <div class="ice-ball-card ice-ball-score-second">
                    <div class="ice-ball-card ice-ball-score-second-title">
                        <div class="ice-ball-text ice-ball-table-teamname-text ice-ball-score-second-title-text">两队比分</div>
                    </div>
                    <div class="ice-ball-score-second-table">
                        <div class="ice-ball-score-second-th">
                            <div class="ice-ball-text ice-ball-score-text">国家/地区</div>
                            <div class="ice-ball-text ice-ball-score-text">第一节</div>
                            <div class="ice-ball-text ice-ball-score-text">第二节</div>
                            <div class="ice-ball-text ice-ball-score-text">第三节</div>
                            <div class="ice-ball-text ice-ball-score-text">加时</div>
                            <div class="ice-ball-text ice-ball-score-text">点球</div>
                            <div class="ice-ball-text ice-ball-score-text">总比分</div>
                        </div>
                        <div class="ice-ball-score-second-td"  v-for="i in count=2" :key="i">
                            <div class="ice-ball-text ice-ball-score-text">
                                <div class="ice-ball-text ice-ball-score-text ice-ball-score-second-td-text ice-ball-score-td-country">俄罗斯奥运队</div>
                                <img src="@/assets/ROC.png" class="ice-ball-score-second-td-img">
                            </div>
                            <div class="ice-ball-text ice-ball-score-text ice-ball-score-second-td-text ice-ball-score-td-1">2</div>
                            <div class="ice-ball-text ice-ball-score-text ice-ball-score-second-td-text ice-ball-score-td-2">2</div>
                            <div class="ice-ball-text ice-ball-score-text ice-ball-score-second-td-text ice-ball-score-td-3">1</div>
                            <div class="ice-ball-text ice-ball-score-text ice-ball-score-second-td-text"></div>
                            <div class="ice-ball-text ice-ball-score-text ice-ball-score-second-td-text"></div>
                            <div class="ice-ball-text ice-ball-score-text ice-ball-score-second-td-text ice-ball-score-td-total">5</div>
                        </div>
                    </div>
                </div>
                <div class="ice-ball-card ice-ball-score-third">
                    <div class="ice-ball-card ice-ball-score-second-title ice-ball-score-third-title">
                        <div class="ice-ball-text ice-ball-table-teamname-text ice-ball-score-second-title-text">比赛数据</div>
                    </div>
                    <div class="ice-ball-graph">
                        <graph/>
                    </div>
                </div>
            </div>
            <div class="ice-ball-card ice-ball-table-container ice-ball-any">
                <div class="ice-ball-card ice-ball-table-title">
                    <div class="ice-ball-text ice-ball-table-title-text">出场名单</div>
                </div>
                <div class="ice-ball-card ice-ball-table-teamname">
                    <div class="ice-ball-text ice-ball-table-teamname-text">加拿大队</div>
                </div>
                <div class="ice-ball-table ice-ball-card">
                    <div class="ice-ball-th">
                        <div class="ice-ball-text ice-ball-th-text">号码</div>
                        <div class="ice-ball-text ice-ball-th-text">姓名/代表队</div>
                        <div class="ice-ball-text ice-ball-th-text">位置</div>
                    </div>
                    <div class="ice-ball-td" v-for="i in count" :key="i">
                        <div class="ice-ball-text ice-ball-td-text">38</div>
                        <img class="ice-ball-td-img" src="@/assets/IceBall.svg">
                        <div class="ice-ball-text ice-ball-td-text">马什梅耶</div>
                        <div class="ice-ball-text ice-ball-td-text">守门员</div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</template>
<script>
import Graph from './components/graph';
export default{
    data() {
        return {
            count:20
        }
    },
    components:{
        Graph
    },
    methods:{
    }
}
</script>
<style scoped>
.ice-ball-container{
    position: absolute;
    top: 55px;
    width:80.3%;
}
.ice-ball-card{
    background-color: rgba(255, 255, 255, 1);
    border-width: 1px;
    border-radius: 188px;
    box-shadow: 0px 0px 10px rgb(170 170 170 / 35%);
    border-style: dotted;
    border-color: #F2F2F2;
}
.ice-ball-home{
    margin-top: 50px;
    display: inline-block;
}
.ice-ball-any{
    display: inline-block;
    float: right;
    margin-top: 50px;

}
.ice-ball-score{
    position: absolute;
    top: 190px;
    left: 208px;
    height: 1100px;
    width: 680px;
    border-radius: 30px;
    display: inline-block;
}
.ice-ball-text{
    display: inline-block;
    position: relative;
    top: 15px;
    left:20px;
    background: inherit;
    background-color: rgba(255, 255, 255, 0);
    font-family: '华光标题宋_CNKI', sans-serif;
    font-style: normal;
    font-size: 20px;
    color: #FFFFFF;
}
.ice-ball-img{
    position: relative;
    top:4px;
    left: 55px;
}
.ice-ball-body{
    position: absolute;
    padding: 100px 0;
    top:60px;
    left:5%;
    height: 1200px;
    width: 1100px;
    border-radius: 60px;
}
.ice-ball-title{
    position:absolute;
    top: 60px;
    left: 5%;
    background-color: #4589D6;
    width: 90%;
    height: 55px;
}
.ice-ball-table-container{
    position: relative;
    top: 40px;
    width: 200px;
    height: 1100px;
    border-radius: 30px;
}
.ice-ball-table{
    position: relative;
    top: 30px;
    height: 975px;
    border-radius: 20px;
    box-shadow: none;
    border-top-left-radius: 0;
    border-top-right-radius: 0;
    overflow-x: hidden;
    overflow-y: auto;
}
.ice-ball-table-title{
    position: relative;
    height: 60px;
    border-radius: 25px;
    border-bottom-right-radius:0 ;
    border-bottom-left-radius:0 ;
    background-color: #4589D6;

}
.ice-ball-table-title-text{
    position: relative;
    top: 20px;
    left: 55px;
    letter-spacing: 4px;
    color: #ffffff;
    font-size: 20px;
}
.ice-ball-table-teamname{
    position: relative;
    top: 20px;
    left: 10px;
    width:180px;
    height: 30px;
    box-shadow: none;
    border-radius: 25;
    background: #4589D6;
;
}
.ice-ball-table-teamname-text{
    position: relative;
    top: 4px;
    left: 60px;
    font-size: 15px;
}
.ice-ball-th{
    position: relative;
    top: 30px;
    border-width: 1px;
    border: #4589D6;
    border-bottom-style: dotted;
}
.ice-ball-th-text{
    position: relative;
    top: 0;
    left: 2px;
    color:#4589D6;
    font-family: "黑体";
    font-size: 18px;
    margin: 0 1px;
}
.ice-ball-td{
    position: relative;
    top: 20px;
    margin: 12px 0;
    border-radius: 2px;
    border-right:none ;
    border-left:none ;
    height: 30px;
}
.ice-ball-td-text{
    position: relative;
    font-family: "黑体";
    color: #4589D6;
    left: 0px;
    top: 0;
    font-size: 16px;
    margin: 0 1px;
}
.ice-ball-td-img{
    position: relative;
    top: 10px;
    left: 4px;
    height: 40px;
}
.ice-ball-score-main{
    position: relative;
    left: 12px;
    top: 20px;
    border-radius: 25px;
    background: #4589D6;
    height: 200px;
    width: 650px;
    overflow: hidden;
}
.ice-ball-score-main-home-img{
    position: relative;
    border: #F2F2F2;
    border-style: solid;
    top:20px;
    left: 60px;
    height: 150px;
}
.ice-ball-score-main-any-img{
    position: relative;
    border: #F2F2F2;
    border-style: solid;
    top:20px;
    left: 150px;
    height: 150px;
}
.ice-ball-score-main-home-text{
    position: relative;
    top:10px;
    left: -80px;
}
.ice-ball-score-main-any-text{
    position: relative;
    top:10px;
    left: 10px;
}
.ice-ball-score-main-score-text{
    position: absolute;
    top: 66px;
    left: 320px;
    font-size: 40px;
}
.ice-ball-score-main-score-home{
    position: absolute;
    top:70px;
    left: 250px;
    font-size: 40px;
}
.ice-ball-score-main-score-any{
    position: absolute;
    top:70px;
    left: 360px;
    font-size: 40px;
}
.ice-ball-score-second{
    position: relative;
    left: 12px;
    top: 40px;
    border-radius: 25px;
    height: 300px;
    width: 650px;
    overflow: hidden;
}
.ice-ball-score-second-title{
    background: #00cec9;
    height: 80px;
    border-radius: 0px;
}
.ice-ball-score-second-title-text{
    position: relative;
    top: 20px;
    left: 240px;
    font-size: 30px;
    letter-spacing: 15px;
}
.ice-ball-score-second-th{
    position: relative;
    top: 40px;
    border-width: 1px;
    border: #4589D6;
    border-bottom-style: dotted;
}
.ice-ball-score-text{
    position: relative;
    top: 0;
    color:#4589D6;
    font-family: '黑体';
    margin: 0 12px;
}
.ice-ball-score-second-td{
    position: relative;
    top: 60px;
    margin: 10px 0;
}
.ice-ball-score-second-td-text{
    color: #000;
    font-family: '黑体';
    font-size: 15px;
}
.ice-ball-score-second-td-img{
    position:absolute;
    width: 20px;
    left: -10px;
    top: 3px;
}
.ice-ball-score-td-country{
    position: relative;
    left: 5px;
}
.ice-ball-score-td-1{

}
.ice-ball-score-td-2{
    position: relative;
    left: 75px;
}
.ice-ball-score-td-3{
    position: relative;
    left: 130px;
}
.ice-ball-score-td-total{
    position: relative;
    left: 260px;
}
.ice-ball-score-third{
    position: relative;
    left: 12px;
    top: 60px;
    border-radius: 25px;
    height: 500px;
    width: 650px;
    overflow: hidden;
}
.ice-ball-score-third-title{
    background: #fd79a8;
}





.ice-ball-table::-webkit-scrollbar {
    width: 2px - 0px;
    height: 2px;
    background: transparent;
}
.ice-ball-table::-webkit-scrollbar-thumb {
    background: transparent;
    -webkit-box-shadow: none;
    box-shadow: none;
}
.ice-ball-table:hover::-webkit-scrollbar-thumb {
    background-color: #c1c1c1;
    -webkit-box-shadow: inset 0 0 (4px - 1px) rgba(193, 193, 193, 0.3);
    box-shadow: none;
    border-radius: 20px;
}
</style>