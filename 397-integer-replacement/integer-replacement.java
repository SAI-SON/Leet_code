class Solution {
    public int integerReplacement(int n) {
        int c=0;
        long l=n;
        while(l!=1){
            if((l&1)==0) l/=2;
            else{
                if(l==3 || l%4==1) l--;
                else l++;
            }
            c++;
        }
        return c;
    }
}