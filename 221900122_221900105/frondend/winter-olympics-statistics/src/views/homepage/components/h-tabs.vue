<template>
  <el-tabs v-model="activeName" type="card" @tab-click="handleClick">
    <el-tab-pane stretch='true' label="时间" name="first">
      <el-table class="mytable"
      :data="timeTableData">
      <el-table-column
        label="时间排序"
        >
        <img src="@/assets/ROC.png">
      </el-table-column>
      <el-table-column
        prop="time"
        label="时间">
      </el-table-column>
      <el-table-column
        prop="detail"
        label="比赛">
      </el-table-column>
    </el-table>
    </el-tab-pane>
    <el-tab-pane  stretch='true' label="项目" name="second">配置管理</el-tab-pane>
    <el-tab-pane stretch='true'  label="场馆" name="third">角色管理</el-tab-pane>
  </el-tabs>
</template>
<script>
  export default {
    data() {
      return {
                activeName: 'first',
        timeTableData:[{
          time:2022,
          detail:111
        }]
      };
    },
    methods: {
    }
  };
</script>
<style scoped>
.el-tabs{
  position: relative;
  left: 40px;
  width: 250px;
  height: 600px;
  overflow-y: hidden;
  overflow-x: hidden;
  top:5px;
}
.el-tabs {
  overflow: scroll;
  -ms-overflow-style: none;
  /** //IE 10+*/
  overflow: -moz-scrollbars-none;
  /** Firefox */
}
.mytabel{
  background: black;
  overflow: hidden;
}
/*整个滚动条样式*/
.el-tabs::-webkit-scrollbar {
  width: 8px - 1px;
  height: 8px;
  background: transparent;
}

/*设置滚动条上的滚动滑块样式*/
.el-tabs::-webkit-scrollbar-thumb {
  background: transparent;
  -webkit-box-shadow: none;
  box-shadow: none;
}

/*鼠标位于内容上时，滚动条样式*/
.el-tabs:hover::-webkit-scrollbar {
  width: 8px - 1px;
  height: 8px;
  background: transparent;
  border-radius: 6px;
}

/*鼠标位于内容上时，滚动滑块样式*/
.el-tabs:hover::-webkit-scrollbar-thumb {
  background-color: #c1c1c1;
  -webkit-box-shadow: inset 0 0 (8px - 1px) rgba(193, 193, 193, 0.3);
  box-shadow: none;
  border-radius: 10px;
}
</style>