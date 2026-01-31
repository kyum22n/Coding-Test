class Solution {
    public int solution(int[] num_list) {
        int multiply = 1;   //모든 원소들의 곱
        
        int sum = 0;    //모든 원소들의 합
        
        for(int i = 0; i < num_list.length; i++) {
            sum += num_list[i];
            multiply *= num_list[i];
        }
        
        int square = sum * sum; //모든 원소들의 합의 제곱
        
        return square > multiply ? 1 : 0;
    }
}