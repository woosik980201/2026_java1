package ai0521.rabbit;


public class Rabbit {

    private String shape;
    private int xPos;
    private int yPos;

    public Rabbit() {
    }

    public Rabbit(String shape) {
        this.shape = shape;
    }

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    public int getXPos() {
        return xPos;
    }

    public void setXPos(int xPos) {
        this.xPos = xPos;
    }

    public int getYPos() {
        return yPos;
    }

    public void setYPos(int yPos) {
        this.yPos = yPos;
    }

    public void setLocation(int xPos, int yPos) {
        this.xPos = xPos;
        this.yPos = yPos;
    }

    public void printInfo() {
        System.out.printf("%s 모양의 토끼는 (%d, %d) 좌표에 위치하고 있다.\n",
                shape, xPos, yPos);

    }
    //x축으로 10씩 오른쪽으로 이동하는 메소드
    public void moveRightTen() {
        xPos += 10;
    }



    //x축으로 10씩 왼쪽으로 이동하는 메소드
    public void moveLeftTen() {
        xPos -= 10;
    }
}
