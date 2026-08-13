class Solution {
    public int singleNumber(int[] nums) {
        Set<Integer>set=new HashSet<>();
        Set<Integer>seen=new HashSet<>();
        int ans=0;
        for(int i:nums){
            if(!seen.add(i)){
                set.add(i);
            }
            // ans^=i;
        }
        seen.removeAll(set);
        return seen.iterator().next();
    }
}