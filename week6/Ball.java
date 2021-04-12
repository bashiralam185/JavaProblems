public class Ball {
    private float x;
    private float y;
    private int radius;
    private float xDelta;
    private float yDelta;

    public Ball(float x, float y, int radius, int speed, int direction){
        this.x=x;
        this.y=y;
        this.radius=radius;
        this.yDelta= (float) direction;
        this.xDelta= (float) speed ;
    }



    public float getX() {
        return this.x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return this.y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public float getXDelta() {
        return xDelta;
    }

    public void setXDelta(float xDelta) {
        this.xDelta = xDelta;
    }

    public float getYDelta() {
        return yDelta;
    }

    public void setYDelta(float yDelta) {
        this.yDelta = yDelta;
    }

    public void move(){
        this.x+=xDelta;
        this.y+=yDelta;
    }

    public void reflectHorizontal(){
        xDelta=(-xDelta);
    }

    public void reflectVertical(){
        yDelta=(-yDelta);
    }

    @Override
    public String toString() {
        return "Ball[x=" +
                + x +
                ",y=" + y +
                ",speed=("+ (int) xDelta +
                ","+ (int) yDelta +
                ")]";
    }
}