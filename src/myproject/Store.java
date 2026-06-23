package myproject;

/*
 * [상품 목록 관리 클래스]
 *
 * 매장이 보유한 상품들을 하나의 배열로 모아서 관리한다.
 *
 * ★ 다형성(Polymorphism) 핵심 ★
 *  - 배열의 타입은 부모 타입인 Product[] 하나지만,
 *    실제로 담기는 객체는 자식들(Clothes, Pants, Outer)이다.
 *  - 즉 "부모 타입 하나로 서로 다른 자식 객체들을 동일하게 관리"한다.
 *  - 그래서 getCategory()를 호출하면 각 객체의 실제 타입에 맞는
 *    메서드가 자동으로 실행된다(동적 바인딩).
 */
public class Store {

    // 부모 타입(Product) 배열로 자식 객체들을 함께 보관 → 다형성
    private Product[] products;

    // 생성자: 초기 상품 3종을 자식 클래스로 생성해 배열에 등록
    public Store() {
        products = new Product[] {
            new Clothes("반팔 티셔츠", 10),  // Clothes 객체지만 Product 타입으로 보관
            new Pants("데님 팬츠", 8),       // Pants 객체  -> Product 타입으로 보관
            new Outer("후드집업", 5)         // Outer 객체  -> Product 타입으로 보관
        };
    }

    // 전체 상품 목록 반환 (화면 출력용)
    public Product[] getProducts() {
        return products;
    }

    // 등록된 상품 개수
    public int size() {
        return products.length;
    }

    // 입력한 상품 번호가 유효한 범위(1 ~ 상품 개수)인지 검사
    public boolean isValidNumber(int number) {
        return number >= 1 && number <= products.length;
    }

    // 상품 번호(1부터 시작)로 실제 상품 객체를 찾아 반환
    public Product getProduct(int number) {
        return products[number - 1];
    }

    // 전체 재고 합계 계산
    public int getTotalStock() {
        int total = 0;
        for (Product product : products) {
            total = total + product.getStock();
        }
        return total;
    }
}
