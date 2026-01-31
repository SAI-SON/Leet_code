/**
 * @param {character[]} letters
 * @param {character} target
 * @return {character}
 */
var nextGreatestLetter = function(letters, target) {
    let res=letters[0];
    flag=false;
    for(let i of letters){
        if(!flag){
            if(target < i){
                res=i;
                flag=!flag;
            }
        }
        else{
            if(target<i && i<res){
                res=i;
            }
        }
    }
    return res;
};