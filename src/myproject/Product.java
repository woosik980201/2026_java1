package myproject;

/*
 * [부모 클래스 / Super Class]
 *
 * 모든 상품이 공통으로 가지는 데이터(이름, 재고)와
 * 공통 기능(입고, 판매, 재고 확인)을 한곳에 정의한다.
 *
 * Clothes, Pants, Outer 는 이 클래스를 상속받아
 * 공통 기능을 그대로 물려받고, getCategory() 만 각자 다르게 재정의한다.
 *  -> 공통 코드 중복 제거 + 확장에 열린 구조
 */
public class Product {

    // 캡슐화: 외부에서 직접 수정하지 못하도록 private 으로 보호
    private String name;   // 상품명
    private int stock;     // 재고 수량

    // 생성자: 상품 생성 시 이름과 초기 재고를 받아 초기화
    public Product(String name, int stock) {
        this.name = name;
        this.stock = stock;
    }

    // ----- 캡슐화된 데이터 읽기(getter) -----
    public String getName() {
        return name;
    }

    public int getStock() {
        return stock;
    }

    // ----- 모든 상품이 공유하는 공통 기능 (자식이 그대로 물려받음) -----

    // 입고: 재고 증가
    public void addStock(int count) {
        stock = stock + count;
    }

    // 판매 가능 여부 판단: 재고가 충분한지 확인
    public boolean canSell(int count) {
        return count <= stock;
    }

    // 판매: 재고 감소
    public void removeStock(int count) {
        stock = stock - count;
    }

    /*
     * [오버라이딩 대상 메서드]
     * 상품 분류를 반환한다. 부모는 기본값 "기타"를 돌려주고,
     * 자식 클래스(Clothes/Pants/Outer)가 이 메서드를 각자 재정의(@Override)한다.
     * 따라서 같은 getCategory() 호출이라도 실제 객체에 따라 결과가 달라진다(다형성).
     */
    public String getCategory() {
        return "기타";
    }
}
