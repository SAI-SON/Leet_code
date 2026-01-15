class Solution {
    public int[] numberOfLines(int[] widths, String s) {
        int r=1,c=0;
        for(char ch:s.toCharArray()){
            int width=widths[ch-'a'];
            r=width+c>100?r+1:r;
            c=width+c>100?width:width+c;
        }
        return new int[]{r,c};
    }
}