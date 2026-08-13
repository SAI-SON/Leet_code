class Solution {
public:
    long long dividePlayers(vector<int>& skill) {
        sort(skill.begin(),skill.end());
        int n=skill.size();
        long long ans=0;
        long long team=skill[n-1]+skill[0];
        for(int i=0;i<n/2;i++){
            if(team!=skill[n-1-i]+skill[i]){
                return -1;
            }
            ans+=skill[n-1-i]*skill[i];
        }
        return ans;
    }
};