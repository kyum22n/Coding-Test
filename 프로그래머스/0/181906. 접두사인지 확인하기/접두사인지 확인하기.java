class Solution {
    public int solution(String my_string, String is_prefix) {

        if(is_prefix.length() <= my_string.length()) {
            
            for(int i = 0; i < is_prefix.length(); i++) {

                char str1 = is_prefix.charAt(i);
                char str2 = my_string.charAt(i);

                if(str1 != str2) {
                    return 0;
                }
            }
            return 1;
        }
        return 0;        
    }
}