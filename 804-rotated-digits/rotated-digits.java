class Solution {
    public int rotatedDigits(int n) {
        int c=0;
        for(int i=1;i<=n;i++){
            if(isGood( i)){
                c++;
            }
        }
        return c;
    }

    public boolean isGood(int val){
        boolean flag=false;
        
        while(val>0){
        int digit=val%10;
        if( digit==3 || digit == 4 || digit== 7)
        return false;

        if(digit== 2 || digit==5 || digit==6 || digit==9)
        flag=true;

        val/=10;
        }
        return flag;
    }
}