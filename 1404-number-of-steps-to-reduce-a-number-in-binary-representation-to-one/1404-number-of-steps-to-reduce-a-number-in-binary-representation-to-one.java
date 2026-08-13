import java.math.*;
class Solution {
    public int numSteps(String s) {
        BigInteger n=new BigInteger(s,2);
        BigInteger one=BigInteger.ONE;
        BigInteger two=BigInteger.valueOf(2);
        int count=0;
        while(!n.equals(one)){
            if((n.mod(two)).equals(one)){
                n=n.add(one);
            }
            else{
                n=n.divide(two);
            }
            count++;
        }
        return count;
    }
}