class Solution {

    /**
     * @param Integer $n
     * @return Integer[]
     */
    function evenOddBit($n) {
        $even=$odd=$index=0;
        while($n>0){
            if(($n&1)==1){
                if($index%2==0) $even++;
                else $odd++;
            }
            $n>>=1;
            $index++;
        }
        return [$even,$odd];
    }
}