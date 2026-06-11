package ai0611.abstracttest;

public class man extends person{
    //추상 클래스를 상속 받으려면
    // - 추상메소드를 구현하거나 현재 클래스가 추상클래스이던지
    @Override
    public void study() {
        System.out.println("아들이 공부를 열심히 한다");
    }
}
