/**
 * @param {number[]} nums
 * @param {number} k
 * @return {number}
 */
var minOperations = function(nums, k) {
    let mp=new Map();
    for(let n of nums){
        if(n<k) return -1;
        else if(n==k) continue;
        else mp.set(n,(mp.get(n)||0)+1);
    }
    return mp.size;
};