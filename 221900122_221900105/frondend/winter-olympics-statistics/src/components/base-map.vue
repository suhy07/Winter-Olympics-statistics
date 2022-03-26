<template>
  <div class="map-container">
    <div id="map"></div>
      <div class="map-card-medallist">
        <div class="map-card-countryname">
          <span>{{country}}</span>
        </div>
        <div class="map-card-rank">
          <span>金牌榜第{{rank}}名</span>
        </div>
        <div class="map-card-gold">
          <div></div>
          <div class="map-card-text">金</div>
          <div class="map-card-text">{{gold}}</div>
          <img class="map-card-img map-card-img-gold" src="@/assets/gold.png"/>
        </div>
        <div class="map-card-gray">
          <div class="map-card-text">银</div>
          <div class="map-card-text">{{gray}}</div>
          <img class="map-card-img map-card-img-gray" src="@/assets/gray.png"/>
        </div>
        <div class="map-card-bronze">
          <div class="map-card-text">铜</div>
          <div class="map-card-text">{{bronze}}</div>
          <img class="map-card-img map-card-img-bronze" src="@/assets/bronze.png"/>
        </div>
      </div>
    <div class="map-tip" @click="test">
      <div class="map-tip-radius map-tip1">&nbsp;</div>
      <div class="map-tip-radius map-tip2">&nbsp;</div>
      <div class="map-tip-radius map-tip3">&nbsp;</div>
      <div class="map-tip-radius map-tip4">&nbsp;</div>
      <div class="map-tip-radius map-tip5">&nbsp;</div>
    </div>

  </div>
</template>
<script>
import world from '../datas/DataMap/world.json'
import {getMapMedalList} from "@/api/medal";
export default {
  name: "base-map", 
  data() {
    return {
      country: '中国',
      rank: 3,
      gold: 9,
      gray: 4,
      bronze: 2,
      value: "world",
      map:null,
    //   注册地图json
       jsonMap: { 
        'world':world,
        },
        // 全球数据
    worldData :[
     

        ],
// 全球地域中文映射
nameMap : {
    'Afghanistan':'阿富汗',
    'Albania':'阿尔巴尼亚',
    'Algeria':'阿尔及利亚',
    'Andorra':'安道尔',
    'Angola':'安哥拉',
    'Antarctica':'南极洲',
    'Antigua and Barbuda':'安提瓜和巴布达',
    'Argentina':'阿根廷',
    'Armenia':'亚美尼亚',
    'Australia':'澳大利亚',
    'Austria':'奥地利',
    'Azerbaijan':'阿塞拜疆',
    'The Bahamas':'巴哈马',
    'Bahrain':'巴林',
    'Bangladesh':'孟加拉国',
    'Barbados':'巴巴多斯',
    'Belarus':'白俄罗斯',
    'Belgium':'比利时',
    'Belize':'伯利兹',
    'Benin':'贝宁',
    'Bermuda':'百慕大',
    'Bhutan':'不丹',
    'Bolivia':'玻利维亚',
    'Bosnia and Herzegovina':'波斯尼亚和黑塞哥维那',
    'Botswana':'博茨瓦纳',
    'Brazil':'巴西',
    'Brunei':'文莱',
    'Bulgaria':'保加利亚',
    'Burkina Faso':'布基纳法索',
    'Burundi':'布隆迪',
    'Cambodia':'柬埔寨',
    'Cameroon':'喀麦隆',
    'Canada':'加拿大',
    'Cape Verde':'佛得角',
    'Central African Rep.':'中非共和国',
    "Côte d'Ivoire":'象牙海岸',
    'Chad':'乍得',
    'Chile':'智利',
    'China':'中国',
    'Colombia':'哥伦比亚',
    'Comoros':'科摩罗',
    'Dem. Rep. Congo':'刚果共和国',
    'Congo':'刚果',
    'Costa Rica':'哥斯达黎加',
    'Croatia':'克罗地亚',
    'Cuba':'古巴',
    'Cyprus':'塞浦路斯',
    'Czech Republic':'捷克共和国',
    'Denmark':'丹麦',
    'Djibouti':'吉布提',
    'Dominica':'多米尼加',
    'Dominican Republic':'多明尼加共和国',
    'Ecuador':'厄瓜多尔',
    'Egypt':'埃及',
    'El Salvador':'萨尔瓦多',
    'Equatorial Guinea':'赤道几内亚',
    'Eritrea':'厄立特里亚',
    'Estonia':'爱沙尼亚',
    'Ethiopia':'埃塞俄比亚',
    'Falkland Islands':'福克兰群岛',
    'Faroe Islands':'法罗群岛',
    'Fiji':'斐济',
    'Finland':'芬兰',
    'France':'法国',
    'French Guiana':'法属圭亚那',
    'French Southern and Antarctic Lands':'法属南半球和南极领地',
    'Gabon':'加蓬',
    'Gambia':'冈比亚',
    'Gaza Strip':'加沙',
    'Georgia':'格鲁吉亚',
    'Germany':'德国',
    'Ghana':'加纳',
    'Greece':'希腊',
    'Greenland':'格陵兰',
    'Grenada':'格林纳达',
    'Guadeloupe':'瓜德罗普',
    'Guatemala':'危地马拉',
    'Guinea':'几内亚',
    'Guinea Bissau':'几内亚比绍',
    'Guyana':'圭亚那',
    'Haiti':'海地',
    'Honduras':'洪都拉斯',
    'Hong Kong':'香港',
    'Hungary':'匈牙利',
    'Iceland':'冰岛',
    'India':'印度',
    'Indonesia':'印尼',
    'Iran':'伊朗',
    'Iraq':'伊拉克',
    'Iraq-Saudi Arabia Neutral Zone':'伊拉克阿拉伯中立区',
    'Ireland':'爱尔兰',
    'Isle of Man':'马恩岛',
    'Israel':'以色列',
    'Italy':'意大利',
    'Ivory Coast':'科特迪瓦',
    'Jamaica':'牙买加',
    'Jan Mayen':'扬马延岛',
    'Japan':'日本',
    'Jordan':'约旦',
    'Kazakhstan':'哈萨克斯坦',
    'Kenya':'肯尼亚',
    'Kerguelen':'凯尔盖朗群岛',
    'Kiribati':'基里巴斯',
    'North Korea':'北朝鲜',
    'South Korea':'韩国',
    'Kuwait':'科威特',
    'Kyrgyzstan':'吉尔吉斯斯坦',
    'Lao PDR':'老挝',
    'Latvia':'拉脱维亚',
    'Lebanon':'黎巴嫩',
    'Lesotho':'莱索托',
    'Liberia':'利比里亚',
    'Libya':'利比亚',
    'Liechtenstein':'列支敦士登',
    'Lithuania':'立陶宛',
    'Luxembourg':'卢森堡',
    'Macau':'澳门',
    'Macedonia':'马其顿',
    'Madagascar':'马达加斯加',
    'Malawi':'马拉维',
    'Malaysia':'马来西亚',
    'Maldives':'马尔代夫',
    'Mali':'马里',
    'Malta':'马耳他',
    'Martinique':'马提尼克',
    'Mauritania':'毛里塔尼亚',
    'Mauritius':'毛里求斯',
    'Mexico':'墨西哥',
    'Moldova':'摩尔多瓦',
    'Monaco':'摩纳哥',
    'Mongolia':'蒙古',
    'Morocco':'摩洛哥',
    'Mozambique':'莫桑比克',
    'Myanmar':'缅甸',
    'Namibia':'纳米比亚',
    'Nepal':'尼泊尔',
    'Netherlands':'荷兰',
    'New Caledonia':'新喀里多尼亚',
    'New Zealand':'新西兰',
    'Nicaragua':'尼加拉瓜',
    'Niger':'尼日尔',
    'Nigeria':'尼日利亚',
    'Northern Mariana Islands':'北马里亚纳群岛',
    'Norway':'挪威',
    'Oman':'阿曼',
    'Pakistan':'巴基斯坦',
    'Panama':'巴拿马',
    'Papua New Guinea':'巴布亚新几内亚',
    'Paraguay':'巴拉圭',
    'Peru':'秘鲁',
    'Philippines':'菲律宾',
    'Poland':'波兰',
    'Portugal':'葡萄牙',
    'Puerto Rico':'波多黎各',
    'Qatar':'卡塔尔',
    'Reunion':'留尼旺岛',
    'Romania':'罗马尼亚',
    'Russia':'俄罗斯',
    'Rwanda':'卢旺达',
    'San Marino':'圣马力诺',
    'Sao Tome and Principe':'圣多美和普林西比',
    'Saudi Arabia':'沙特阿拉伯',
    'Senegal':'塞内加尔',
    'Seychelles':'塞舌尔',
    'Sierra Leone':'塞拉利昂',
    'Singapore':'新加坡',
    'Slovakia':'斯洛伐克',
    'Slovenia':'斯洛文尼亚',
    'Solomon Islands':'所罗门群岛',
    'Somalia':'索马里',
    'S. Sudan':'苏丹',
    'South Africa':'南非',
    'Spain':'西班牙',
    'Sri Lanka':'斯里兰卡',
    'St. Christopher-Nevis':'圣',
    'St. Lucia':'圣露西亚',
    'St. Vincent and the Grenadines':'圣文森特和格林纳丁斯',
    'Sudan':'苏丹',
    'Suriname':'苏里南',
    'Svalbard':'斯瓦尔巴特群岛',
    'Swaziland':'斯威士兰',
    'Sweden':'瑞典',
    'Switzerland':'瑞士',
    'Syria':'叙利亚',
    'Taiwan':'台湾',
    'Tajikistan':'塔吉克斯坦',
    'United Republic of Tanzania':'坦桑尼亚',
    'Thailand':'泰国',
    'Togo':'多哥',
    'Tonga':'汤加',
    'Trinidad and Tobago':'特里尼达和多巴哥',
    'Tunisia':'突尼斯',
    'Turkey':'土耳其',
    'Turkmenistan':'土库曼斯坦',
    'Tanzania':'坦桑尼亚',
    'Turks and Caicos Islands':'特克斯和凯科斯群岛',
    'Uganda':'乌干达',
    'Ukraine':'乌克兰',
    'United Arab Emirates':'阿联酋',
    'United Kingdom':'英国',
    'United States':'美国',
    'Uruguay':'乌拉圭',
    'Uzbekistan':'乌兹别克斯坦',
    'Vanuatu':'瓦努阿图',
    'Venezuela':'委内瑞拉',
    'Vietnam':'越南',
    'Western Sahara':'西撒哈拉',
    'Western Samoa':'西萨摩亚',
    'Yemen':'也门',
    'Yugoslavia':'南斯拉夫',
    'Democratic Republic of the Congo':'刚果民主共和国',
    'Zambia':'赞比亚',
    'Zimbabwe':'津巴布韦',
    'South Sudan':'南苏丹',
    'Somaliland':'索马里兰',
    'Montenegro':'黑山',
    'Kosovo':'科索沃',
    'Republic of Serbia':'塞尔维亚',
},
    };
  },
  created(){
    //   循环注册地图
              this.initMedal();
 for (let index in this.jsonMap) {
        this.$echarts.registerMap(index, this.jsonMap[index])
        }; 
  },
   mounted(){
    //    初始化地图
     this.mapConfigure(this.value);
          this.initMedal();

  },
//   更新数据
   beforeDestroy() {
    if (!this.map) {
      return;
    }
    this.map.dispose();
    this.map = null;
  },
  methods:{
    initMedal(){
      var t=getMapMedalList()
      console.log(t)
      t.then((result)=>{
        console.log(result)
        this.worldData=result.medalmapList.sort(function(a,b){
          return a.rank-b.rank
        })
            if (!this.map) {
      return;
    }
    this.map.dispose();
    this.map = null;
       this.mapConfigure(this.value);
       })
      },
    mapConfigure(area) {
      this.map = this.$echarts.init(document.getElementById("map")); //这里是为了获得容器所在位置        
      window.onresize = this.map.resize;
      let option={ // 进行相关配置
        tooltip: {
        trigger: 'item',
        formatter: function(params) {
        var res = params.name+'<br/>'+"金牌："+params.data.gold+'<br/>'+"银牌："
        +params.data.silver+'<br/>'+"铜牌："+params.data.copper+'<br/>';
        return res;}
          }, // 鼠标移到图里面的浮动提示框
          visualMap: {
            show:false,
            min: 0,
            max: 30,
            calculable: false,
            inRange: {
                color: ['#F2F2F2','#81ECEC','#74B9FF','#55EFC4','#A29BFE','#0984E3']
              }
                  },

        series: [{
        type: 'map',
        map: area,
        data: this.worldData,
        nameMap: this.nameMap,
        label: {
                    show:false,
                    normal: {
                        show: false,
                        color:"#fff",
                    },
                    emphasis: {
                        show: true,
                        fontSize:16,
                        color:"#fff"

                    }
                },
        itemStyle: {
                    normal: {
                        areaColor: '#F2F2F2',
                        borderColor: '#FFF'
                    },
                    emphasis: {//鼠标移入高亮显颜色
                        areaColor: '#E056FD'
                    }
         }
    }]
        };
        var _self=this;
        this.map.setOption(option,true);
        this.map.on('mouseover',function(params){
          _self.country=params.name;
          _self.rank=params.data.rank;
          _self.gold=params.data.gold;
          _self.gray=params.data.silver;
          _self.bronze=params.data.copper;
        })
    },
    test(){
      this.country="测试"
      console.log("测试")
    }
  }
};
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
.map-container {
  background-image: url("../assets/MapBackground.png");
  background-size: 100% 100%;
  position: relative;
  width: 100%;
  height: 100%;
}
#map{
  position: absolute;
  top:-25%;
  width: 100%;
  height: 120%;
}
.map-card-medallist{
  position: relative;
  padding: 2% 0px 0px 2%;
  top: 61%;
  left: 65%;
  width: 19%;
  height: 35%;
  background: inherit;
  background-color: rgba(255, 255, 255, 1);
  border-width: 1px;
  border-radius: 36px;
  box-shadow: 0px 0px 10px rgb(170 170 170 / 35%);
  border-style: dotted;
  border-color: rgb(0, 0, 0);
  background: #FFF;
}
.map-card-countryname{
  border-width: 0px;
  background: inherit;
  background-color: rgba(255, 255, 255, 0);
  font-family: 'Arial Negreta', 'Arial Normal', 'Arial', sans-serif;
  font-weight: 700;
  font-style: normal;
  font-size: 25px;
  letter-spacing: 2px;
}
.map-card-rank{
  border-width: 0px;
  display: flex;
  font-size: 22px;
  letter-spacing: 1px;
  color: #AAAAAA;
  padding: 20px 0 13px 0;
}
.map-card-text{
  display: inline-block;
  width: 20px;
  position: relative;
  top: -10px;
  padding: 0 30px 0 0;
  font-family: 'Arial Normal', 'Arial', sans-serif;
  font-style: normal;
  font-size: 25px;
  color: #333333;
  text-align: center;
}
.map-card-img{

}
.map-tip{
  position: relative;
  top: 218px;
  left: 180px;
}
.map-tip-radius{
  width: 30px;
  height: 30px;
  margin: 0 0 25px 0;
  background-color: #75BFE2;
  border-width: 1px;
  border-radius: 36px;
}
.map-tip1{
  background-color: #75BFE2;
}
.map-tip2{
  background-color: #71ADE8;
}
.map-tip3{
  background-color: #55EFC4;
}
.map-tip4{
  background-color: #A29BFE;
}
.map-tip5{
  background-color: #0984E3;
}
</style>
