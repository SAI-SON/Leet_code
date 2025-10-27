class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character,String> map=new HashMap<>();
        String sarr[]=s.trim().split("\\s+");
        if(pattern.length()!=sarr.length) return false;

        for(int i=0;i<pattern.length();i++){
            char c=pattern.charAt(i);
            if(map.containsKey(c)){
                if(!map.get(c).equals(sarr[i])){
                    return false;
                }
            }
            else{
                if(map.containsValue(sarr[i])){
                    return false;
                }
                map.put(c,sarr[i]);
            }
        }
        return true;
    }
}