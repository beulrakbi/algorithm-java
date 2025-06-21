package loop.forEx;

import java.util.Scanner;

/*
* 가우스 덧셈 공식
* (1 + n) * (n / 2)
* */
public class GaussAdder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("n을 입력하세요.");
        int n = sc.nextInt();

        int sum = n*(n+1)/2 ;

        System.out.println(sum);
    }
}
