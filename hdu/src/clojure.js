/**
 * Created by xinrui on 09/01/17.
 */

var task=[];

for (var i=0;i<3;i++){
    //var fn = function(n){
        task.push(function(){
            console.log(n);
        })
    //}
    //fn(i);
}

for (var j=0;j<task.length;j++){
    task[j]();
}