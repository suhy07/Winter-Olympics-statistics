import axios from 'axios'
export async function getTitle(_documentcode) {

    var data=await axios.get('/apis/api/ice-ball-detail/title',{       // 还可以直接把参数拼接在url后边
        params:{
            documentcode:_documentcode
        }
    }).then(function(res){
        return res.data
    }).catch(function (error) {
        console.log(error);
    });
    return data
}
set1231(){
    
}
export function request(config) {
    // 1.创建axios的实例
    const instance = axios.create({
        baseURL:"api",
      timeout: 5000,
    })
      // 2.1.请求拦截的作用
    instance.interceptors.request.use(config => {
      return config
    }, err => {
      console.log(err);
    })
    // 2.2.响应拦截
    instance.interceptors.response.use(res => {
      return res.data
    }, err => {
      console.log(err);
    })
    // 3.发送真正的网络请求
    return instance(config)
  }
  

