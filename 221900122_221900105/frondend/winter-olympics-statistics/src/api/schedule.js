import axios from 'axios'
export async function getScheduleByDate(_date) {

    var data=await axios.get('/apis/api/schedule/date',{ 
        params:{
            date:_date
        }
    }).then(function(res){
        return res.data
    }).catch(function (error) {
        console.log(error);
    });
    return data
}
export async function getScheduleByPlace(_place) {

  var data=await axios.get('/apis/api/schedule/place',{
      params:{
          place:_place
      }
  }).then(function(res){
      return res.data
  }).catch(function (error) {
      console.log(error);
  });
  return data
}
export async function getScheduleByItem(_item) {

  var data=await axios.get('/apis/api/schedule/item',{
      params:{
          item:_item
      }
  }).then(function(res){
      return res.data
  }).catch(function (error) {
      console.log(error);
  });
  return data
}

