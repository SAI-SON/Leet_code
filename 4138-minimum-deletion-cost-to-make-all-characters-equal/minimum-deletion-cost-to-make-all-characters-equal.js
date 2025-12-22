/**
 * @param {string} s
 * @param {number[]} cost
 * @return {number}
 */
var minCost = function(s, cost) {
    let arr=new Array(26).fill(0);
    let total=0
    for(let i=0;i<cost.length;i++){
        total+=cost[i];
        arr[s.charCodeAt(i)-'a'.charCodeAt(0)]+=cost[i];
    }
    let max=0;
    for(let x of arr){
        max=Math.max(max,x);
    }
    return total-max;
};