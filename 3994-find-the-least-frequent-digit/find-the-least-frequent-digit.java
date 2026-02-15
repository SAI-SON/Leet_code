class Solution {
    public int getLeastFrequentDigit(int n) {
        Map<Character,Integer>map=new TreeMap<>();
        String str=Integer.toString(Math.abs(n));
        for(char c:str.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        int min=Integer.MAX_VALUE;
        char val='0';
        for(char i:map.keySet()){
            if(min>map.get(i)){
                min=map.get(i);
                val=i;
            }
        }
        return val-'0';
    }
}