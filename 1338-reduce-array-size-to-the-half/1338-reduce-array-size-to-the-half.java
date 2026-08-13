class Solution {
    public int minSetSize(int[] arr) {
        Map<Integer,Integer>map=new HashMap<>();
        for(int i:arr){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        PriorityQueue<Map.Entry<Integer,Integer>> pq=new PriorityQueue<>(
            (a,b)-> b.getValue()-a.getValue()
        );
        int half=arr.length/2;
        pq.addAll(map.entrySet());
        int sum=arr.length;
        int count=0;
        while(!pq.isEmpty()){
            Map.Entry<Integer,Integer> entry=pq.poll();
            sum-=entry.getValue();
            count++;
            if(half>=sum){
                return count;
            }
        }
        return count;
    }
}