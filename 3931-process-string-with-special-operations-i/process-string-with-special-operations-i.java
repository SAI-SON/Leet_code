class Solution {
    public String processStr(String s) {
        StringBuffer sb=new StringBuffer();
        for(char c:s.toCharArray()){
            if(c=='*'){
                if(sb.length()>0)
                sb.deleteCharAt(sb.length()-1);
            }
            else if(c=='#'){
                sb.append(sb);
            }
            else if(c=='%'){
                sb.reverse();
            }
            else{
                sb.append(c);
            }
        }
        return sb.toString();
    }
}