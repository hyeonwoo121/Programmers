package programmers.solution.springprint;

import java.util.Scanner;

// Scanner를 사용하여 입력을 받는 코드, 조건에 맞지 않는 경우 예외 처리
// 조건: 1 <= hyeonwoo.length() <= 1,000,000
// 조건에 맞지 않는 경우 "조건에 맞지 않습니다." 출력
// 조건에 맞는 경우 hyeonwoo 출력
public class Solution {
    public static void springprint(String hyeonwoo) {
        Scanner sc = new Scanner(System.in);
        System.out.print("이름을 입력하세요: ");
        String input = sc.nextLine();
        if (hyeonwoo.length() <= 1 || hyeonwoo.length() >= 1000000) {
            System.out.println("조건에 맞지 않습니다.");
        } else {
            System.out.println(input);
        }
        sc.close(); // 🔹 Scanner 자원 해제

    }
}