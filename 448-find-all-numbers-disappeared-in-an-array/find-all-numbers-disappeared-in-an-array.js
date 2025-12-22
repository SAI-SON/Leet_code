/**
 * @param {number[]} nums
 * @return {number[]}
 */
var findDisappearedNumbers = function(nums) {
    let arr=new Array(nums.length+1).fill(0);
    let res=[];
    for(let x of nums){
        arr[x]++;
    }
    for(var i=1;i<=nums.length;i++){
        if(arr[i]==0){
            res.push(i);
        }
    }
    return res;
};