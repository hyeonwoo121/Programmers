package programmers.solution.abprint;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        Solution hyeonwoo = new Solution();
        hyeonwoo.solution(a,b);
    }
}
