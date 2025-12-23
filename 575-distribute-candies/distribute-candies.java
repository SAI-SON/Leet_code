class Solution {
    public int distributeCandies(int[] candyType) {
        int len=Arrays.stream(candyType).distinct().toArray().length;
        return (candyType.length/2>=len)?len:candyType.length/2;
    }
}