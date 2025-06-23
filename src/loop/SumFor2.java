package loop;

import java.util.Scanner;
//양수만 입력 받아 1부터 n까지의 합 구하기
public class SumFor2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.println("1부터 n까지의 합을 구한다.");

        //0보다 작은 값을 입력했을 때 계속 반복하게 해서 정수만 입력 가능하게 함
        do{
            System.out.println("n값 : ");
            n = sc.nextInt();
        }while (n<= 0);

        int sum = 0;

        for(int i = 1; i<=n; i++) {
            sum += i;

        }
        System.out.println("1부터" + n + "까지의 합은" + sum + "입니다.");

    }
}
