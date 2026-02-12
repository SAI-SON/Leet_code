class Solution {
    public String reverseOnlyLetters(String s) {
        int left=0,right=s.length()-1;
        StringBuffer sb=new StringBuffer(s);
        while(left<right){
            while(left<right && !Character.isLetter(s.charAt(left))) left++;
            while(left<right && !Character.isLetter(s.charAt(right))) right--;
            char ch=sb.charAt(left);
            sb.setCharAt(left,sb.charAt(right));
            sb.setCharAt(right,ch);
            left++;
            right--;
        }
        return sb.toString();
    }
}