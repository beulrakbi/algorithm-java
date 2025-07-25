package chap02;

import java.util.Random;
import java.util.Scanner;

public class MaxOfArrayRand {

    static int maxOf(int[] a){
        int max = a[0];
        for (int i =0; i<a.length; i++){
            if(max<a[i]){
                max=a[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);

        System.out.println("키 최대값 구하기");
        System.out.println("사람 수:");
        int num = sc.nextInt();

        int[] height = new int[num];

        for(int i = 0; i<num; i++){
            height[i] = 100+random.nextInt(90);
            System.out.println("hegiht["+i+"]는" + height[i]);
        }
        System.out.println(maxOf(height));
    }
}
