public class Ball {
//    private float x;
//    private  float y;
//    private float z;
//
//    public Ball(float x, float y, float z) {
//        this.x = x;
//        this.y = y;
//        this.z = z;
//    }
//
//    public float getX() {
//        return x;
//    }
//
//    public float getY() {
//        return y;
//    }
//
//    public float getZ() {
//        return z;
//    }
//    public void setXYZ(float x, float y, float z){
//        this.x=x;
//        this.y=y;
//        this.z=z;
//    }
//
//    public String toString(){
//        return "("+x+","+y+","+z+")";
//    }

    private float x;
    private float y;
    private int radius;
    private float xDelta;
    private float yDelta;


    public Ball(float x, float y, int radius, int speed, int direction){
        this.x=x;
        this.y=y;
        this.radius=radius;
        //this.yDelta= (float) direction;
        //this.xDelta= (float) speed ;
        this.xDelta =  speed * (float) Math.cos(Math.toRadians(direction));
        this.yDelta = -speed * (float) Math.sin(Math.toRadians(direction));
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public int getRadius() {
        return radius;
    }

    public float getxDelta() {
        return xDelta;
    }

    public float getyDelta() {
        return yDelta;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void setxDelta(float xDelta) {
        this.xDelta = xDelta;
    }

    public void setyDelta(float yDelta) {
        this.yDelta = yDelta;
    }


    public void move(){
        this.x+=xDelta;
        this.y+=yDelta;
    }
    public void reflectHorizontal(){
        this.xDelta=-xDelta;
    }
    public void reflectVertical(){
        this.yDelta=-yDelta;
    }

    public String toString(){
        return "Ball[("+x+","+y+"),speed=("+xDelta+","+yDelta+")]";

    }
}
