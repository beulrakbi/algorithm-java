package chap01;

import java.util.Scanner;

public class SumFor2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.println("1부터 n까지의 합");
        do {
            System.out.println("n값: ");
            n = sc.nextInt();
        }while(n<=0);

        int sum = 0;

        for(int i = 0; i< n; i++){
            sum +=i;
        }
        System.out.println(sum);
    }
}
