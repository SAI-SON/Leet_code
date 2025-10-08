class Solution {
    public String replaceWords(List<String> dictionary, String sentence) {
        // for(String s:dictionary){
        //     if(sentence.contains(s)){
        //     for(String s2:sentence.split(" ")){
        //         if(s2.startsWith(s)){
        //             // str+=s;
        //            sentence = sentence.replace(s2,s);
        //            System.out.println(sentence+"           "+s2+"  "+s );
        //         }
        //     }
        //     }
        // }
       Collections.sort(dictionary);
        StringBuffer sb=new StringBuffer();
        for(String s:sentence.split(" ")){
            boolean f=false;
            for(String s2:dictionary){
                if(s.startsWith(s2)){
                    sb.append(s2).append(" ");
                    f=true;
                    break;
                }
            }
            if(!f)
            sb.append(s).append(" ");
        }
        return sb.deleteCharAt(sb.length()-1).toString();
    }
}