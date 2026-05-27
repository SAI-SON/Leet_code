class Solution {
    public int numberOfSpecialChars(String word) {
        HashMap<Character,Integer>Lower=new HashMap<>();
        HashMap<Character,Integer>Upper=new HashMap<>();
        int n=word.length();
        for(int i=0;i<n;i++){
            char c=word.charAt(i);
            if(Character.isLowerCase(c)){
                Lower.put(c,i);
            }
            else{
                Upper.putIfAbsent(Character.toLowerCase(c),i);
            }
        }
        int count=0;
        for(char c:Lower.keySet()){
            if(Upper.containsKey(c) && Lower.get(c)<Upper.get(c))
                count++;
        }
        return count;
    }
}