class Solution {
    public int[] solution(int[] num_list, int n) {
        
        //num_list의 길이
        int len = num_list.length;

        //num_list에서 n번째~마지막 원소까지의 길이
        int len2 = len - n + 1;
        
        //n~마지막 원소까지의 리스트
        int[] answer = new int[len2];
        
        //num_list[n-1] = answer[0]
        for(int i = 0; i < len2; i++) {
            answer[i] = num_list[n - 1 + i];
        }
        
        return answer;
    }
}