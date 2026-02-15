/**
 * @param {string} a
 * @param {string} b
 * @return {string}
 */
var addBinary = function(a, b) {
    let br1=BigInt("0b"+a);
    let br2=BigInt("0b"+b);
    let res=br1+br2;
    return res.toString(2);
};