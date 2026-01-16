/**
 * @param {number[]} nums
 * @return {number}
 */
var countBeautifulPairs = function(nums) {
    function gcd(a,b){
        if(b==0) return a;
        return gcd(b,a%b);
    }
    let c=0;
    for(let i=0;i<nums.length;i++){
        let first=Number(nums[i].toString()[0]);
        for(let j=i+1;j<nums.length;j++){
            if(gcd(first,nums[j]%10)==1) c++;
        }
    }
    return c;
};