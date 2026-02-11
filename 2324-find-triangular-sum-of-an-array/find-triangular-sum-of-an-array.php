class Solution {

    /**
     * @param Integer[] $nums
     * @return Integer
     */
    function triangularSum($nums) {
        $k=0;
        while($k<count($nums)){
            for($i=1;$i<count($nums)-$k;$i++){
                $nums[$i-1]=($nums[$i]+$nums[$i-1])%10;
            }
            $k++;
        }
        return $nums[0];
    }
}