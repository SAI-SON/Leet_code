/**
 * @param {number[]} nums
 * @return {number}
 */
var minOperations = function(nums) {
    let c=0;
    for(let i=1;i<nums.length;i++){
        if(nums[i-1]>=nums[i]){
            let adding=nums[i-1]-nums[i]+1;
            nums[i]+=adding;
            c+=adding;
        }
    }
    return c;
};