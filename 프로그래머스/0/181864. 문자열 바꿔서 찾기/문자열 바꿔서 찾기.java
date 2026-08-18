class Solution {
    public int solution(String myString, String pat) {
        
        String reverseString = myString.replace("A", "C");
        reverseString = reverseString.replace("B", "A");
        reverseString = reverseString.replace("C", "B");
        
        if(reverseString.contains(pat)) {
            return 1;   
        } else {
            return 0;
        }
    }
}