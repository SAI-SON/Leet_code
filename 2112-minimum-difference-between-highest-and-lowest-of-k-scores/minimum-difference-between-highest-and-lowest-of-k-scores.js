/**
 * @param {number[]} nums
 * @param {number} k
 * @return {number}
 */
var minimumDifference = function(nums, k) {
    nums.sort((a,b)=>a-b);
    let min=Infinity;
    for(let i=0;i<nums.length-k+1;i++){
        min=Math.min(min,nums[i+k-1]-nums[i]);
    }
    return min;
};