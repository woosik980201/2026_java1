package ai0521.rabbit;

public class Rabbit {
    private String shape;//토끼의 모양
    private String xPos;//x 위치
    private int yPos;//y 위치




    //기본 생성자
    public Rabbit() {
    }
    //일반 생성자
    public Rabbit(String shape) {
        this.shape = shape;
    }

    //getter 메소드: 필드에 저장된 값을 반환
    //setter 메소드: 필드에 값을 설정(저장)
    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    public String getxPos() {
        return xPos;
    }

    public void setxPos(String xPos) {
        this.xPos = xPos;
    }

    public int getyPos() {
        return yPos;
    }

    public void setyPos(int yPos) {
        this.yPos = yPos;
    }
}
