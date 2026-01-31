class Solution {
    public long solution(int a, int b) {
        
        long max = Math.max(a, b);  //최대값
        long min = Math.min(a, b);  //최솟값
        
        return (max - min + 1) * (max + min) / 2;
        
    }
}