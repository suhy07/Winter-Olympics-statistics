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
  }
}
</script>

<style>
html{
  width: 100%;
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
