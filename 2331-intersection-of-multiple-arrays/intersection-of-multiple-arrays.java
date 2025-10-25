class Solution {
    public List<Integer> intersection(int[][] nums) {
        List<Integer>res=new ArrayList<>();
        // List<List<Integer>> list=new ArrayList<>();

        for(int i=0;i<nums[0].length;i++){
            res.add(nums[0][i]);
        }
        for(int i=1;i<nums.length;i++){
            List<Integer>row=new ArrayList<>();
            for(int j=0;j<nums[i].length;j++){
                row.add(nums[i][j]);
            }
            // list.add(row);
            res.retainAll(row);
        }
        Collections.sort(res);
        return res;

    }
}