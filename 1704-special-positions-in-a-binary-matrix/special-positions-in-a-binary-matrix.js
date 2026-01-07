/**
 * @param {number[][]} mat
 * @return {number}
 */
var numSpecial = function(mat) {
    let count=0;
    for(let i of mat){
        if(rowSum(i)===1){
            let index=i.indexOf(1);
            count+=(columnsum(mat,index)==1)?1:0;
        }
    }
    return count;
};
function rowSum(row){
    return row.reduce((a,b)=>a+b,0);
}
function columnsum(mat,index){
    let sum=0;
    for(let i of mat){
        sum+=i[index];
    }
    return sum;
}