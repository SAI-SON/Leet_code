class Solution {
    public void separate(int num,List<Integer> list){
        if(num <10){
            list.add(num);
            return ;
        }
        ArrayList<Integer> dum=new ArrayList<>();
        while(num!=0){
            int rem=num%10;
            dum.add(rem);
            num/=10;
        }
        // System.out.println(dum);
        for(int i=dum.size()-1;i>=0;i--){
            list.add(dum.get(i));
        }

    }
    public int[] separateDigits(int[] nums) {
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        separate(nums[i],list);
        
        int arr[]=new int[list.size()];
        for(int i=0;i<list.size();i++){
            arr[i]=list.get(i);
        }
        return arr;
    }
}