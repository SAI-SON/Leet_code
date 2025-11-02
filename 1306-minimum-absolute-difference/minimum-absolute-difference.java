class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> list=new ArrayList<>();
        Arrays.sort(arr);
        int min=Integer.MAX_VALUE;
        for(int i=1;i<arr.length;i++){
            min = Math.min(min,Math.abs(arr[i]-arr[i-1]));
        }
        for(int i=1;i<arr.length;i++){
            if(min==Math.abs(arr[i]-arr[i-1]))
            list.add(Arrays.asList(arr[i-1],arr[i]));
        }
        return list;

    }
}