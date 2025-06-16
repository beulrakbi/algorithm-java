package median;

import java.util.Scanner;

import static median.Median.med3;

public class TestMedian {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("세 정수의 중앙값을 구합니다.");
        System.out.println("a의 값: ");
        int a = sc.nextInt();
        System.out.println("b의 값: ");
        int b = sc.nextInt();
        System.out.println("c의 값: ");
        int c = sc.nextInt();

        System.out.println(med3(a, b, c));
    }
}
