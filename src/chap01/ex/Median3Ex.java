package chap01.ex;

public class Median3Ex {
    static int med3(int a, int b, int c){
        if(a>=b){
            if (b>=c){ //a<b<c
                return b;
            }else if(a<=c) { //a<c<b
                return a;
            } else {
                return c;
            }
        } else if (b<c) { //a<b<c
            return b;
        } else if (c<a){ //c<a<b
            return a;
        } else {
            return c;
        }
    }


    public static void main(String[] args) {
        System.out.println(med3(6,5,7));
    }
}
