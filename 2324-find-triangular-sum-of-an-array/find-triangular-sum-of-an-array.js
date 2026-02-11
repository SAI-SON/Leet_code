/**
 * @param {number[]} nums
 * @return {number}
 */
var triangularSum = function(nums) {
    let k=0;
    while(k<nums.length){
        for(let i=1;i<nums.length-k;i++){
            nums[i-1]=(nums[i]+nums[i-1])%10;
        }
        k++;
    }
    return nums[0];
};