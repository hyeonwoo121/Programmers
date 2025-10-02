package programmers.solution.divide;

//비즈니스 로직(문제 해결 부분)
public class Solution {
    public int solution(int num1, int num2) {
        int answer = 0;
        //핵심 처리(비즈니스 로직) 나머지구하기
        answer = num1/num2;
        //answer = num1%num2; -> 몫 구하는법
        return answer;
    }
}
