class Solution {
    public int minimumPushes(String word) {
        int fre[]=new int[26];
        for(char c:word.toCharArray())
        fre[c-'a']++;
        Arrays.sort(fre);
        int ans=0;
        for(int i=25;i>=0 && fre[i]>0 ; i--){
            ans+=fre[i]*((25-i)/8+1);
        }
        return ans;
    }
}