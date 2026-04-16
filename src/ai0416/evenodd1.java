package ai0416;

import java.util.Scanner;

public class evenodd1 {
    public static void main(String[] args) {
        System.out.println("===== 짝수/홀수 판별 프로그램 ====");
        Scanner s = new Scanner(System.in);
        System.out.print("* 정수를 입력: ");

        int num = s.nextInt();
        String result = s.nextLine();

        if(num % 2 == 0)
            result = "짝수";
        else
            result = "홀수";

        System.out.printf("입력된 수는 %d는 %s입니다.",num,result);
        System.out.println("프로그램 종료");

        s.close();


    }
}
