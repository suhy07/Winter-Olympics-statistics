<template>
  <el-tabs v-model="activeName" type="card" @tab-click="handleClick">
    <el-tab-pane label="时间" name="first">
        
    </el-tab-pane>
    <el-tab-pane label="项目" name="second">配置管理</el-tab-pane>
    <el-tab-pane label="场馆" name="third">角色管理</el-tab-pane>
  </el-tabs>
</template>
<script>
  export default {
    data() {
      return {
        activeName: 'first'
      };
    },
    methods: {
      handleClick(tab, event) {
        console.log(tab, event);
      }
    }
  };
</script>