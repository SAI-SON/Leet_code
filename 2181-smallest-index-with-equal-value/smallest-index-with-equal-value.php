class Solution {

    /**
     * @param Integer[] $nums
     * @return Integer
     */
    function smallestEqual($nums) {
        $size=count($nums);
        for($i=0;$i<$size;$i++){
            if($nums[$i]==$i%10) return $i;
        }
        return -1;
    }
}