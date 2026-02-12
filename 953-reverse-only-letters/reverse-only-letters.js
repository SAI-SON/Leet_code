/**
 * @param {string} s
 * @return {string}
 */
var reverseOnlyLetters = function(s) {
    let left=0;
    let right=s.length-1;
    let arr=s.split("");
    while(left<right){
        while(left<right && !/[a-zA-Z]/.test(arr[left])) left++;
        while(left<right && !/[a-zA-Z]/.test(arr[right])) right--;
        [arr[left],arr[right]]=[arr[right],arr[left]];
        left++;
        right--;
    }
    return arr.join("");
};