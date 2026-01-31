class Solution {
    public int solution(int[] numbers) {
        
        int sum = 0;    //합
        
        //0~9 숫자 조회
        for(int i = 0; i <= 9; i++) {
            
            boolean found = false;
            
            for(int num : numbers) {
                if(num == i) {
                    found = true;
                    break;
                }
            }
            
            if(found == false) sum += i;
            
        }
        
        return sum;
    }
}