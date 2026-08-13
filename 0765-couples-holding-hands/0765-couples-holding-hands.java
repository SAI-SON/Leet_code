class Solution {
    public int minSwapsCouples(int[] row) {
        int n=row.length;
        int c=0;
        for(int i=0;i<n;i+=2){
            int part=row[i]^1;
            if(part==row[i+1]) continue;
            for(int j=i+1;j<n;j++){
                if(part==row[j]){
                    swap(row,i+1,j);
                    c++;
                    break;
                }
            }
        }
        return c;
    }
    void swap(int arr[],int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}