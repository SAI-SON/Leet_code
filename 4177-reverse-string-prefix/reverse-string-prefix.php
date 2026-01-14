class Solution {

    /**
     * @param String $s
     * @param Integer $k
     * @return String
     */
    function reversePrefix($s, $k) {
        return strrev(substr($s,0,$k)).substr($s,$k);
    }
}