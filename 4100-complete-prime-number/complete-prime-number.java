class Solution {
    public boolean isPrime(int n){
        if(n<2) return false;
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public boolean completePrime(int num) {
        String str=Integer.toString(num);
        for(int i=0;i<str.length();i++){
            if(!isPrime(Integer.parseInt((str.substring(0,i+1)))) || !isPrime(Integer.parseInt((str.substring(str.length()-1-i,str.length()))))){
                return false;
            }
        }
        return true;
    }
}