class Solution {
    public int numberOfSpecialChars(String word) {
        String str1="";
        String str2="";
        Set<Character>set=new HashSet<>();
        for(char c:word.toCharArray()){
            if(65<=c && 91<=c){
                str1+=c;
            }
            else{
                str2+=c;
                set.add(c);
            }
        }
        str1=str1.toUpperCase();
      //  System.out.println(str1);
        int count=0;
        for(char c:set){
            if(str1.contains(String.valueOf(c)))
            count++;
        }
        return count;
    }
}