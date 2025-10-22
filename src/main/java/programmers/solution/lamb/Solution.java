package programmers.solution.lamb;


public class Solution {

        public static int solution(int n, int k) {
            int answer = 0;

           int sheepMeat = 12000; // n은 양꼬치
           int beverage = 2000;  // k는 음료수

            answer = (n*sheepMeat) + (k*beverage) - (beverage * (n / 10));
            return answer;
        }


    public static void main(String[] args) {

        int result1 = solution(100, 25);
        int result2 = solution(30, 8000);

        System.out.println(result1);
        System.out.println(result2);
    }
}
