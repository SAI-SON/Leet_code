class Solution {
    public int largestAltitude(int[] gain) {
        int max=0;
        int f=0;
        for(int i:gain){
            f=f+i;
            if(max<f)
            max=f;
        }
        return max;
    }
}