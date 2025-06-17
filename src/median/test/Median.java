package median.test;
/*
* 세 값중 가운데 수 구하는 프로그램 테스트*/
public class Median {
    static int median(int a, int b, int c) {
        if (a >= b) {
            if (c >= a) {
                return a;
            } else if (c <= b) {
                return b;
            }else {
                return c;
            }
        } else if (a >= c) {
            return a;
        } else if (b >= c) {
            return c;
        } else {
            return b;
        }
    }
}
