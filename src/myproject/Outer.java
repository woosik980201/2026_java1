package myproject;

/*
 * [자식 클래스 / Sub Class] 아우터
 * Product 를 상속받고 getCategory() 만 "아우터"로 재정의한다.
 */
public class Outer extends Product {

    public Outer(String name, int stock) {
        super(name, stock);   // 부모 생성자 호출
    }

    // [오버라이딩]
    @Override
    public String getCategory() {
        return "아우터";
    }
}
