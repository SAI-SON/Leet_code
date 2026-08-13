class Solution {
public:
    long long sumAndMultiply(int n) {
        long long sum=0;
        long long pow=1;
        long long temp=n;
        long long val=0;
        while(temp>0){
            int last=temp%10;
            if(last!=0){
                sum+=last;
                val+=last*pow;
                pow*=10;
            }
            temp/=10;
        }
       // cout<<sum<<" "<<val<<endl;
        return sum*val;
    }
};