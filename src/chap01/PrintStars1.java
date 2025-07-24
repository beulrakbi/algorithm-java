package chap01;

import java.util.Scanner;

public class PrintStars1 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int n, w;
        System.out.println("*를 n개 출력하되 w개마다 줄을 바궈서 출력합니다.");

        do {
            System.out.println("n값: ");
            n=stdIn.nextInt();
        }while(n<=0);

    }
}
