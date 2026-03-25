class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result=new ArrayList<>();
        Arrays.sort(candidates);
        backtrack(candidates,target,0,new ArrayList<>(),result);
        return result;
    }
    private void backtrack(int c[],int t,int s,List<Integer>cur,List<List<Integer>> result){
        if(t==0){
            result.add(new ArrayList<>(cur));
            return ;
        }
        
        int c_length=c.length;
        for(int i=s;i<c_length;i++){
            
            if(t<c[i])
            break;

            cur.add(c[i]);
            backtrack(c,t-c[i],i,cur,result);
            cur.remove(cur.size()-1);
        }
    }
}