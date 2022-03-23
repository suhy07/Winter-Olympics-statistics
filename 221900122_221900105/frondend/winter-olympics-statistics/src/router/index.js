import Vue from 'vue'
import Router from 'vue-router'
import HelloWorld from '@/components/HelloWorld'

Vue.use(Router)

export const  constantRoutes= [
    {
      path: '/',
      name: 'HelloWorld',
      component: HelloWorld,
      meta: { 
        title: '项目列表', 
        keepAlive: true, // 需要被缓存
        icon: 'list', 
        noCache: true 
      }
    },
    {
      path: '/homepage',
      name: 'HomePage',
      component:  () => import('@/views/homepages/index'),
    },
]

const createRouter = () => new Router({
  mode: 'history', // require service support
  scrollBehavior: () => ({ y: 0 }),
  routes: constantRoutes
})

const router = createRouter()

export default router