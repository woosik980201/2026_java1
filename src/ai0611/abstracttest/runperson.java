package ai0611.abstracttest;

public class runperson {
    public static void main(String[] args) {
        //       추상(abstract)클래스는 new 연산자로 객체생성이 불가능하다
        //       person person = new person();
        man man = new man();
        man.name = "김폴리";
        man.weight = 70;
        man.height = 180;

        woman woman = new woman();
        woman.name = "박인순";
        woman.weight = 48;
        woman.height = 170;

        man.eat("김치찌개");
        man.study();
        man.sleep(8);

        woman.eat("파스타");
        woman.study();
        woman.sleep(10);
    }
}
