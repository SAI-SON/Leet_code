class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list=new ArrayList<>();
        backtrack(nums,list,new ArrayList<>(),0);
        return list;
    }
    void backtrack(int nums[],List<List<Integer>> list, List<Integer> curr,int index){
        if(index==nums.length){
            list.add(new ArrayList<>(curr));
            return;
        }
        curr.add(nums[index]);
        backtrack(nums,list,curr,index+1);
        curr.remove(curr.size()-1);
        backtrack(nums,list,curr,index+1);
    }
}