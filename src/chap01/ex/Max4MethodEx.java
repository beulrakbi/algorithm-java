package chap01.ex;

public class Max4MethodEx {
    static int max4(int a, int b, int c, int d){
        int max = a;
        if(max<b){
            max=b;
        }
        if(max<c){
            max=c;
        }
        if(max<d){
            max=d;
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(max4(1,3,2,5));
    }
}
