class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int copy[]=Arrays.copyOfRange(arr,0,arr.length);
        Arrays.sort(copy);
        Map<Integer,Integer> map=new TreeMap<>();
        int j=1;
        for(int i=0;i<copy.length;i++){
           if(!map.containsKey(copy[i]))
                map.putIfAbsent(copy[i],j++);
        }
        System.out.println(map);
        for(int i=0;i<arr.length;i++)
            arr[i]=map.get(arr[i]);
        return arr;
    }
}