package chap01;

import java.util.Scanner;

public class SumWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1부터 n까지의 합을 구하기");
        System.out.println("n값: ");
        int n = sc.nextInt();

        int sum=0;
        int i=0;
        while(i<n){
            sum= i+sum;
            i++;
        }

        System.out.println("sum = " + sum);
    }
}
