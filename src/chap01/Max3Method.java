package chap01;

public class Max3Method {
    /*
    * 최대값을 여러 번 반보갷서 구할 때에는 메서드로 처리하면 편리*/
    static int max3(int a, int b, int c){
        int max = a;
        if(max<b){
            max = b;
        }
        if(max<c){
            max = c;
        }
        return max;
    }
    public static void main(String[] args) {
        System.out.println(max3(1, 2, 3));
        System.out.println(max3(2, 1, 5));
        System.out.println(max3(1, 2, 1));
        System.out.println(max3(3, 3, 3));
    }
}
