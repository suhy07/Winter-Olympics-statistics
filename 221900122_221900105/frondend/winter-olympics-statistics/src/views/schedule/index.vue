<template> 
    <div class="schedule-container">
        <div class="schedule-card schedule-body">
            <div class="schedule-card schedule-title">
                <div class="schedule-text">每日赛程</div>
            </div>
            <div class="schedule-select">
                <el-select v-model="value1" multiple placeholder="请选择日期">
                    <el-option
                        v-for="item in options"
                        :key="item.value"
                        :label="item.label"
                        :value="item.value">
                    </el-option>
                </el-select>
                <el-select
                    v-model="value2"
                    multiple
                    collapse-tags
                    style="margin-left: 20px;"
                    placeholder="请选择大项">
                    <el-option
                        v-for="item in options"
                        :key="item.value"
                        :label="item.label"
                        :value="item.value">
                    </el-option>
                </el-select>
                <el-select
                    v-model="value2"
                    multiple
                    collapse-tags
                    style="margin-left: 20px;"
                    placeholder="请选择场馆">
                    <el-option
                        v-for="item in options"
                        :key="item.value"
                        :label="item.label"
                        :value="item.value">
                    </el-option>
                </el-select>
            </div>
            <div class="schedule-table">
                <el-table
                    :data="tableData"
                    style="width: 100%"
                    :default-sort = "{prop: 'time', order: 'descending'}">
                    <el-table-column
                        prop="time"
                        label="时间"
                        sortable
                        width="180"
                        >
                    </el-table-column>
                    <el-table-column
                        prop="major"
                        label="大项"
                        sortable
                        width="180"
                        >
                    </el-table-column>
                    <el-table-column
                        prop="match"
                        label="比赛"
                        >
                    </el-table-column>
                    <el-table-column
                        prop="venue"
                        label="场馆"
                        >
                    </el-table-column>
                    <el-table-column
                        prop="status"
                        label="比赛状态"
                    >
                    </el-table-column>
                    <el-table-column
                        prop="url"
                        label="数据"
                    >
                    </el-table-column>
                </el-table>
            </div>
        </div>
    </div>
</template>
<script>
export default{
    data() {
        return {
            tableData: [{
                time: '11日09:05',
                major: '王小虎',
                match: '男子冰壶循环赛第3轮 瑞士6:3俄罗斯奥运队',
                venue: '国家游泳中心',
                status:'已结束',
                url:'成绩公报'
            }, {
                time: '11日09:05',
                major: '王小虎',
                match: '男子冰壶循环赛第3轮 瑞士6:3俄罗斯奥运队',
                venue: '国家游泳中心',
                status:'已结束',
                url:'成绩公报'
            }, {
                time: '11日16:40',
                major: '王小虎',
                match: '男子冰壶循环赛第3轮 瑞士6:3俄罗斯奥运队',
                venue: '国家游泳中心',
                status:'已结束',
                url:'成绩公报'
            }, {
                time: '11日20:01',
                major: '王小虎',
                match: '男子冰壶循环赛第3轮 瑞士6:3俄罗斯奥运队',
                venue: '国家游泳中心',
                status:'已结束',
                url:'成绩公报'
            },{
                time: '11日09:05',
                major: '王小虎',
                match: '男子冰壶循环赛第3轮 瑞士6:3俄罗斯奥运队',
                venue: '国家游泳中心',
                status:'已结束',
                url:'成绩公报'
            }, {
                time: '11日09:05',
                major: '王小虎',
                match: '男子冰壶循环赛第3轮 瑞士6:3俄罗斯奥运队',
                venue: '国家游泳中心',
                status:'已结束',
                url:'成绩公报'
            }, {
                time: '11日16:40',
                major: '王小虎',
                match: '男子冰壶循环赛第3轮 瑞士6:3俄罗斯奥运队',
                venue: '国家游泳中心',
                status:'已结束',
                url:'成绩公报'
            }, {
                time: '11日20:01',
                major: '王小虎',
                match: '男子冰壶循环赛第3轮 瑞士6:3俄罗斯奥运队',
                venue: '国家游泳中心',
                status:'已结束',
                url:'成绩公报'
            },{
                time: '11日09:05',
                major: '王小虎',
                match: '男子冰壶循环赛第3轮 瑞士6:3俄罗斯奥运队',
                venue: '国家游泳中心',
                status:'已结束',
                url:'成绩公报'
            }, {
                time: '11日09:05',
                major: '王小虎',
                match: '男子冰壶循环赛第3轮 瑞士6:3俄罗斯奥运队',
                venue: '国家游泳中心',
                status:'已结束',
                url:'成绩公报'
            }, {
                time: '11日16:40',
                major: '王小虎',
                match: '男子冰壶循环赛第3轮 瑞士6:3俄罗斯奥运队',
                venue: '国家游泳中心',
                status:'已结束',
                url:'成绩公报'
            }, {
                time: '11日20:01',
                major: '王小虎',
                match: '男子冰壶循环赛第3轮 瑞士6:3俄罗斯奥运队',
                venue: '国家游泳中心',
                status:'已结束',
                url:'成绩公报'
            },{
                time: '11日09:05',
                major: '王小虎',
                match: '男子冰壶循环赛第3轮 瑞士6:3俄罗斯奥运队',
                venue: '国家游泳中心',
                status:'已结束',
                url:'成绩公报'
            }, {
                time: '11日09:05',
                major: '王小虎',
                match: '男子冰壶循环赛第3轮 瑞士6:3俄罗斯奥运队',
                venue: '国家游泳中心',
                status:'已结束',
                url:'成绩公报'
            }, {
                time: '11日16:40',
                major: '王小虎',
                match: '男子冰壶循环赛第3轮 瑞士6:3俄罗斯奥运队',
                venue: '国家游泳中心',
                status:'已结束',
                url:'成绩公报'
            }, {
                time: '11日20:01',
                major: '王小虎',
                match: '男子冰壶循环赛第3轮 瑞士6:3俄罗斯奥运队',
                venue: '国家游泳中心',
                status:'已结束',
                url:'成绩公报'
            }]
        }
    },
    methods:{
           formatter(row, column) {
        return row.address;
      }
    }
}
</script>
<style scoped>
.schedule-container{
    position: absolute;
    top: 55px;
    width:80.3%;
}
.schedule-card{
    background-color: rgba(255, 255, 255, 1);
    border-width: 1px;
    border-radius: 188px;
    box-shadow: 0px 0px 10px rgb(170 170 170 / 35%);
    border-style: dotted;
    border-color: rgb(0, 0, 0);
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