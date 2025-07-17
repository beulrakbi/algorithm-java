package chap01.ex;

import java.util.Scanner;

public class PlusIntEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자 입력: ");
        int n = sc.nextInt();
        String str = n+"";
        System.out.println(str.length() + "자리 입니다.");
    }
}
