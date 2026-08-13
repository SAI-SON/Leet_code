class Solution {
    public int[] singleNumber(int[] nums) {
        Set<Integer>set=new HashSet<>();
        Set<Integer>seen=new HashSet<>();
        for(int i:nums){
            if(!seen.add(i)){
                set.add(i);
            }
        }
        seen.removeAll(set);
        // System.out.println(seen+" "+set);
        int arr[]=new int[seen.size()];
        int j=0;
        for(int i:seen){
            arr[j]=i;
            j++;
        }
        return arr;
    }
}