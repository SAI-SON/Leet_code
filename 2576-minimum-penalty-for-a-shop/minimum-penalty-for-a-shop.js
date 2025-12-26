/**
 * @param {string} customers
 * @return {number}
 */
var bestClosingTime = function(customers) {
    let c=0,max=0,minp=0;
    for(var i=0;i<customers.length;i++){
        if(customers[i]=='Y') c++;
        else c--;
        if(max<c){
            minp=i+1;
            max=c;
        }
    }
    return minp;
};