<template> 
    <div class="map-container">
        <div class="map-card map-body">
            <div class="map-card map-title">
                <div class="map-text">奖牌地图</div>
            </div>
            <base-map/>
        </div>
    </div>
</template>
<script>
import BaseMap from '@/components/base-map'
export default{
    data() {
        return {
            count:25
        }
    },
    components: {
        BaseMap
    }
}
</script>
<style scoped>
.map-container{
    position: absolute;
    top: 55px;
    width:80.3%;
}
.map-card{
    background-color: rgba(255, 255, 255, 1);
    border-width: 1px;
    border-radius: 188px;
    box-shadow: 0px 0px 10px rgb(170 170 170 / 35%);
    border-style: dotted;
    border-color: rgb(0, 0, 0);
}
.map-text{
    display: inline-block;
    position: relative;
    top: 15px;
    left: 370px;
    background: inherit;
    background-color: rgba(255, 255, 255, 0);
    font-family: '华光标题宋_CNKI', sans-serif;
    font-style: normal;
    font-size: 25px;
    letter-spacing: 50px;
    color: #FFFFFF;
    margin: 0 85px 0 1px;
}
.map-img{
    position: relative;
    top:4px;
    left: 55px;
}
.map-body{
    position: absolute;
    padding: 100px 0;
    top:60px;
    left:5%;
    height: 800px;
    width: 90%;
    border-radius: 60px;
}
.map-title{
    position:absolute;
    top: 60px;
    left: 5%;
    background-color: #4589D6;
    width: 90%;
    height: 55px;
}
#map{
    position: absolute;
    top:-20%;
    width: 80%;
    height: 120%;
}
</style>