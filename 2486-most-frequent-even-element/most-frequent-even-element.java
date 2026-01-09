class Solution {
    public int mostFrequentEven(int[] nums) {
        Map<Integer,Integer> map=new TreeMap<>();
        int fre=0;
        int res=-1;
        // int min=Integer.MAX_VALUE;
        for(int n:nums){
            if(n%2!=0) continue;
            map.put(n,map.getOrDefault(n,0)+1);
        }
            // System.out.println(min);
        for(int n:map.keySet()){
            if(fre<map.get(n) || (map.get(n)==fre && n<res)){
                fre=map.get(n);
                res=n;
            }
        }
        return res;
    }
}