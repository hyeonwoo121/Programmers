package programmers.solution.springprint;

import java.util.Scanner;

// Scanner를 사용하여 입력을 받는 코드, 조건에 맞지 않는 경우 예외 처리
// 조건: 1 <= hyeonwoo.length() <= 1,000,000
// 조건에 맞지 않는 경우 "조건에 맞지 않습니다." 출력
// 조건에 맞는 경우 hyeonwoo 출력
public class Solution {
    public static void springprint() {
        //사용자로부터 직접 입력값을 받음->input에 저장
        System.out.print("이름을 입력하세요: ");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        //조건 검사
        if (input.length() <= 1 || input.length() >= 1000000) {
            System.out.println("조건에 맞지 않습니다.");
        } else {
            System.out.println("잘 하셨습니다! 입력하신 값은 " + input + "입니다");
        }
        sc.close(); // 🔹 Scanner 자원 해제

    }
}