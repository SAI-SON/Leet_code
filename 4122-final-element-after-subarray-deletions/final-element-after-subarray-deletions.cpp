class Solution {
public:
    int finalElement(vector<int>& nums) {
        int n = nums.size();
        return n == 1 ? nums[0] : max(nums[0], nums[n - 1]);

    }
};