class Solution {

    /**
     * @param Integer[] $nums
     * @return Integer
     */
    function gcd($a,$b){
        return $b==0?$a:$this->gcd($b,$a%$b);
    }
    function countBeautifulPairs($nums) {
        $c=0;
        for($i=0;$i<count($nums);$i++){
            $first=intval(strval($nums[$i])[0]);
            for($j=$i+1;$j<count($nums);$j++){
                if($this->gcd($first,$nums[$j]%10)==1) $c++;
            }
        }
        return $c;
    }
}