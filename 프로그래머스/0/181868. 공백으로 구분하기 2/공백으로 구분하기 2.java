class Solution {
    public String[] solution(String my_string) {
        
        //공백 분리
        String[] result = my_string.trim().split(" +");
        
        return result;
        
    }
}