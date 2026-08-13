class Solution {
    public int largestInteger(int n, int s) {
        if(s>9*n){
            return -1;
        }
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<n;i++){
            int d=Math.min(9,s);
            sb.append(d);
            s-=d;
        }
        int i=0;
        while(i<sb.length()-1 && sb.charAt(i)=='0'){
            i++;
        }
        return Integer.valueOf(sb.substring(i));
    }
}