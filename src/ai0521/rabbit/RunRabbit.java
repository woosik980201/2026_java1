package ai0521.rabbit;

public class RunRabbit {

    public static void main(String[] args) {

        Rabbit rabbit1 = new Rabbit();
        Rabbit rabbit2 = new Rabbit("작은 네모");

        rabbit1.setLocation(50, 50);
        rabbit2.setLocation(150, 70);

        rabbit1.setShape("기본");
        rabbit1.printInfo();
        rabbit2.printInfo();

        rabbit1.setShape("다이아몬드");
        rabbit1.setXPos(rabbit1.getXPos() + 60);
        rabbit1.setYPos(rabbit1.getYPos() + 20);
        rabbit1.printInfo();

     //좁은 네모 모양의 토끼가 현재 위치에서 오른쪽 50만큼, 왼쪽 20만큼 이동
        rabbit2.printInfo();//좁은 네모 현재위치 출력
        for(int i=0;i<5;i++){
            rabbit2.moveRightTen();//10씩 5번 오른쪽 이동
        }
        rabbit2.printInfo();//좁은 네모 현재위치 출력
        for(int i=0;i<2;i++){
            rabbit2.moveLeftTen();//10씩 2번 왼쪽 이동
        }

        rabbit2.printInfo();
    }
}
