class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        int sum=Arrays.stream(apple).sum();
        capacity=Arrays.stream(capacity).boxed().sorted(Collections.reverseOrder()).mapToInt(Integer::intValue).toArray();
        int box=0;
        for(int i=0;i<capacity.length;i++){
            sum-=capacity[i];
            box++;
            if(sum<=0) break;
        }
        return box;
    }
}