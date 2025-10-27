class Solution {
    public int numberOfBeams(String[] bank) {
        // int prev=0,co=0;
        List<Integer>list=new ArrayList<>();
        for(int i=0;i<bank.length;i++){
            int count=0;
            for(char c:bank[i].toCharArray()){
                if(c=='1')  count++;
            }
            if(count!=0)
            list.add(count);
            // System.out.println(list);
        }
        int sum=0;
        if(list.size()>1){
        for(int i=1;i<list.size();i++){
            sum+=list.get(i-1)*list.get(i);
        }
        }
        else{
            return 0;
        }
        return sum;
    }
}