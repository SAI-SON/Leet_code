class Solution {

    /**
     * @param Integer[] $nums
     * @return Integer
     */
    function maximumXOR($nums) {
        return array_reduce($nums,fn($a,$b)=>$a|$b,0);
    }
}