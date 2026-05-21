package ai0521.car;

public class RunCar {
    public static void main(String[] args) {
        car sonata = new car("현대자동차", "그렌져", 1600, "은색", 40000000);
        System.out.println("===== 자동차 정보 =====");
        System.out.println("제조사: " + sonata.getProduct());
        System.out.println("자동차모델: " + sonata.getName());
        System.out.println("배기량: "+ sonata.getDisplacement());
        System.out.println("색상: " + sonata.getColor());
        System.out.println("가격: " + sonata.getPrice());

        sonata.startOn("");
        sonata.drive("");
        sonata.forward("");
        sonata.rotate("좌회전");
        sonata.drive("");

        car ev6 = new car();
        ev6.setProduct("기아자동차");
        ev6.setName("EV6");
        ev6.setDisplacement(1500);
        ev6.setColor("파랑");
        ev6.setPrice(50000000);

        System.out.println("제조사: " + ev6.getProduct());
        System.out.println("자동차모델: " + ev6.getName());
        System.out.println("배기량: "+ ev6.getDisplacement() + "cc");
        System.out.println("색상: " + ev6.getColor());
        System.out.println("가격: " + ev6.getPrice());

    }
}
