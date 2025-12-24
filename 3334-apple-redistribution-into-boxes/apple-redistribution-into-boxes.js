/**
 * @param {number[]} apple
 * @param {number[]} capacity
 * @return {number}
 */
var minimumBoxes = function(apple, capacity) {
    let sm=apple.reduce((a,b)=>a+b,0);
    capacity.sort((a,b)=>b-a);
    let c=0;
    for(let cap of capacity){
        sm-=cap;
        c++;
        if(sm<=0) break;
    }
    return c;
};