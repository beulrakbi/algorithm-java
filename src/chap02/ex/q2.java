package chap02.ex;

import java.util.Arrays;
import java.util.Scanner;

public class q2 {
    static void swap(int[] a, int x, int y){
        int t = a[x];
        a[x] = a[y];
        a[y] = t;

        System.out.println(Arrays.toString(a));
    }
    static void reserve(int[] a){
        for (int i =0; i<a.length/2; i++){
            swap(a, i, a.length-i-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("요솟수: ");
        int num = sc.nextInt();
        int[] arr = new int[num];
        for(int i =0; i<num; i++){
            arr[i]=sc.nextInt();
        }

        reserve(arr);
    }
}
