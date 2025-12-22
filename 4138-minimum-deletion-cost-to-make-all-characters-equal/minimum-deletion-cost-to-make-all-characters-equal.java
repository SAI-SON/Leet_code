class Solution {
    public long minCost(String s, int[] cost) {
        long total=0,max=0;
        long arr[]=new long[26];
        for(int i=0;i<s.length();i++){
            total+=cost[i];
            arr[s.charAt(i)-'a']+=cost[i];
            max=Math.max(max,arr[s.charAt(i)-'a']);
        }
        return total-max;
    }
}