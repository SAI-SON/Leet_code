class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String>list=new ArrayList<>();
        int c=1;
        for(int i=0,j=0;j<target.length;i++){
            if(target[j]==i+1){
                list.add("Push");
                j++;
            }
            else{
                list.add("Push");
                list.add("Pop");
            }
        }
        return list;
    }
}