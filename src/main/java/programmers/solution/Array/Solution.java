package programmers.solution.Array;

//정수 배열 numbers가 매개변수로 주어집니다. numbers의 원소의 평균값을 return하도록 solution 함수를 완성해주세요.
public class Solution {

        public double solution(int[] numbers) {
            double answer = 0;
            int total = 0;

            for (int i = 0; i < numbers.length; i++) {
                total += numbers[i];
            }
            answer = (double) total / numbers.length;
            System.out.println("원소들 총합의 평균 :" + answer);
            return answer;

        }
//임의의 값을 메인메소드에서 설정. 코딩테스트는 이 부분이 자동으로 값을 대입해준다.
    public static void main(String[] args) {

            int[] numbers = {10,20,30,40,50};
            Solution sol = new Solution();
            sol.solution(numbers);
    }
}