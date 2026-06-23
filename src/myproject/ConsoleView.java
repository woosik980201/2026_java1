package myproject;

/*
 * [화면 출력(View) 담당 클래스]
 *
 * 역할: "보여주는 일"만 전담한다. 박스 그리기, 메뉴/표/메시지 출력 등
 *       콘솔에 무언가를 print 하는 코드는 전부 이 클래스에 모여 있다.
 *
 * 역할 분리 포인트:
 *  - 이 클래스는 데이터를 "어떻게 화면에 보여줄지"만 안다.
 *  - 재고를 더하고 빼는 "계산/판단(로직)"은 Product/Store 가 담당한다.
 *  - 메뉴 흐름/입력 처리는 StockManager 가 담당한다.
 *  => 화면 디자인이 바뀌어도 이 클래스만 고치면 되므로 유지보수가 쉽다.
 */
public class ConsoleView {

    // 상품 선택 메뉴 출력 (입고/판매 공통)
    // store 를 받아서 상품 목록을 그대로 화면에 뿌림 → 상품이 바뀌어도 자동 반영
    public void printProductMenu(String title, Store store) {
        printTop();
        printCenter(title);
        printMiddle();

        Product[] products = store.getProducts();
        for (int i = 0; i < products.length; i++) {
            printLine("[" + (i + 1) + "] " + products[i].getName());
        }

        printBottom();
    }

    // 상품 정보 화면 출력
    public void printInfoBox(String title, String productName, int stock) {
        printTop();
        printCenter(title);
        printMiddle();
        printLine("상품명       : " + productName);
        printLine("현재 재고    : " + stock);
        printBottom();
    }

    // 입고/판매 성공 결과 화면 출력
    public void printResultBox(String title, String productName, String countText, int count, int stock) {
        printTop();
        printCenter(title);
        printMiddle();
        printLine("상품명       : " + productName);
        printLine(countText + "    : " + count);
        printLine("변경 후 재고 : " + stock);
        printBottom();
    }

    // 판매 실패 화면 출력
    public void printFailBox(String productName, int sellCount, int stock) {
        printTop();
        printCenter("판매 처리 실패");
        printMiddle();
        printLine("상품명       : " + productName);
        printLine("판매 수량    : " + sellCount);
        printLine("현재 재고    : " + stock);
        printLine("안내         : 재고가 부족합니다.");
        printBottom();
    }

    // 간단한 안내 메시지 화면 출력
    public void printMessageBox(String message) {
        printTop();
        printCenter(message);
        printBottom();
    }

    // 재고 현황을 표처럼 출력
    public void printStockTable(Store store) {
        Product[] products = store.getProducts();
        int totalStock = store.getTotalStock();

        System.out.println("╔════════════╦════════════════╦══════════╗");
        printTableLine("상품 번호", "상품명", "재고 수량");
        System.out.println("╠════════════╬════════════════╬══════════╣");

        for (int i = 0; i < products.length; i++) {
            printTableLine("[" + (i + 1) + "]", products[i].getName(), products[i].getStock());
        }

        System.out.println("╠════════════╩════════════════╬══════════╣");
        System.out.print("║ ");
        System.out.print(padRight("전체 재고", 28));
        System.out.print(" ║ ");
        System.out.print(padRight("" + totalStock, 8));
        System.out.println(" ║");
        System.out.println("╚═════════════════════════════╩══════════╝");
    }

    // [추가] 상품 분류 정보 출력 — 각 상품의 getCategory()를 호출해 다형성을 보여줌
    // 기존 재고 조회 표는 그대로 두고, 아래에 분류 박스만 덧붙인다.
    public void printCategoryList(Store store) {
        Product[] products = store.getProducts();
        printTop();
        printCenter("상품 분류 정보");
        printMiddle();
        for (int i = 0; i < products.length; i++) {
            Product product = products[i];
            // product 의 선언 타입은 Product 지만, 실제 객체(Clothes/Pants/Outer)의
            // getCategory()가 자동으로 호출된다 → 다형성(동적 바인딩)
            printLine(padRight(product.getName(), 14) + ": " + product.getCategory());
        }
        printBottom();
    }

    // 표 한 줄 출력 (재고가 int 일 때)
    public void printTableLine(String number, String productName, int stock) {
        printTableLine(number, productName, "" + stock);
    }

    // 표 한 줄 출력 (재고가 String 일 때)
    public void printTableLine(String number, String productName, String stock) {
        System.out.print("║ ");
        System.out.print(padRight(number, 10));
        System.out.print(" ║ ");
        System.out.print(padRight(productName, 14));
        System.out.print(" ║ ");
        System.out.print(padRight(stock, 8));
        System.out.println(" ║");
    }

    // 박스 위쪽 선
    public void printTop() {
        System.out.println("╔════════════════════════════════════════╗");
    }

    // 박스 중간 구분선
    public void printMiddle() {
        System.out.println("╠════════════════════════════════════════╣");
    }

    // 박스 아래쪽 선
    public void printBottom() {
        System.out.println("╚════════════════════════════════════════╝");
    }

    // 박스 안 왼쪽 정렬 문장
    public void printLine(String text) {
        System.out.println("║ " + padRight(text, 38) + " ║");
    }

    // 박스 안 가운데 정렬 문장
    public void printCenter(String text) {
        int space = 38 - getDisplayWidth(text);
        int left = space / 2;
        int right = space - left;

        System.out.println("║ " + repeatSpace(left) + text + repeatSpace(right) + " ║");
    }

    // 한글 2칸, 영어/숫자 1칸 기준으로 오른쪽 공백 채우기
    public String padRight(String text, int width) {
        int space = width - getDisplayWidth(text);
        return text + repeatSpace(space);
    }

    // 문자열의 실제 콘솔 출력 폭 계산
    public int getDisplayWidth(String text) {
        int width = 0;

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (ch >= '가' && ch <= '힣') {
                width = width + 2;
            } else {
                width = width + 1;
            }
        }

        return width;
    }

    // 필요한 개수만큼 공백 생성
    public String repeatSpace(int count) {
        String space = "";

        for (int i = 0; i < count; i++) {
            space = space + " ";
        }

        return space;
    }
}
