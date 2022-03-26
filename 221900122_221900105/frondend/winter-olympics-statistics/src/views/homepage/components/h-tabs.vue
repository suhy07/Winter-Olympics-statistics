<template>
  <el-tabs v-model="activeName" type="card" @tab-click="handleClick">
    <el-tab-pane stretch='true' label="时间" name="first" width="300px">
      <el-table class="mytable"
      :show-header="false"
      :data="timeTableData">
      <el-table-column
        label="时间排序"
        >
        <img class="el-img" src="@/assets/clock.svg">
      </el-table-column>
      <el-table-column
        prop="startdatecn"
        label="时间"
        width="100px">
      </el-table-column>
      <el-table-column
        prop="title"
        label="比赛">
      </el-table-column>
    </el-table>
    </el-tab-pane>
    <el-tab-pane  label="项目" name="second">
      <el-table class="mytable"
      :show-header="false"
      :data="itemTableData">
      <el-table-column
        >
        <img class="el-img" :src="['./static/assets/高山滑雪.svg']">
      </el-table-column>
      <el-table-column
        prop="itemcodename"
        label="项目"
        width="100px">
      </el-table-column>
      <el-table-column
        prop="title"
        label="比赛">
      </el-table-column>
    </el-table>
    </el-tab-pane>
    <el-tab-pane label="场馆" name="third">
      <el-table class="mytable"
      :show-header="false"
      :data="placeTableData">
      <el-table-column
        label="时间排序"
        >
          <img class="el-img" src="@/assets/体育馆1.png">
      </el-table-column>
      <el-table-column
        prop="venuename"
        label="场馆"
        width="100px">
      </el-table-column>
      <el-table-column
        prop="title"
        label="比赛">
      </el-table-column>
    </el-table>
    </el-tab-pane>
  </el-tabs>
</template>
<script>
import  {getScheduleByDate} from "@/api/schedule"
import getScheduleByPlace from "@/api/schedule"
import getScheduleByItem from "@/api/schedule"
export default {
    data() {
      return {
      activeName: 'first',
        timeTableData:[],
        placeTableData:[],
        itemTableData:[],
      };
    },
    mounted(){
      this.initTimeTable()
    },
    methods: {
      initTimeTable(){
              var t=getScheduleByDate(20)
      console.log(t)
      t.then((result)=>{
        console.log(result)
        this.timeTableData=(result.detailList)
        this.placeTableData=this.timeTableData
        this.itemTableData=this.timeTableData
       })

      }
    }
  };
</script>
<style scoped>
.tableTransparent /deep/  .el-table, .el-table__expanded-cell {
    background-color: transparent;
}

.tableTransparent /deep/ .el-table tr {
    background-color: rgba(255, 255, 255, 0.1 ) !important;
}
.tableTransparent >>> .el-table th{
    background-color: rgba(245,247,250, 0.5 ) !important;
}
.tableTransparent >>> .el-table tr:hover {
    background: rgba(245,247,250, 0.1 ) !important;
}
.el-img{
  width: 50px;
}
.el-tabs{
  position: relative;
  left: 40px;
  width: 260px;
  height: 550px;
  overflow-y: hidden;
  overflow-x: hidden;
  top:15px;
}
.el-tabs__items{
  width: 200px;
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