import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router)

export const  constantRoutes= [
    {
      path: '/',
      component:  () => import('@/views/homepage/index'),
      meta:{
        title:'主页'
      }
    },
    {
      path: '/test',
      name: 'test',
      component:  () => import('@/views/homepage/components/h-goldlist'),
      meta:{
        title:'测试页面'
      }
    },
    {
      path: '/homepage',
      name: 'HomePage',
      component:  () => import('@/views/homepage/index'),
      meta:{
        title:'主页'
      }
    },
    {
      path: '/map',
      name: 'Map',
      component:  () => import('@/views/map/index'),
      meta:{
        title:'奖牌地图'
      }
    },
    {
      path: '/schedule',
      name: 'Schedule',
      component:  () => import('@/views/schedule/index'),
      meta:{
        title:'每日赛程'
      }
    },
    {
      path: '/total',
      name: 'Total',
      component:  () => import('@/views/total/index'),
      meta:{
        title:'奖牌总榜'
      }
    },
    {
      path: '/detail/ice-ball',
      name: 'DetailIceBall',
      component:  () => import('@/views/detail/ice-ball/index'),
      meta:{
        title:'测试页面'
      }
    },
    {
      path: "/404",
      name: "notFound",
      component: () => import('@/components/404'),
      hidden: true 
    },   
    {
      path: '*',
      redirect: '/404', 
      hidden: true 
    }
]

const createRouter = () => new Router({
  mode: 'history', // require service support
  scrollBehavior: () => ({ y: 0 }),
  routes: constantRoutes
})

const router = createRouter()

export default router