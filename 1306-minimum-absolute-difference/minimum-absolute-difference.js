/**
 * @param {number[]} arr
 * @return {number[][]}
 */
var minimumAbsDifference = function(arr) {
    arr.sort((a,b)=>a-b);
    let res=[];
    let min=Infinity;
    for(let i=1;i<arr.length;i++){
        min=Math.min(min,arr[i]-arr[i-1]);
    }
    for(let i=1;i<arr.length;i++){
        if(Math.abs(arr[i-1]-arr[i])===min){
            res.push([arr[i-1],arr[i]]);
        }
    }
    return res;
};