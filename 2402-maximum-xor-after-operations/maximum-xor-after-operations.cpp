class Solution {
public:
    int maximumXOR(vector<int>& nums) {
        int r=0;
        for(int n:nums){
            r|=n;
        }
        return r;
    }
};