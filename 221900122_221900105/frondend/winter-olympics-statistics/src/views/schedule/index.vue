<template> 
    <div class="schedule-container">
        <div class="schedule-card schedule-body">
            <div class="schedule-card schedule-title">
                <div class="schedule-text">每日赛程</div>
            </div>
            <div class="schedule-select">
                <el-select
                    v-model="date"
                    placeholder="请选择日期"
                    :clearable="true"
                    @change="search">
                    <el-option
                        v-for="item in dateOptions"
                        :key="item.value"
                        :label="item.label"
                        :value="item.value">
                    </el-option>
                </el-select>
                <el-select
                    v-model="item"
                    placeholder="请选择大项"
                    :clearable="true"
                    @change="search">
                    <el-option
                        v-for="item in itemOptions"
                        :key="item"
                        :label="item"
                        :value="item">
                    </el-option>
                </el-select>
                <el-select
                    v-model="place"
                    placeholder="请选择场馆"
                    :clearable="true"
                    @change="search">
                    <el-option
                        v-for="item in placeOptions"
                        :key="item"
                        :label="item"
                        :value="item">
                    </el-option>
                </el-select>
            </div>
            <div class="schedule-table">
                <el-table
                    :data="tableData"
                    style="width: 100%"
                    aline='center'
                    :default-sort = "{prop: 'startdatecn', order: 'descending'}">
                    <el-table-column
                        prop="startdatecn"
                        label="时间"
                        sortable
                        width="180"
                        >
                    </el-table-column>
                    <el-table-column
                        prop="itemcodename"
                        label="大项"
                        sortable
                        width="180"
                        >
                    </el-table-column>
                    <el-table-column
                        prop="title"
                        label="比赛"
                        >
                    </el-table-column>
                    <el-table-column
                        prop="venuename"
                        label="场馆"
                        >
                    </el-table-column>
                    <el-table-column
                        prop="statusname"
                        label="比赛状态"
                    >
                    </el-table-column>
                    <el-table-column
                        prop="url"
                        label="数据"
                    >
 <template slot-scope="scope">
        <el-button
          size="mini"
          @click="test(scope.$index, scope.row)">详细赛况</el-button>
      </template>
                    </el-table-column>
                </el-table>
            </div>
        </div>
    </div>
</template>
<script>
import  {getScheduleByDate} from "@/api/schedule"
import {getScheduleByPlace} from "@/api/schedule"
import {getScheduleByItem} from "@/api/schedule"
export default{
    data() {
        return {
            date:null,
            item:'冰球',
            place:null,
            tableData: [],
            dateOptions:[
                { 
                    label:'02月02日',
                    value:'02'
                },
                {   label:'02月03日',
                    value:'03'
                },
                {   label:'02月04日',
                    value:'04'
                },
                {   label:'02月05日',
                    value:'06'
                },
                {   label:'02月07日',
                    value:'07'
                },
                {   label:'02月08日',
                    value:'08'
                },
                {   label:'02月09日',
                    value:'09'
                },
                {   label:'02月10日',
                    value:'10'
                },
                {   label:'02月11日',
                    value:'11'
                },
                {   label:'02月12日',
                    value:'12'
                },
                {   label:'02月13日',
                    value:'13'
                },
                {   label:'02月14日',
                    value:'14'
                },
                {   label:'02月15日',
                    value:'15'
                },
                {   label:'02月16日',
                    value:'16'
                },
                {   label:'02月17日',
                    value:'17'
                },
                {   label:'02月18日',
                    value:'18'
                },
                {   label:'02月19日',
                    value:'19'
                },
                {   label:'02月20日',
                    value:'20'
                },
                ],
            itemOptions:['高山滑雪','雪车','雪橇','闭幕式','钢架雪车','速度滑冰','跳台滑雪','越野滑雪','花样滑冰','自由式滑雪','短道速滑'
            ,'开幕式','单板滑雪','北欧两项','冰球','冰壶','冬季两项'],
            placeOptions:['首钢滑雪大跳台','首都体育馆','国家高山滑雪中心','国家雪车雪橇中心','国家速滑馆','国家跳台滑雪中心','国家越野滑雪中心'
            ,'国家游泳中心','国家冬季两项中心','国家体育馆','五棵松体育中心','云顶滑雪公园']

        }
    },
     mounted(){
         this.initItemTable('冰球')
    },
    methods: {
        initItemTable(str){
        this.item=str
        var t=getScheduleByItem(str)
        console.log(t)
        t.then((result)=>{
        console.log(result)
        this.tableData=result.detailList
       })
      },
        initPlaceTable(str){
        this.place=str
        var t=getScheduleByPlace(str)
        console.log(t)
        t.then((result)=>{
        console.log(result)
        this.tableData=result.detailList
       })
      },
        initDateTable(str){
        this.date=str
        var t=getScheduleByDate(str)
        console.log(t)
        t.then((result)=>{
        console.log(result)
        this.tableData=result.detailList
       })
      },
      search(item){
          console.log("search")
          if((this.date==null||this.date=='')&&(this.item==null||this.item=='')){
              //place
                this.initPlaceTable(this.place)
            }else if((this.date==null||this.date=='')&&(this.place==null||this.place=='')){
                //item
                this.initItemTable(this.item)
            }else if((this.item==null||this.item=='')&&(this.place==null||this.place=='')){
                //date
                this.initDateTable(this.date)
            }else{
              
            }
        },test(index,row ){
            console.log(index)
            console.log(row)
            this.$router.push('/detail/ice-ball?documentcode='+row.documentcode)
        }
        
    }
}
</script>
<style scoped>
.schedule-container{
    position: absolute;
    top: 55px;
    width:1200px;
}
.schedule-card{
    background-color: rgba(255, 255, 255, 1);
    border-width: 1px;
    border-radius: 188px;
    box-shadow: 0px 0px 10px rgb(170 170 170 / 35%);
    border-style: dotted;
    border-color: #F2F2F2;
}
.schedule-text{
    display: inline-block;
    position: relative;
    top: 15px;
    left: 370px;
    background: inherit;
    background-color: rgba(255, 255, 255, 0);
    font-family: '华光标题宋_CNKI', sans-serif;
    font-style: normal;
    font-size: 25px;
    letter-spacing: 50px;
    color: #FFFFFF;
    margin: 0 85px 0 1px;
}
.schedule-img{
    position: relative;
    top:4px;
    left: 55px;
}
.schedule-body{
    position: absolute;
    padding: 100px 0;
    top:60px;
    left:5%;
    height: 1200px;
    width: 90%;
    border-radius: 60px;
}
.schedule-title{
    position:absolute;
    top: 60px;
    left: 5%;
    background-color: #4589D6;
    width: 90%;
    height: 55px;
}
.schedule-table{
    position: relative;
    top: 100px;
    height: 1100px;
    overflow-y: scroll;
}
.schedule-table::-webkit-scrollbar {
    width: 2px - 0px;
    height: 4px;
    background: transparent;
}
.schedule-table::-webkit-scrollbar-thumb {
    background: transparent;
    -webkit-box-shadow: none;
    box-shadow: none;
}
.schedule-table:hover::-webkit-scrollbar-thumb {
    background-color: #c1c1c1;
    -webkit-box-shadow: inset 0 0 (4px - 1px) rgba(193, 193, 193, 0.3);
    box-shadow: none;
    border-radius: 20px;
}
.schedule-select{
    position: relative;
    top: 40px;
    left: 190px;
}
</style>