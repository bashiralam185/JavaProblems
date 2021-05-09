public class Player {
    private int number;
    private float x;
    private float y;
    private float z= 0.0f;

    public Player(int number, float x, float y) {
        this.number = number;
        this.x = x;
        this.y = y;
    }

    public int getNumber() {
        return number;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public float getZ() {
        return z;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setZ(float z) {
        this.z = z;
    }


    public void move(float xDisp, float yDisp){
        this.x+=xDisp;
        this.y+=yDisp;
    }
    public void jump(int zDisp){
        this.z=zDisp;
    }

    public boolean near( Ball ball){
        double value= Math.sqrt(Math.pow((this.x-ball.getX()), 2)+ Math.sqrt(Math.pow((this.y-ball.getY()), 2)+ Math.sqrt(Math.pow((this.z- ball.getZ()), 2))));
        return value <8;
    }
    public void kick(Ball ball){
        if (!near(ball)){
            move(ball.getX(), ball.getY());
        }
    }

}
