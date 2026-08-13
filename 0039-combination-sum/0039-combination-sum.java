class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> list=new ArrayList<>();
        bt(candidates,target,list,new ArrayList<>(),0,0);
        return list;
    }
    void bt(int nums[],int target ,List<List<Integer>>list,List<Integer>curr,int index,int sum){
        if(index==nums.length){
            if(sum==target){
                list.add(new ArrayList<>(curr));
            }
            return ;
        }
        if(sum>target){
            return;
        }
        curr.add(nums[index]);
        sum+=nums[index];
        bt(nums,target,list,curr,index,sum);
        curr.remove(curr.size()-1);
        sum-=nums[index];
        bt(nums,target,list,curr,index+1,sum);
    }
}