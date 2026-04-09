package ai0326;

import java.util.Scanner;

public class ScannerTest03 {
        public static void main(String[] args) {
            Scanner s=new Scanner(System.in);
            Scanner s1=new Scanner(System.in);
            System.out.println("========= BMI 계산 ============");

            System.out.print("* 체중(kg, 실수값) 입력:");
            double weight = s.nextDouble();
            System.out.print("* 키(cm, 실수값) 압력:");
            double height = s.nextDouble();

            System.out.print("* 성명 입력:");
            String name = s1.nextLine();

            double bmi = weight/ Math.pow(height/100,2);//(height/100)*(height/100)

            System.out.printf("* %s님의 bmi 지수 결과: %.2f㎏/㎡",name,bmi);
            s.close();
            s1.close();
        }
    }
