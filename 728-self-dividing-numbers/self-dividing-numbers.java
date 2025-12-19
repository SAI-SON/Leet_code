class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list=new ArrayList<>();
        for(int i=left;i<=right;i++){
            if(i<=9) {
                list.add(i);
                continue;
            }
            if(divide(i)){
                list.add(i);
            }
        }
        return list;
    }
    public static boolean divide(int num){
        int or=num;
        while(num!=0){
            int rev=num%10;
            if(rev==0 || or%rev !=0)  return false;
            num/=10;
        }
        return true;
    }
}