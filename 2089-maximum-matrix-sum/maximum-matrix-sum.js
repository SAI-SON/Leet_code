/**
 * @param {number[][]} matrix
 * @return {number}
 */
var maxMatrixSum = function(matrix) {
    let min=Number.MAX_VALUE;
    let count=0;
    let t=0;
    for(let i of matrix){
        for(let j of i){
            t+=Math.abs(j);
            if(j<0) count++;
            min=Math.min(min,Math.abs(j));
        }
    }
    return count%2==0?t:t-2*min;
};