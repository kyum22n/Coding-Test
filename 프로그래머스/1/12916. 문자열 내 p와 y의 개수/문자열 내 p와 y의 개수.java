class Solution {
    boolean solution(String s) {
        
        s = s.toLowerCase();    //소문자로 변경
        
        int pNum = 0;   //p의 개수
        int yNum = 0;   //y의 개수
        
        // pNum
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'p') {
                pNum++;
            }
        }
        
        //yNum
        for (int k = 0; k < s.length(); k++) {
            if (s.charAt(k) == 'y') {
                yNum++;
            }
        }
        
        if (pNum == 0 && yNum == 0) {
            return true;
        } else if (pNum == yNum) {
            return true;
        } else {
            return false;
        }
        
    }
}