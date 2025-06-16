package median;

public class Median {
    static int med3(int a, int b, int c) {
        if (a >= b) {
            if (b >= c) { /*
             1. a가 b보다 크거나 같다. (참)
             2. b가 c보다 크거나 같다. (참)
             -> a>b>c  = 중간 값 b*/
                return b;
            } else if (a <= c) {/*
            1. a가 b보다 크거나 같다.
            2. b가 c보다 작다
             -> c>a>b = 중간 값 a*/
                return a;
            } else { //나머지 남은 것 c
                return c;
            }
        } else if (a > c) { /*
        1. a가 b보다 작다
        -> b>a>c = 중간 값 a
        */
            return a;
        } else if (b > c) { /*
        1. a가 b보다 작다.
        2. a가 c보다 작다.
        -> b<c<a = 중간 값 c
        */
            return c;
        } else {
            return b;
        }
    }
}
