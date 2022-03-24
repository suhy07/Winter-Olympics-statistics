<template> 
    <div class="map-container">
    </div>
</template>
<script>
import BaseHead from '@/components/base-head'
export default{
    data() {
        return {
            count:25
        }
    },
    components: {
        BaseHead,
    }
}
</script>
<style scoped>
.total-container{
    position: absolute;
    top: 55px;
    width:80.3%;
}
.total-card{
    background-color: rgba(255, 255, 255, 1);
    border-width: 1px;
    border-radius: 188px;
    box-shadow: 0px 0px 10px rgb(170 170 170 / 35%);
    border-style: dotted;
    border-color: rgb(0, 0, 0);
}
.total-text{
    display: inline-block;
    position: relative;
    top:-10px;
    left: 55px;
    background: inherit;
    background-color: rgba(255, 255, 255, 0);
    font-family: '华光标题宋_CNKI', sans-serif;
    font-style: normal;
    font-size: 20px;
    color: #FFFFFF;
    margin: 0 85px 0 1px;
}
.total-list{
    position: absolute;
    top:160px;
    left: 60px;
}
.total-list-text{
    font-family: 'Arial Normal', 'Arial', sans-serif;
    font-weight: 100;
    font-size: 15px;
    margin-right: 134px;
    color:black;
}
.total-list-text-country{
    position: relative;
    left: 30px;
}
.total-list-img{
    width: 50px;
    position: relative;
    left: 20px;
    top: 8px;
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
    height: 1600px;
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