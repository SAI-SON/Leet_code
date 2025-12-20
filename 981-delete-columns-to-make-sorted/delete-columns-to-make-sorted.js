/**
 * @param {string[]} strs
 * @return {number}
 */
var minDeletionSize = function(strs) {
    let c=0;
    for(var i=0;i<strs[0].length;i++){
        for(var j=0;j<strs.length-1;j++){
            if(strs[j][i]>strs[j+1][i]){
                c++;
                break;
            }
        }
    }
    return c;
};