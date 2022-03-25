<template>
   <h1>404</h1>
</template>
<script>
export default {
  name: "head", 
  data() {
    return {
    }
  },
  methods:{
    toHomePage(){
      this.$router.push('/homepage');
    }
  }
}
</script>


<style>
.head-div {
    height: 55px;
    background-color: rgba(69, 137, 214, 1);
     -moz-box-shadow: 0px 5px 5px 19px rgba(152, 141, 216, 0.349019607843137) inset;
    -webkit-box-shadow: 0px 5px 5px 19px rgb(152 141 216 / 35%) inset;
    box-shadow: 0px 5px 5px 19px rgb(152 141 216 / 35%) inset;
}
.head-img{
    height: 36.86px;
    margin-top: 10px;
    margin-bottom: 10px;
}
.head-img1{
    margin-left: 80px;
}
.head-img2{
    margin-left: 55px; 
    width: 2px;
}
.head-img3{
    margin-left: 35px;
}
</style>