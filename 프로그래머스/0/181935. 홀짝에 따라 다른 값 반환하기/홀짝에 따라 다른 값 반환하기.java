class Solution {
    public int solution(int n) {
        
        int sum = 0;
        
        if (n % 2 != 0) {
            for (int i = 1; i <= n; i+=2) {
                sum += i;
            }
        } else {
            for (int k = 2; k <= n; k+=2) {
                sum += k*k;
            }
        }
        
        return sum;
    }
}