class Solution {
    public String solution(String my_string, int[] index_list) {
        
        //정답 문자열
        String answer = "";
        
        //index_list[i] = my_string의 인덱스
        //my_string[index_list[i]] = answer[i]
        for(int i = 0; i < index_list.length; i++) {
            answer += my_string.charAt(index_list[i]);
        }
        
        return answer;
    }
}