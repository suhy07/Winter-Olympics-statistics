<template> 
    <div class="homepage-container">
    </div>
</template>
<script>
import BaseHead from '@/components/base-head'
export default{
    data() {
        return {
        }
    },
    components: {
        BaseHead,
    }
}
</script>
<style>
.homepage-container{
    margin: 0 150px;
}
.homepage-background{
    width: 100%;
    height: 100%;
}
.homepage-body{
    position: absolute;
    top: 113px;
    width:80.4%;			
    height:100vh;
    background-size: 1676px 3630px;
}
.homepage-row{
    width: 100%;
}
.homepage-main{
    padding:0;
    height: 100vh;
    overflow:inherit;
}
.homepage-card{
    width: 100%;
    height: 41px;
    background: inherit;
    background-color: rgba(255, 255, 255, 1);
    padding: 8px 0 8px 70px;
    box-sizing: border-box;
    border-width: 1px;
    border-radius: 188px;
    box-shadow: 0px 0px 10px rgb(170 170 170 / 35%);
}
.homepage-card-text{
    font-family: 'Microsoft YaHei UI Bold', 'Microsoft YaHei UI Regular', 'Microsoft YaHei UI', sans-serif;
    font-weight: 700;
    font-style: normal;
    letter-spacing: 2px;
    font-size: 16px;
}
.homepage-card-select{
    border-style: solid;
    border-color: rgba(255, 255, 255, 1);
}
.homepage-card-default{
    border-style: dotted;
    border-color: rgb(0, 0, 0);
}
.homepage-card-goldlist{
    height: 82px;
    width: 100%;
    box-sizing: border-box;
    border-radius: 20px;
    padding: 0;
}
.homepage-card-carousel{
    padding: 0;
    position: relative;
    top: 50px;
    left: 50px;
    height: 600px;
    width: 800px;
    border-radius: 50px;
}
.homepage-card-tab{
    position: relative;
    padding: 0;
    top: 50px;
    left: 75px;
    height: 600px;
    width: 300px;
    border-radius: 50px;
}
.homepage-card-map{
    padding: 0;
    position: relative;
    top: 200px;
    left: 50px;
    height: 800px;
    width: 1135px;
    border-radius: 50px;
}
</style>