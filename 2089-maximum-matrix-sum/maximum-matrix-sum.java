class Solution {
    public long maxMatrixSum(int[][] matrix) {
        int min=Integer.MAX_VALUE;
        long total=0;
        int count=0;
        for(int i[]:matrix){
            for(int j:i){
                total+=Math.abs(j);
                if(j<0) count++;
                min=Math.min(min,Math.abs(j));
            }
        }
        return count%2==0?total:total-2*min;
    }
}