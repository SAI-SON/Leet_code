class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        String answer="";
        char[]charArr={'z','y','x','w','v','u','t','s','r','q','p','o','n','m','l','k','j','i','h','g','f','e','d','c','b','a'};
        for(String c:words){
            int sum=0;
            for(char ch:c.toCharArray()){
                sum+=weights[ch-'a'];
            }
            answer+=charArr[sum%26];
        }
        return answer;   
    }
}