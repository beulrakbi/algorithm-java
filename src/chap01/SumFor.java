package chap01;

import java.util.Scanner;

public class SumFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1부터 n까지의 합");
        System.out.println("n값: ");
        int n = sc.nextInt();
        int sum = 0;

        for(int i = 0; i< n; i++){
            sum +=i;
        }
        System.out.println(sum);
    }
}
