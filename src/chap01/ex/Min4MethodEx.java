package chap01.ex;

public class Min4MethodEx {
    static int Min4(int a, int b, int c, int d){
        int min = a;
        if(min>b){
            min= b;
        }
        if(min>c){
            min=c;
        }
        if(min>d){
            min=d;
        }
        return min;
    }

    public static void main(String[] args) {
        System.out.println(Min4(1,3,2,1));
    }
}
