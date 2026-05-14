package ai0514;

import java.util.Scanner;

public class whiletest02 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int hap = 0;
        int num1, num2;
        int sum;
// 사용자의 첫번째 점수 입력 값이 -1이면 프로그램을 종료
        while (true){
            System.out.print("첫번째 점수 입력:");
            num1=s.nextInt();
            if(num1 == -1)
                break;
            System.out.print("두번째 점수 입력");
            num2=s.nextInt();

            sum=num1+num2;
            System.out.printf("%d + %d = %d\n",num1,num2,sum);

        }
        s.close();
    }
}
