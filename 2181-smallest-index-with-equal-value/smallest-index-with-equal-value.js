/**
 * @param {number[]} nums
 * @return {number}
 */
var smallestEqual = function(nums) {
    let size=nums.length;
    for(let i=0;i<size;i++){
        if(nums[i]==i%10)
        return i;
    }
    return -1;
};