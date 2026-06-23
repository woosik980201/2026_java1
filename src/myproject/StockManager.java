package myproject;

import java.util.Scanner;

/*
 * [프로그램 흐름 제어(Controller) 담당 클래스]
 *
 * 역할: 메뉴 반복(while), 사용자 입력(Scanner), 어떤 작업을 할지 결정하는
 *       전체 흐름을 담당한다. 프로그램의 "지휘자" 역할.
 *
 * 역할 분리 포인트 (각자 자기 일만 한다):
 *  - StockManager : 흐름 제어 + 입력 처리   (이 클래스)
 *  - Store        : 상품 데이터 관리
 *  - Product 계열 : 상품별 재고 계산/분류
 *  - ConsoleView  : 화면 출력
 *  => StockManager 는 직접 출력하거나 직접 계산하지 않고,
 *     Store(데이터)와 ConsoleView(화면)에게 일을 시켜서 조율만 한다.
 */
public class StockManager {

    private Scanner sc;       // 키보드 입력
    private Store store;      // 상품 데이터 관리
    private ConsoleView view; // 화면 출력 담당
    private boolean run;      // 프로그램 반복 여부

    // 생성자: 필요한 객체들을 준비
    public StockManager() {
        sc = new Scanner(System.in);
        store = new Store();
        view = new ConsoleView();
        run = true;
    }

    // 프로그램 시작 (메인 루프)
    public void start() {
        while (run) {
            printMainMenu();
            System.out.print("메뉴 번호를 입력하세요: ");
            int menu = sc.nextInt();

            switch (menu) {
                case 1:
                    processAdd();   // 입고 처리
                    break;

                case 2:
                    processSell();  // 판매 처리
                    break;

                case 3:
                    // 재고 조회
                    System.out.println();
                    view.printStockTable(store);
                    System.out.println();
                    view.printCategoryList(store);   // [추가] 다형성 데모: 상품 분류 출력
                    break;

                case 0:
                case 4:
                    // 종료
                    run = false;
                    System.out.println();
                    view.printMessageBox("프로그램을 종료합니다.");
                    break;

                default:
                    // 잘못된 메뉴 번호 안내
                    System.out.println();
                    view.printTop();
                    view.printLine("잘못된 메뉴 번호입니다.");
                    view.printLine("[1] ~ [4] 중에서 선택하세요.");
                    view.printBottom();
                    break;
            }

            System.out.println();
        }

        sc.close();
    }

    // 메인 메뉴 화면 출력
    private void printMainMenu() {
        view.printTop();
        view.printCenter("Select SHOP STOCK MANAGER");
        view.printCenter("편집샵 재고 관리 프로그램");
        view.printMiddle();
        view.printLine("[1] 입고 처리");
        view.printLine("[2] 판매 처리");
        view.printLine("[3] 재고 조회");
        view.printLine("[4] 종료");
        view.printBottom();
    }

    // 입고 처리 흐름
    private void processAdd() {
        System.out.println();
        view.printProductMenu("입고 처리", store);
        System.out.print("상품 번호를 입력하세요: ");
        int productNumber = sc.nextInt();

        // 잘못된 상품 번호 처리
        if (!store.isValidNumber(productNumber)) {
            System.out.println();
            view.printMessageBox("잘못된 상품 번호입니다.");
            return;
        }

        Product product = store.getProduct(productNumber);

        System.out.println();
        view.printInfoBox("입고 상품 정보", product.getName(), product.getStock());
        System.out.print("입고 수량을 입력하세요: ");
        int count = sc.nextInt();

        product.addStock(count);

        System.out.println();
        view.printResultBox("입고 처리 완료", product.getName(), "입고 수량", count, product.getStock());
    }

    // 판매 처리 흐름
    private void processSell() {
        System.out.println();
        view.printProductMenu("판매 처리", store);
        System.out.print("상품 번호를 입력하세요: ");
        int productNumber = sc.nextInt();

        // 잘못된 상품 번호 처리
        if (!store.isValidNumber(productNumber)) {
            System.out.println();
            view.printMessageBox("잘못된 상품 번호입니다.");
            return;
        }

        Product product = store.getProduct(productNumber);

        System.out.println();
        view.printInfoBox("판매 상품 정보", product.getName(), product.getStock());
        System.out.print("판매 수량을 입력하세요: ");
        int count = sc.nextInt();

        if (!product.canSell(count)) {
            // 재고 부족 → 판매 실패
            System.out.println();
            view.printFailBox(product.getName(), count, product.getStock());
        } else {
            // 판매 성공
            product.removeStock(count);
            System.out.println();
            view.printResultBox("판매 처리 완료", product.getName(), "판매 수량", count, product.getStock());
        }
    }

    // 프로그램 진입점
    public static void main(String[] args) {
        StockManager program = new StockManager();
        program.start();
    }
}
