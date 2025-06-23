package loop.forEx;
/*
* 양의 정수를 입력하고 자릿수를 출력하는 프로그램을 작성하세요.
*  예를 들어 135를 입력하면 그 수는 3자리입니다.
*  라고 출력하고
* 1314를 입력하면
* 그 수는 4자리입니다 라고 출력*/

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("정수를 입력하세요.");
        int num = sc.nextInt();

        if (num<=0){
            System.out.println("양의 정수를 입력하세요.");
        } else {
            int n =num;
            int count = 0;
            while(n>0){
                n /= 10;
                count++;
            }
            System.out.println(num+"은"+count+"자리입니다.");
        }
        sc.close();

//        System.out.print("정수를 입력하세요 : ");
//        int num = sc.nextInt();
//
//        if (num < 10) {
//            System.out.println(num + "은 1자리입니다.");
//        }else if(num<100){
//            System.out.println(num + "은 2자리입낟.");
//        }else {
//            System.out.println(num + "은 3자리입니다.");
//        }
        /*
        * 내가 푼 문제는 너무 한정적인 문제가 있음*/

    }
}
