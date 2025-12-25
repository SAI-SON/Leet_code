/**
 * @param {number[][]} grid
 * @return {number}
 */
var deleteGreatestValue = function(grid) {
    for(let r of grid){
        r.sort((a,b)=>a-b);
    }
    let sum=0;
    for(var i=0;i<grid[0].length;i++){
        var max=0;
        for(var j=0;j<grid.length;j++){
            max=Math.max(max,grid[j][i]);
        }
        sum+=max;
    }
    return sum;
};