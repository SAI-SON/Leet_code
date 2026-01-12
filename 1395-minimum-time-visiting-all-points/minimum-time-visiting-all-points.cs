public class Solution {
    public int MinTimeToVisitAllPoints(int[][] points) {
        int sum=0;
        for(int i=0;i<points.Length-1;i++){
            sum+=Math.Max(Math.Abs(points[i+1][0]-points[i][0]),Math.Abs(points[i+1][1]-points[i][1]));
                                        // System.out.println(sum);
        }
        return sum;
                                                            
    }
}