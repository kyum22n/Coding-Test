class Solution {
    public int solution(int[] arr1, int[] arr2) {
        
        int sum1 = 0;
        int sum2 = 0;
        
        if(arr1.length == arr2.length) {
            for(int num1 : arr1) {
                sum1 += num1;
            }
            for(int num2 : arr2) {
                sum2 += num2;
            }
            
            if(sum1 > sum2) {
                return 1;
            } else if(sum1 < sum2) {
                return -1;
            } else {
                return 0;
            }
            
            
        } else {
             return arr1.length > arr2.length ? 1 : -1;
        }
        
        
    }
}