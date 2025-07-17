package chap01;

import java.util.Scanner;

public class Max3 {
    public static void main(String[] args) {
        /*
        * 세 값의 최대값 구하기
        * 1. 순차 구조: 여러 문장이 순차적으로 실행되는 구조
        * 1.1 max에 a를 대입 -> b가 max보다 크면 max에 b 대입 -> c가 max보다 크면 max에 c대입
        * 2. 선택구조: if문이나 식을 평가한 결과에 따라 프로그램의 실행 흐름을 변경하는 if문을 선택구조라고 한다.
        * */
        Scanner sc = new Scanner(System.in);

        System.out.println("세 정수의 최대값을 구합니다.");
        System.out.print("a의 값: ");
        int a = sc.nextInt();
        System.out.print("b의 값: ");
        int b = sc.nextInt();
        System.out.print("c의 값:");
        int c = sc.nextInt();

        int max = a;
        if(max<b){
            max=b;
        }
        if(max<c){
            max=c;
        }
        System.out.println("max = " + max);
    }
}
