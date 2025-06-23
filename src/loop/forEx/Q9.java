package loop.forEx;

import java.util.Scanner;

/*
* 예상 출력
* a값 6
* b값 6
* a보다 큰 값을 입력하세요.
* b값 8
* b-a는 2입니다.*/
public class Q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0;
        int b = 0;
        do{
            System.out.println("a값:");
            a=sc.nextInt();
        }while(a<=0);

        System.out.println("b값:");
        b=sc.nextInt();
        while(b<=a){
            System.out.println("a보다 큰 값을 입력하세요.");
            System.out.println("b값:");
            b=sc.nextInt();
        }
        System.out.println("b-a = " + (b-a));

    }
}
