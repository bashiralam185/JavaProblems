public class MyPoint {
    private int x=0;
    private int y=0;

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public MyPoint(){

    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setXY(int x, int y){
        this.x=x;
        this.y=y;
    }

    public int[] getXY(){
        return new int[]{this.x, this.y} ;
    }

    public String toString(){
        return "\"("+getX()+","+getY()+")\"";
    }


    public double distance(int x, int y){
        return Math.sqrt(Math.pow((getX()-x), 2)+ Math.sqrt(Math.pow((getY()-y), 2)));
    }

    public double distance(MyPoint newPoint){
        return Math.sqrt(Math.pow((getX()-newPoint.x), 2)+ Math.sqrt(Math.pow((getY()-newPoint.y), 2)));

    }

    public double distance (){
        return Math.sqrt(Math.pow((getX()), 2)+ Math.sqrt(Math.pow((getY()), 2)));
    }

}
