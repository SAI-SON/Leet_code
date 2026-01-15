class Solution {

    /**
     * @param Integer[] $widths
     * @param String $s
     * @return Integer[]
     */
    function numberOfLines($widths, $s) {
        $r=1;
        $c=0;
        foreach(str_split($s) as $ch){
            $width=$widths[ord($ch)-97];
            $r=$c + $width > 100 ? $r + 1 : $r;
            $c=$c + $width > 100 ? $width:$width+$c;
        }
        return [$r,$c];
    }
}