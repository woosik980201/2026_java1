package ai0402;

import java.util.Scanner;

public class kgpountest {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        double lb= 0.453592;
        double kg= 2.204623;
        double result = 0;
        System.out.println("=====  파운드/킬로그램 단위 변환기  =====");

        System.out.println("파운드를 입력하세요: ");
        int input1 = s.nextInt();
        result = input1 * lb;
        System.out.printf("%d파운드(lb)는 %.3f킬로그램(Kg)입니다\n",input1,result);


        System.out.println("Kg를 입력하세요: ");
        int input2 = s.nextInt();
        result = input2 * kg;
        System.out.printf("%d킬로그램(kg)은 %.3f파운드(ln)입니다\n",input2,result);


s.close();

    }
}
