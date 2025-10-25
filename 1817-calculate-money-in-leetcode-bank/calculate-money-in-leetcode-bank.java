class Solution {
    public int totalMoney(int n) {
        int count=0,day=0;
        int sum=0,i=1,start=1;
        while(count!=n){
            sum+=i;
            i++;
            day++;
            count++;
            if(day==7){
                day=0;
                i=++start;
            }
        }
        return sum;
    }
}