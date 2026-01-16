public class Solution {
    public int gcd(int a,int b){
        if(b==0) return a;
        return gcd(b,a%b);
    }
    public int CountBeautifulPairs(int[] nums) {
        int c=0;
        for(int i=0;i<nums.Length;i++){
            int first=nums[i].ToString()[0]-'0';
            for(int j=i+1;j<nums.Length;j++){
                if(gcd(first,nums[j]%10)==1) c++;
            }
        }
        return c;
    }
}