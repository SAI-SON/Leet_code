class Solution {
public:
    int smallestEqual(vector<int>& nums) {
        int size=nums.size();
        for(int i=0;i<size;i++){
            if(nums[i]==i%10) return i;
        }
        return -1;
    }
};