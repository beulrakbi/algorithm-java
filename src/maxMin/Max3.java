package maxMin;

import java.util.Scanner;

// 세 값의 최대값 구하기
public class Max3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("세 정수의 최대값을 구합니다.");
        System.out.println("a의 값:");
        int a = sc.nextInt();
        System.out.println("b의 값:");
        int b = sc.nextInt();
        System.out.println("c의 값:");
        int c = sc.nextInt();

        /*
        - 순차구조 (sequential) : 순차적으로 실행되는 구조
        1) max에 a값을 넣는다.
        2) b값이 max보다 크면 max에 b값을 넣는다.
        3) c값이 max보다 크면 max에 c값을 넣는다.

        -선택구조 (selection)
        처음엔 max에 a를 대입하지만 if문을 만나면서 조건 결과에 따라 흐름이 변함
         */
        int max = a;
        if(b>a){
            max = b;
        }
        if(c>b){
            max = c;
        }

        System.out.println("max: " + max);
    }
}
