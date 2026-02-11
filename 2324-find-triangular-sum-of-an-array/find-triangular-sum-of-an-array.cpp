class Solution {
public:
    int triangularSum(vector<int>& nums) {
        int k=0;
        while(k<nums.size()){
            for(int i=1;i<nums.size()-k;i++){
                nums[i-1]=(nums[i]+nums[i-1])%10;
            }
            k++;
        }
        return nums[0];
        }
};