class Solution {
    public boolean isPrefixString(String s, String[] words) {
        String str="";
        for(String st:words){
            str+=st;
            if(s.equals(str))
            return true;
            if(s.indexOf(str)==-1)
            return false;
        }
        return false;
    }
}