/**
 * @param {string} s
 * @return {number}
 */
var balancedStringSplit = function(s) {
    let c=0,l=0,r=0;
    for(let ch of s){
        if(ch==='R') r++;
        if(ch==='L') l++;
        if(r===l) c++;
    }
    return c;
};