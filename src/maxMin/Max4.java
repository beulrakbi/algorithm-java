package maxMin;

// 연습
class SelectMethod2 {
    static int max4(int a, int b, int c, int d){
        int max = a;
        if(b > max) max = b;
        if(c > max) max = c;
        if(d > max) max = d;
        return max;
    }
}

public class Max4 {
    public static void main(String[] args) {
        // static import 없이 클래스명으로 호출
        System.out.println("max: " + SelectMethod2.max4(1, 2, 3 ,4));
    }
}
