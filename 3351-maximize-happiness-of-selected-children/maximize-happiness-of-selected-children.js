/**
 * @param {number[]} happiness
 * @param {number} k
 * @return {number}
 */
var maximumHappinessSum = function(happiness, k) {
    happiness.sort((a,b)=>a-b);
    let val=0,sum=0;
    for(let i=0;i<k;i++){
        var last=happiness[happiness.length-i-1];
        last-=val;
        if(last<=0){
            break;
        }
        sum+=last;
        val++;
    }
    return sum;
};