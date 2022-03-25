<template>
  <div class="graph-container">
    <div ref="graph" style="width:100%;height:376px"></div>
  </div>
</template>
<script>
import echarts from 'echarts'
export default {
  data() {
    return {
    }},
    created(){
    },
    mounted(){
        this.init__();
    },
    methods:{
        init__(){
var chartDom = this.$refs.graph
var myChart = echarts.init(chartDom);
var option;

option = {
  tooltip: {
    trigger: 'axis',
    axisPointer: {
      type: 'shadow'
    }
  },
  legend: {
    data: ['Profit', 'Expenses', 'Income']
  },
  grid: {
    left: '3%',
    right: '4%',
    bottom: '3%',
    containLabel: true
  },
  xAxis: [
    {
      type: 'value'
    }
  ],
  yAxis: [
    {
      type: 'category',
      axisTick: {
        show: false
      },
      data: ['得分', '射门', '多打少', '争球', '被罚时间', '短手进球']
    }
  ],
  series: [
    {
      name: 'Income',
      type: 'bar',
      stack: 'Total',
      color: '#00CEC9',
      label: {
        show: true
      },
      emphasis: {
        focus: 'series'
      },
      data: [320, 302, 341, 374, 390, 450, 420]
    },
    {
      name: 'Expenses',
      type: 'bar',
      stack: 'Total',
      color: '#FD79A8',
      label: {
        show: true,
        position: 'left'
      },
      emphasis: {
        focus: 'series'
      },
      data: [-120, -132, -101, -134, -190, -230, -210]
    }
  ]
};

option && myChart.setOption(option);


        }
    },
};
</script>
<style scoped>
#graph{
  position: absolute;
  top:-25%;
  width: 100%;
  height: 120%;
}
</style>
