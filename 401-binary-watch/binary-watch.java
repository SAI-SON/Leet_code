class Solution {
    public List<String> readBinaryWatch(int turnedOn) {
        List<String> res=new ArrayList<>();
        for(int h=0;h<12;h++){
            for(int min=0;min<60;min++){
                int total=Integer.bitCount(h)+Integer.bitCount(min);
                if(total==turnedOn){
                    String time=h+":"+(min<10?"0"+min:min);
                    res.add(time);
                }
            }
        }
        return res;
    }
}