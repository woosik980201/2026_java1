package ai0409;

import java.util.Scanner;

public class averagesubject {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("=========== 과목 성적 평균 ===========");
        System.out.println("*4.5성적 입력값은 0~4.5이하의 값을 입력하세요.*");
        System.out.println("프로그래밍언어실습(3) 입력");
        double SCORE1 = s.nextDouble();
        System.out.println("웹프로그래밍실습(3) 입력");
        double SCORE2 = s.nextDouble();
        System.out.println("프롬프트엔지니어링(2) 입력");
        double SCORE3 = s.nextDouble();

        double avg=(SCORE1*3+SCORE2*3+SCORE3*2)/(3+3+2);
        System.out.printf("3과목 평균: %.2f\n",avg);
        s.close();
    }
}

