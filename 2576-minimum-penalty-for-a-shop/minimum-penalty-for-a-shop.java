class Solution {
    public int bestClosingTime(String customers) {
        int c=0,max=0,minp=0;
        for(int i=0;i<customers.length();i++){
            char ch=customers.charAt(i);
            if(ch=='Y') c++;
            else c--;
            if(max<c){
                minp=i+1;
                max=c;
            }
        }
        return minp;
    }
}