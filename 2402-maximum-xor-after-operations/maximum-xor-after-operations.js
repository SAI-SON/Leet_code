/**
 * @param {number[]} nums
 * @return {number}
 */
var maximumXOR = function(nums) {
    return nums.reduce((a,b)=>a|b,0);
};