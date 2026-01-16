class Solution {
    public int minOperations(int[] nums, int k) {
        Map<Integer,Integer>map=new HashMap<>();
        for(int n:nums){
            System.out.println(n);
            if(n<k) return -1;
            else if(n==k) continue;
            else{
                map.put(n,map.getOrDefault(n,0)+1);
            }
        }
        return map.size();
    }
}