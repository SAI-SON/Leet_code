class Solution {
    public String replaceDigits(String s) {
        StringBuffer sb=new StringBuffer();
        char lastLetter=0;
        for(char c:s.toCharArray()){
            if(Character.isLetter(c)){
                sb.append(c);
                lastLetter=c;
            }
            else{
                sb.append((char)((c-'0')+lastLetter));
            }
        }
        return sb.toString();
    }
}