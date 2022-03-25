<template> 
    <div class="homepage-container">
            <div class="homepage-body">
                <div class="homepage-main">
                    <el-row class="homepage-row">
                                <base-nav/>
                        <el-col :span="4">
                            <div class="homepage-card homepage-card-select">
                                <span class="homepage-card-text">金牌榜</span>
                            </div>
                            <div class="homepage-card homepage-card-default">
                                <span class="homepage-card-text">最新赛况</span>
                            </div>
                        </el-col>
                        <el-col :span="20">
                            <div class="homepage-card homepage-card-default homepage-card-goldlist">
                                <gold-list/>
                            </div>
                        </el-col>
                    </el-row>
                    <el-row class="homepage-row">
                        <el-col :span="16">
                            <div class="homepage-card homepage-card-default homepage-card-carousel">
                                <carousel/>
                            </div>
                        </el-col>
                        <el-col :span="8">
                            <div class="homepage-card homepage-card-default homepage-card-tab">
                               <tabs/>
                            </div>
                        </el-col>
                    </el-row>
                    <el-row class="homepage-row">
                       <div class="homepage-card homepage-card-default homepage-card-map">
                           <base-map/>
                       </div>
                    </el-row>
                </div>
            </div>
    </div>
</template>
<script>
import BaseHead from '@/components/base-head'
import BaseNav from '@/components/base-nav'
import GoldList from '@/views/homepage/components/h-goldlist'
import Carousel from '@/views/homepage/components/h-carousel'
import Tabs from '@/views/homepage/components/h-tabs'
import BaseMap from '@/components/base-map'
export default{
    data() {
        return {
        }
    },
    components: {
        BaseHead,
        BaseNav,
        GoldList,
        BaseMap,
        Carousel,
        Tabs
    }
}
</script>
<style>
.homepage-container{
    position: absolute;
    top: 55px;
    width:80.3%;
}
.homepage-row{
    width: 1219px;
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