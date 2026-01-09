public class Solution {
    public int[] EvenOddBit(int n) {
        int even=0,odd=0,index=0;
        while(n>0){
            if((n&1)==1){
                if(index%2==0) even++;
                else odd++;
            }
            n>>=1;
            index++;
        }
        return new int[]{even,odd};
    }
}