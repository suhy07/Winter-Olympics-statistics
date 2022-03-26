import axios from 'axios'
export async function getMedalList() {

    var data=await axios.get('/apis/api/medal/data',{   
    params:{
        }
    }).then(function(res){
        return res.data
    }).catch(function (error) {
        console.log(error);
    });
    return data
}
export async function getMapMedalList() {

    var data=await axios.get('/apis/api/medal-map/data',{   
    params:{
        }
    }).then(function(res){
        return res.data
    }).catch(function (error) {
        console.log(error);
    });
    return data
}