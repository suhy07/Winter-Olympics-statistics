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
