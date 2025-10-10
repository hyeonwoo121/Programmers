package programmers.solution.abprint;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        Solution.solution(a,b);

        //자원 반납
        sc.close();
    }
}
