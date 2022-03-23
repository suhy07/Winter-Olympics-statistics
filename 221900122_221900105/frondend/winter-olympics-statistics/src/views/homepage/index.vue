<template> 
    <div>
        <base-head/>
        <base-nav/>
        <div class="homepage-body">
        </div>
        <div>
            <el-container>
                <el-row class="homepage-row">
                    <el-col :span="4">
                        <div class="homepage-card homepage-card1">
                            <span class="homepage-card1-text">金牌榜</span>
                        </div>
                        <div class="homepage-card homepage-card2">
                            <span class="homepage-card2-text">最新赛况</span>
                        </div>
                    </el-col>
                    <el-col :span="20">
                        <div class="homepage-card3">
                            <gold-list/>
                        </div>
                    </el-col>
                </el-row>
            </el-container>
        </div>
    </div>
</template>
<script>
import BaseHead from '@/components/base-head'
import BaseNav from '@/components/base-nav'
import GoldList from '@/views/homepage/components/h-goldlist'
export default{
    data() {
        return {
        }
    },
    components: {
        BaseHead,
        BaseNav,
        GoldList
    }
}
</script>
<style>
.homepage-body{
    width:100%;			
    height:100%;
    position:fixed;
    background-repeat:no-repeat;
    background-size: 1676px 3630px;
    background-image: url("../../assets/bdd.png");
}
.homepage-row{
    width: 100%;
}
.homepage-card{
    width: 100%;
    height: 41px;
    background: inherit;
    background-color: rgba(255, 255, 255, 1);
    font-family: 'Microsoft YaHei UI Bold', 'Microsoft YaHei UI Regular', 'Microsoft YaHei UI', sans-serif;
    font-weight: 700;
    font-style: normal;
    font-size: 16px;
    letter-spacing: 2px;
    padding: 8px 0 8px 90px;
}
.homepage-card1{
    box-sizing: border-box;
    border-width: 3px;
    border-style: solid;
    border-color: rgba(255, 255, 255, 1);
    border-radius: 188px;
    -moz-box-shadow: 17px 17px 47px rgba(170, 170, 170, 0.349019607843137);
    -webkit-box-shadow: 17px 17px 47px rgb(170 170 170 / 35%);
    box-shadow: 17px 17px 47px rgb(170 170 170 / 35%);
}
.homepage-card2{
    box-sizing: border-box;
    border-width: 1px;
    border-style: dotted;
    border-color: rgb(0, 0, 0);
    border-radius: 188px;
}
.homepage-card3{
    height: 82px;
    width: 100%;
    box-sizing: border-box;
    background-color: rgba(255, 255, 255, 1);
    border-width: 1px;
    border-style: dotted;
    border-color: rgb(0, 0, 0);
    border-radius: 20px;
    padding: 0;
}
</style>
