class Solution {
    public String truncateSentence(String s, int k) {
        String str[]=s.split(" ");
        String res="";
        for(int i=0;i<k;i++){
            if(k-1==i) 
            res+=str[i];
            else
            res+=str[i]+" ";
        }
        return res;
    }
}