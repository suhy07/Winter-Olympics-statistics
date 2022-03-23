import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router)

export const  constantRoutes= [
    {
      path: '/',
      name: 'HomePage',
      component:  () => import('@/views/homepages/index'),
      meta:{
        title:'主页'
      }
    },
    {
      path: '/homepage',
      name: 'HomePage',
      component:  () => import('@/views/homepages/index'),
      meta:{
        title:'主页'
      }
    },
]

const createRouter = () => new Router({
  mode: 'history', // require service support
  scrollBehavior: () => ({ y: 0 }),
  routes: constantRoutes
})

const router = createRouter()

export default router