class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        Map<Integer,Integer> map=new TreeMap<>();
        for(int i:arr1){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int res[]=new int[arr1.length];
        int k=0;
        for(int i=0;i<arr2.length;i++){
            for(int j=0;j<map.get(arr2[i]);j++){
                res[k++]=arr2[i];
            }
           map.put(arr2[i],0);
        }
        for(int i:map.keySet()){
            int count=map.get(i);
            for(int j=0;j<count;j++)
            {
                res[k++]=i;
            }
        }
        return res;
    }
}