package programmers.solution.letter;

public class Solution {
    public int solution(String message) {
        int answer = 0;

        if(message.length() >= 1 && message.length() <= 50) {
            answer = 2 * message.length();
        }else{
            System.out.println("계산범위 초과입니다");

        }
        return answer;
    }
    //머쓱이는 할머니께 생신 축하 편지를 쓰려고 합니다. 
    //할머니가 보시기 편하도록 글자 한 자 한 자를 가로 2cm 크기로 적으려고 하며,
    // 편지를 가로로만 적을 때, 축하 문구 message를 적기 위해 필요한 편지지의 최소 가로길이를
    // return 하도록 solution 함수를 완성해주세요.
    public static void main(String[] args) {
        Solution hyeonwoo = new Solution();
        int result = hyeonwoo.solution("happy birthday");
        System.out.println(result);
    }
}

