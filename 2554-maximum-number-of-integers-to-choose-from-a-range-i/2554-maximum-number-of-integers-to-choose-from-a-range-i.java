class Solution {
    public int maxCount(int[] banned, int n, int maxSum) {
        Set<Integer> set=new HashSet<>();
        int count=0;
        int sum=0;
        for(int i:banned){
            set.add(i);
        }
        for(int i=0;i<=n;i++){
            if(set.add(i)){
                if(sum+i<=maxSum){
                    sum+=i;
                    count++;
                }
            }
        }
        return count-1;
    }
}