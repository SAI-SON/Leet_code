class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list=new ArrayList<>();
        boolean b[]=new boolean[nums.length];
        bt(nums,list,new ArrayList<>(),b);
        return list;
    }
    void bt(int arr[],List<List<Integer>>list ,List<Integer> curr,boolean b[]){
        if(curr.size()==arr.length){
            list.add(new ArrayList(curr));
            return ;
        }
        for(int i=0;i<arr.length;i++){
            if(b[i]){
                continue;
            }
            curr.add(arr[i]);
            b[i]=true;
            bt(arr,list,curr,b);
            curr.remove(curr.size()-1);
            b[i]=false;
        }
    }
}