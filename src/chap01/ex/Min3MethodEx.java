package chap01.ex;

public class Min3MethodEx {
    static int Min3(int a, int b, int c){
        int max = a;
        if(max>b){
            max=b;
        }
        if(max>c){
            max=c;
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(Min3(1,3,-1));
    }
}
