/**
 * @param {string} s
 * @param {number} k
 * @return {string}
 */
var reversePrefix = function(s, k) {
    return s.substring(0,k).split('').reverse().join('')+s.substring(k,s.length);
};