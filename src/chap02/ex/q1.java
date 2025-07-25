package chap02.ex;

import java.util.Random;
import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);

        int[] count = new int[random.nextInt(40)];
        System.out.println("사람 수:" + count.length);
    }
}
