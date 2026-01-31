/**
 * @param {number[]} nums
 * @return {number}
 */
var countElements = function(nums) {
    let c=0;
    let min=Math.min(...nums);
    let max=Math.max(...nums);
    for(let i of nums){
        if(min<i && max>i){
            c++;
        }
        else{
            continue;
        }
    }

    return c;
};