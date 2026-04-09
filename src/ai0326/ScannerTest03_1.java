package ai0326;

import java.util.Scanner;

public class ScannerTest03_1 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        Scanner s1=new Scanner(System.in);
        System.out.println("=============BMI 계산==============");

        System.out.println("체중(Kg, 실수값)을 입력하세요");
        double weight = s.nextDouble();
        System.out.println("키(cm, 실수값)을 입력하세요");
        double height = s.nextDouble();

        System.out.print("성명 입력");
        String name = s1.nextLine();

        double bmi = weight/Math.pow(height/100,2);

        System.out.printf("%s님의 bmi 지수 결과: %.2f㎏/㎡,name,bmi");

        s.close();
        s1.close();

       }
    }
