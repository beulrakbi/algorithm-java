package maxMin;

// 최대값 3개 구하기 메소드 정의
//메서드를 사용하면 최대값을 여러 번 반복해서 구할 때 편리
class SelectMethod {
    static int max3(int a, int b, int c) {
        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        return max;
    }
}

// 실행 클래스
public class Max3Method {
    public static void main(String[] args) {
        System.out.println(SelectMethod.max3(2, 3, 5));
        System.out.println(SelectMethod.max3(1, 3, 2));
        System.out.println(SelectMethod.max3(3, 1, 1));
        System.out.println(SelectMethod.max3(5, 3, 3));
        System.out.println(SelectMethod.max3(3, 1, 2));
        System.out.println(SelectMethod.max3(6, 1, 3));
        System.out.println(SelectMethod.max3(4, 3, 7));
        System.out.println(SelectMethod.max3(6, 8, 1));
    }
}
