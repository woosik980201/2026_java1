package ai0416;

public class ReplaceAllTest {
    public static void main(String[] args) {
        String s1 = ("한국 폴리텍 대학 서울 정수 캠퍼스");
        String s2 = s1.replaceAll(" ","");
        System.out.println("원래문자열: " + s1);
        System.out.println("바꾼문자열: " + s2);

        s1="인공지능소프트웨어과 1학년";
        System.out.println("\"지능\"의 인덱스번호: " +s1.indexOf("지능"));//2
        System.out.println("\"웨\"의 인덱스번호: " +s1.indexOf("웨"));//7

        s1="한국에는 한국 폴리텍대학이 한국 전체에 많은 곳에 캠퍼스가 위치해 있습니다.";
        System.out.println("s1의 4번 위치부터 찾아서 한국 이라는 문자열의 인덱스 번호:" + s1.indexOf("한국",4));


        s1="서울정수";
        System.out.println("전체문자열길이: "+s1.length());
        System.out.println(s1.charAt(0));
        System.out.println(s1.charAt(1));
        System.out.println(s1.charAt(2));
        System.out.println(s1.charAt(3));
       // System.out.println(s1.charAt(4));

        //  s1에서 "울정" 문자열만 반환받아 보세요.
        System.out.println(s1.substring(1,3));

        // 원본 문자열 ==> 블랙핑크
        // 반대 문자열 ==> 크핑랙블
        s1="블랙핑크";
        System.out.print(s1.charAt(3));
        System.out.print(s1.charAt(2));
        System.out.print(s1.charAt(1));
        System.out.print(s1.charAt(0));

        String originStr="블랙핑크";

        System.out.println("원본문자열: "+originStr);

        System.out.println("반대문자열: ");
        System.out.print(s1.charAt(3));
        System.out.print(s1.charAt(2));
        System.out.print(s1.charAt(1));
        System.out.print(s1.charAt(0));

    }
}
