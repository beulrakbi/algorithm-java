package median.test;

import java.util.Scanner;

import static median.test.Median.median;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("a:");
        int a = sc.nextInt();
        System.out.print("b:");
        int b = sc.nextInt();
        System.out.print("c:");
        int c = sc.nextInt();

        System.out.println(median(a, b, c));

    }
}
