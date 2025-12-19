/**
 * @param {number[]} nums
 * @param {number} k
 * @return {number}
 */
var smallestRangeI = function(nums, k) {
    min = Math.min(...nums);
    max = Math.max(...nums);
    return Math.max(0,(max-k)-(min+k));
};