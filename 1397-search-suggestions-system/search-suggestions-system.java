class Solution {
    public List<List<String>> suggestedProducts(String[] products, String searchWord) {
        List<List<String>> list=new ArrayList<>();
        StringBuffer sb=new StringBuffer();
        for(int i=0;i<searchWord.length();i++){
            sb.append(searchWord.charAt(i));
            List<String>l=new ArrayList<>();
            for(int j=0;j<products.length;j++){
                if(products[j].startsWith(sb.toString()))
                l.add(products[j]);
            }
            Collections.sort(l);
            while(l.size()>3){
                l.remove(l.get(l.size()-1));
            }
            list.add(l);
        }
        return list;
    }
}