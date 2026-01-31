class Solution {
    public String solution(String phone_number) {
        
        int len = phone_number.length();    //전화번호 길이
        
        StringBuilder answer = new StringBuilder(phone_number); //새 문자열
        
        //4자리 제외한 나머지 *로 대체
        for(int i = 0; i < len - 4; i++) {
            answer.setCharAt(i, '*');
        }
        
        return answer.toString();
    }
}