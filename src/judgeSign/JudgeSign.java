package judgeSign;

import java.util.Scanner;
//양수 음수 구하기
public class JudgeSign {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("정수를 입력하세요:");
        int a = sc.nextInt();

        if(a>0){
            System.out.println("이 수는 양수입니다.");
        } else if(a<0){
            System.out.println("이 수는 음수입니다.");
        } else {
            System.out.println("이 수는 0입니다.");
        }
    }
}
