package loop;

import java.util.Scanner;

public class SumFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("정수를 입력하시오");
        int n = sc.nextInt();

        int sum = 0;

        for(int i = 1; i<=n; i++) {
            sum = sum + i;
        }
        System.out.println(sum);
    }
}
