class Solution {
    public int secondsBetweenTimes(String startTime, String endTime) {
        int s_T=findSeconds(startTime);
        int e_T=findSeconds(endTime);
        return e_T-s_T;
    }
    private int findSeconds(String s){
        int h=Integer.valueOf(s.substring(0,2));
        int m=Integer.valueOf(s.substring(3,5));
        int sec=Integer.valueOf(s.substring(6,8));
        return h*3600+m*60+sec;
    }
}