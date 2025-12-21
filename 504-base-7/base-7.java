class Solution {
    public String convertToBase7(int num) {
        if(num==0) return "0";
        int sum=0;
        boolean f=false;
        if(num<0) f=true;
        num=Math.abs(num);
        StringBuffer str=new StringBuffer();
        while(num!=0){
            str.append(num%7);
            num/=7;
        }
        str.reverse();
        return (f?"-"+str:str).toString();
    }
}