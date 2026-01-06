/**
 * @param {number} num
 * @return {boolean}
 */
var completePrime = function(num) {
    function isPrime(n){
        if(2>n) return false;
        var i=2;
        while(i*i<=n){
            if(n%i==0){
                return false;
            }
            i++;
        }
        return true;
    }
    let s=num.toString();
    let n=s.length;
    for(var i=0;i<n;i++){
    let left=parseInt(s.substring(0,i+1));
    let right=parseInt(s.substring(n-i-1));
    if(!isPrime(left) || !isPrime(right)){
        return false;
    }
    }
    return true;
};