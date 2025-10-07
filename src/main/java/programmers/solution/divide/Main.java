package programmers.solution.divide;

//실행 로직(입출력 담당)
public class Main {
    public static void main(String[] args) {
    Solution hyeonwoo = new Solution();

        //테스트 케이스 실행
        int result1 = hyeonwoo.solution(10, 2);
        int result2 = hyeonwoo.solution(8,3);

        //출력(I/O)
        System.out.println("10/2 = " + result1);
        System.out.println("8/3 = " + result2);
    }
}