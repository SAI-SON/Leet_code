class Solution {
    public int numDifferentIntegers(String word) {
        Set<String> set=new HashSet<>();
        String str[]=word.replaceAll("[^0-9]"," ").trim().split("\\s+");
        for(String s:str){
            if(!s.isEmpty()){
            String re=s.replaceFirst("^0+","");
            if(re.isEmpty()) re="0";
            set.add(re);
            }
        }
        return set.size();
    }
}