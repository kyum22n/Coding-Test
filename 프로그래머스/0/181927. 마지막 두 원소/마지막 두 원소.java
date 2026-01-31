class Solution {
    public int[] solution(int[] num_list) {
        
        // 기존 배열의 길이
        int len = num_list.length;
        
        // 마지막 원소의 값
        int end = num_list[len - 1];
        
        // 그전 원소의 값
        int before = num_list[len - 2];
        
        // 새 배열
        int[] answer = new int[len + 1];
        
        // 기존 배열 복사
        for (int i = 0; i < len; i++) {
            answer[i] = num_list[i];
        }
        
        // 마지막 값 추가
        if (end > before) {
            answer[len] = end - before;
        }  else {
            answer[len] = end * 2;
        }
        
        return answer;
        
    }
}