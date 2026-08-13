class Solution {
    public List<List<Integer>> combine(int n, int k) {
        
        //System.out.println(Arrays.toString(arr));
        List<List<Integer>> list=new ArrayList<>();
        bt(n,list,new ArrayList<>(),1,k,new HashSet<>());
        return list;
    }
    void bt(int n,List<List<Integer>> list,List<Integer> curr,int index,int k,Set<List<Integer>> set){
        if(index>n+1) return;
        if(curr.size()==k){
            if(set.add(new ArrayList<>(curr)))
            list.add(new ArrayList<>(curr));
            return ;
        }
        curr.add(index);
        bt(n,list,curr,index+1,k,set);
        curr.remove(curr.size()-1);
        bt(n,list,curr,index+1,k,set);

 
    }
}