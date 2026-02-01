class Solution {
    public String solution(String s) {
        
        //공백을 단어 구분해서 배열 만들기
        String[] words = s.split(" ", -1);
        
        //단어별로 문자 변환
        for(int i = 0; i < words.length; i++) {
            
            //변환한 단어
            StringBuilder result = new StringBuilder();
            
            for(int k = 0; k < words[i].length(); k++) {
                
                //단어 내 공백 위치 확인하기
                char space = words[i].charAt(k);

                //단어 내의 인덱스가 짝수면 대문자, 홀수면 소문자로 변환
                if(k % 2 == 0) {
                    result.append(Character.toUpperCase(space));
                } else {
                    result.append(Character.toLowerCase(space));
                }
                
            }
            words[i] = result.toString();
            
        }
        
        String answer = String.join(" ", words);
        
        return answer;
        
    }
}