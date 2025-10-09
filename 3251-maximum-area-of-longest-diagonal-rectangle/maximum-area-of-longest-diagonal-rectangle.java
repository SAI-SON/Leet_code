class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        double max=0;
        int area=0;
        for(int []ar:dimensions){
            int d=ar[0]*ar[0]+ar[1]*ar[1];
            if(Math.sqrt(d)>max){
                max=Math.max(max,Math.sqrt(d));
                area=ar[0]*ar[1];
            }
            else if(Math.sqrt(d)==max)
             area=Math.max(area,ar[0]*ar[1]);
        }
        return area;
    }
}