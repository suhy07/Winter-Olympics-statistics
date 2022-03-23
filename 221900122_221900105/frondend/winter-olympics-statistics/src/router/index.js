import Vue from 'vue'
import Router from 'vue-router'
import HelloWorld from '@/components/HelloWorld'

Vue.use(Router)

export const  constantRoutes= [
    {
      path: '/',
      name: 'HomePage',
      component:  () => import('@/views/homepages/index'),
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