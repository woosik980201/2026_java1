package myproject;

import java.util.Scanner;

public class stocklist {
    public static void main(String[] args) {
        // 키보드 입력을 받기 위한 Scanner 객체 생성
        Scanner sc = new Scanner(System.in);

        // 각 상품의 재고 수량을 int 변수로 저장
        int tshirtStock = 10;
        int denimStock = 8;
        int hoodieStock = 5;

        // 프로그램 반복 실행 여부를 저장하는 변수
        boolean run = true;

        // 사용자가 종료를 선택할 때까지 반복
        while (run) {
            // 메인 메뉴 화면 출력
            printTop();
            printCenter("EDIT SHOP STOCK MANAGER");
            printCenter("편집샵 재고 관리 프로그램");
            printMiddle();
            printLine("[1] 입고 처리");
            printLine("[2] 판매 처리");
            printLine("[3] 재고 조회");
            printLine("[4] 종료");
            printBottom();
            System.out.print("메뉴 번호를 입력하세요: ");
            int menu = sc.nextInt();

            switch (menu) {
                case 1:
                    // 입고 처리 상품 선택 화면 출력
                    System.out.println();
                    printProductMenu("입고 처리");
                    System.out.print("상품 번호를 입력하세요: ");
                    int addProduct = sc.nextInt();

                    switch (addProduct) {
                        case 1:
                            System.out.println();
                            printInfoBox("입고 상품 정보", "반팔 티셔츠", tshirtStock);
                            System.out.print("입고 수량을 입력하세요: ");
                            int addTshirt = sc.nextInt();
                            tshirtStock = tshirtStock + addTshirt;

                            // 입고 결과 화면 출력
                            System.out.println();
                            printResultBox("입고 처리 완료", "반팔 티셔츠", "입고 수량", addTshirt, tshirtStock);
                            break;

                        case 2:
                            System.out.println();
                            printInfoBox("입고 상품 정보", "데님 팬츠", denimStock);
                            System.out.print("입고 수량을 입력하세요: ");
                            int addDenim = sc.nextInt();
                            denimStock = denimStock + addDenim;

                            // 입고 결과 화면 출력
                            System.out.println();
                            printResultBox("입고 처리 완료", "데님 팬츠", "입고 수량", addDenim, denimStock);
                            break;

                        case 3:
                            System.out.println();
                            printInfoBox("입고 상품 정보", "후드집업", hoodieStock);
                            System.out.print("입고 수량을 입력하세요: ");
                            int addHoodie = sc.nextInt();
                            hoodieStock = hoodieStock + addHoodie;

                            // 입고 결과 화면 출력
                            System.out.println();
                            printResultBox("입고 처리 완료", "후드집업", "입고 수량", addHoodie, hoodieStock);
                            break;

                        default:
                            System.out.println();
                            printMessageBox("잘못된 상품 번호입니다.");
                            break;
                    }
                    break;

                case 2:
                    // 판매 처리 상품 선택 화면 출력
                    System.out.println();
                    printProductMenu("판매 처리");
                    System.out.print("상품 번호를 입력하세요: ");
                    int sellProduct = sc.nextInt();

                    switch (sellProduct) {
                        case 1:
                            System.out.println();
                            printInfoBox("판매 상품 정보", "반팔 티셔츠", tshirtStock);
                            System.out.print("판매 수량을 입력하세요: ");
                            int sellTshirt = sc.nextInt();

                            if (sellTshirt > tshirtStock) {
                                // 판매 실패 화면 출력
                                System.out.println();
                                printFailBox("반팔 티셔츠", sellTshirt, tshirtStock);
                            } else {
                                tshirtStock = tshirtStock - sellTshirt;

                                // 판매 결과 화면 출력
                                System.out.println();
                                printResultBox("판매 처리 완료", "반팔 티셔츠", "판매 수량", sellTshirt, tshirtStock);
                            }
                            break;

                        case 2:
                            System.out.println();
                            printInfoBox("판매 상품 정보", "데님 팬츠", denimStock);
                            System.out.print("판매 수량을 입력하세요: ");
                            int sellDenim = sc.nextInt();

                            if (sellDenim > denimStock) {
                                // 판매 실패 화면 출력
                                System.out.println();
                                printFailBox("데님 팬츠", sellDenim, denimStock);
                            } else {
                                denimStock = denimStock - sellDenim;

                                // 판매 결과 화면 출력
                                System.out.println();
                                printResultBox("판매 처리 완료", "데님 팬츠", "판매 수량", sellDenim, denimStock);
                            }
                            break;

                        case 3:
                            System.out.println();
                            printInfoBox("판매 상품 정보", "후드집업", hoodieStock);
                            System.out.print("판매 수량을 입력하세요: ");
                            int sellHoodie = sc.nextInt();

                            if (sellHoodie > hoodieStock) {
                                // 판매 실패 화면 출력
                                System.out.println();
                                printFailBox("후드집업", sellHoodie, hoodieStock);
                            } else {
                                hoodieStock = hoodieStock - sellHoodie;

                                // 판매 결과 화면 출력
                                System.out.println();
                                printResultBox("판매 처리 완료", "후드집업", "판매 수량", sellHoodie, hoodieStock);
                            }
                            break;

                        default:
                            System.out.println();
                            printMessageBox("잘못된 상품 번호입니다.");
                            break;
                    }
                    break;

                case 3:
                    // 재고 조회 화면 출력
                    System.out.println();
                    printStockTable(tshirtStock, denimStock, hoodieStock);
                    break;

                case 0:
                case 4:
                    // 종료 화면 출력
                    run = false;
                    System.out.println();
                    printMessageBox("프로그램을 종료합니다.");
                    break;

                default:
                    // 잘못된 메뉴 번호 안내 화면 출력
                    System.out.println();
                    printTop();
                    printLine("잘못된 메뉴 번호입니다.");
                    printLine("[1] ~ [4] 중에서 선택하세요.");
                    printBottom();
                    break;
            }

            System.out.println();
        }

        // Scanner 종료
        sc.close();
    }

    // 상품 선택 메뉴를 출력하는 메서드
    public static void printProductMenu(String title) {
        printTop();
        printCenter(title);
        printMiddle();
        printLine("[1] 반팔 티셔츠");
        printLine("[2] 데님 팬츠");
        printLine("[3] 후드집업");
        printBottom();
    }

    // 상품 정보 화면을 출력하는 메서드
    public static void printInfoBox(String title, String productName, int stock) {
        printTop();
        printCenter(title);
        printMiddle();
        printLine("상품명       : " + productName);
        printLine("현재 재고    : " + stock);
        printBottom();
    }

    // 입고/판매 성공 결과 화면을 출력하는 메서드
    public static void printResultBox(String title, String productName, String countText, int count, int stock) {
        printTop();
        printCenter(title);
        printMiddle();
        printLine("상품명       : " + productName);
        printLine(countText + "    : " + count);
        printLine("변경 후 재고 : " + stock);
        printBottom();
    }

    // 판매 실패 화면을 출력하는 메서드
    public static void printFailBox(String productName, int sellCount, int stock) {
        printTop();
        printCenter("판매 처리 실패");
        printMiddle();
        printLine("상품명       : " + productName);
        printLine("판매 수량    : " + sellCount);
        printLine("현재 재고    : " + stock);
        printLine("안내         : 재고가 부족합니다.");
        printBottom();
    }

    // 간단한 안내 메시지 화면을 출력하는 메서드
    public static void printMessageBox(String message) {
        printTop();
        printCenter(message);
        printBottom();
    }

    // 재고 현황을 표처럼 출력하는 메서드
    public static void printStockTable(int tshirtStock, int denimStock, int hoodieStock) {
        int totalStock = tshirtStock + denimStock + hoodieStock;

        System.out.println("╔════════════╦════════════════╦══════════╗");
        printTableLine("상품 번호", "상품명", "재고 수량");
        System.out.println("╠════════════╬════════════════╬══════════╣");
        printTableLine("[1]", "반팔 티셔츠", tshirtStock);
        printTableLine("[2]", "데님 팬츠", denimStock);
        printTableLine("[3]", "후드집업", hoodieStock);
        System.out.println("╠════════════╩════════════════╬══════════╣");
        System.out.print("║ ");
        System.out.print(padRight("전체 재고", 28));
        System.out.print(" ║ ");
        System.out.print(padRight("" + totalStock, 8));
        System.out.println(" ║");
        System.out.println("╚═════════════════════════════╩══════════╝");
    }

    // 표 한 줄을 출력하는 메서드
    public static void printTableLine(String number, String productName, int stock) {
        printTableLine(number, productName, "" + stock);
    }

    // 표 한 줄을 출력하는 메서드
    public static void printTableLine(String number, String productName, String stock) {
        System.out.print("║ ");
        System.out.print(padRight(number, 10));
        System.out.print(" ║ ");
        System.out.print(padRight(productName, 14));
        System.out.print(" ║ ");
        System.out.print(padRight(stock, 8));
        System.out.println(" ║");
    }

    // 박스의 위쪽 선을 출력하는 메서드
    public static void printTop() {
        System.out.println("╔════════════════════════════════════════╗");
    }

    // 박스의 중간 구분선을 출력하는 메서드
    public static void printMiddle() {
        System.out.println("╠════════════════════════════════════════╣");
    }

    // 박스의 아래쪽 선을 출력하는 메서드
    public static void printBottom() {
        System.out.println("╚════════════════════════════════════════╝");
    }

    // 박스 안에 왼쪽 정렬 문장을 출력하는 메서드
    public static void printLine(String text) {
        System.out.println("║ " + padRight(text, 38) + " ║");
    }

    // 박스 안에 가운데 정렬 문장을 출력하는 메서드
    public static void printCenter(String text) {
        int space = 38 - getDisplayWidth(text);
        int left = space / 2;
        int right = space - left;

        System.out.println("║ " + repeatSpace(left) + text + repeatSpace(right) + " ║");
    }

    // 한글은 2칸, 영어와 숫자는 1칸으로 계산해서 오른쪽 공백을 채우는 메서드
    public static String padRight(String text, int width) {
        int space = width - getDisplayWidth(text);
        return text + repeatSpace(space);
    }

    // 문자열의 실제 콘솔 출력 폭을 계산하는 메서드
    public static int getDisplayWidth(String text) {
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

    // 필요한 개수만큼 공백을 만드는 메서드
    public static String repeatSpace(int count) {
        String space = "";

        for (int i = 0; i < count; i++) {
            space = space + " ";
        }

        return space;
    }
}
