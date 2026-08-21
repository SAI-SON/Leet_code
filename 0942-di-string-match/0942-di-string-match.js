/**
 * @param {string} s
 * @return {number[]}
 */
var diStringMatch = function(s) {
    let n=s.length;
    let arr=new Array(n+1);
    let left=0;
    let right=n;
    let i=0;
    for(let c of s){
        if(c=='I'){
            arr[i]=left;
            left++;
        }
        else{
            arr[i]=right;
            right--;
        }
        i++;
    }
    arr[i]=left;
    return arr;
};