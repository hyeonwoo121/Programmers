package programmers.solution.remainder;

class Solution {
    public int solution(int num1, int num2) {
        int answer = 0;
        if(0 < num1 && num1<= 100 && 0 < num2 && num2<= 100){
        answer = num1%num2;
        }
        return answer;


    }

    public static void main(String[] args) {
        Solution test = new Solution();
        int result = test.solution(10,3);
        System.out.println(result);
    }
}
