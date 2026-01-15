/**
 * @param {number[]} widths
 * @param {string} s
 * @return {number[]}
 */
var numberOfLines = function(widths, s) {
    let r=1,c=0;
    for(let i of s){
        let width=widths[i.charCodeAt(0)-97];
        r=width+c>100?r+1:r;
        c=width+c>100?width:width+c;
    }
    return [r,c];
};