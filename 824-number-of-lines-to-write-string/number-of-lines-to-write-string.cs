public class Solution {
    public int[] NumberOfLines(int[] widths, string s) {
        int r=1,c=0;
        foreach(char ch in s){
            int width=widths[ch-'a'];
            r=width+c>100?r+1:r;
            c=width+c>100?width:width+c;
        }
        return new int[]{r,c};
    }
}
