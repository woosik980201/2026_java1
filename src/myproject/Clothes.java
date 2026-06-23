package myproject;

/*
 * [자식 클래스 / Sub Class] 상의
 *
 * Product 를 상속(extends)받는다.
 *  - 재고 관리(addStock, canSell, removeStock 등) 기능은 부모 것을 그대로 사용
 *  - getCategory() 만 "상의"로 재정의(오버라이딩)
 */
public class Clothes extends Product {

    // 부모 생성자(super) 호출로 이름과 재고를 초기화
    public Clothes(String name, int stock) {
        super(name, stock);
    }

    // [오버라이딩] 부모의 getCategory()를 상의에 맞게 재정의
    @Override
    public String getCategory() {
        return "상의";
    }
}
