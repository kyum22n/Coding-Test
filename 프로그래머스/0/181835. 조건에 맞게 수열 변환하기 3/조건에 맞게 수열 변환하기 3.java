class Solution {
    public int[] solution(int[] arr, int k) {
        
        int len = arr.length;
        
        int[] result = new int[len];
        
        if(k % 2 == 0) {
            for(int i=0; i<len; i++) {
                result[i] = arr[i] + k; 
            }
        } else {
            for(int i=0; i<len; i++) {
                result[i] = arr[i] * k;
            }
        }
        
        return result;
    }
}