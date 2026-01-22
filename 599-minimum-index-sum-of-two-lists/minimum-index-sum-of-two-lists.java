class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        int min=Integer.MAX_VALUE;
        List<String> l=new ArrayList<>();

        for(int i=0;i<list1.length;i++){
            for(int j=0;j<list2.length;j++){
                if(list1[i].equals(list2[j])){
                    if(i+j<=min){
                        if(i+j<min){
                            l.clear();
                            min=i+j;
                        }
                        l.add(list1[i]);
                    }
                }
            }
        }
        return l.toArray(new String[0]);
    }
}