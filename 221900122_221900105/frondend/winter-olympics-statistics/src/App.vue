<template>
  <div class="app-container">
    <base-head/>
    <img src="@/assets/bdd.png" class="homepage-background">
    <router-view/>
  </div>
</template>

<script>
import BaseHead from '@/components/base-head'
export default {
  name: 'App',
  components:{
    BaseHead
  },
   metaInfo: {
        title: "页面标题",
        meta: [
          { name: "keywords", content: "页面关键字" },
          { name: "description", content: "页面描述" },
          { name:"viewport" , content:"dth=device-width,initial-scale=1.0,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no"},
        ],
      },
      
}
</script>

<style>
html{
  width: 1519px;
  height: 100%;
}
body{
  margin: 0;
   width: 100%;
  height: 100%;
}
.homepage-background{
    width: 100%;
    height: 100%;
}
.app-container{
    padding: 0 150px;
}
</style>
