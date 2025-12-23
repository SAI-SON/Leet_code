/**
 * @param {number[]} candyType
 * @return {number}
 */
var distributeCandies = function(candyType) {
    let len=new Set(candyType).size;
    return Math.min(len,Math.floor(candyType.length/2));
};