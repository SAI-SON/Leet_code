class Solution {
    public int missingMultiple(int[] nums, int k) {
        Set<Integer> set=new HashSet<>();
        for(int i:nums){
            set.add(i);
        }
        int target=k;
        while(set.contains(target)){
            target+=k;
        }
        return target;
    }
}