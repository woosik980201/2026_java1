package ai0402;

import java.util.Scanner;

public class iftest {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("===== 운전면허 합격여부 확인 ======");

        System.out.println("시험 점수를 입력하세요");
        int score = s.nextInt();
        String result="";

        if(score>=70)
        result = "합격";
        else
    result = "불합격";

        System.out.printf("%d점이므로 %입니다.",score,result );
        s.close();
    }
}
