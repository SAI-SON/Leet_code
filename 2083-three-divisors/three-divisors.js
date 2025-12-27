/**
 * @param {number} n
 * @return {boolean}
 */
var isThree = function(n) {
    let c=0;
    for(var i=1;i<=n;i++){
        if(n%i==0) c++;
        if(c>3) return false;
    }
    return c==3;
};