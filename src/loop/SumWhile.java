package loop;

import java.util.Scanner;
//1부터 n까지의 합 구하기
public class SumWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("정수를 입력하세요.");
        int n = scanner.nextInt();
        int i = 1;
        int sum = 0;
        while(i <= n){
            sum = sum +i;
            System.out.println("i 증가 전" + i);
            i++;
            System.out.println("i 증가 후" + i);
        }
        System.out.println(sum);
    }
}
