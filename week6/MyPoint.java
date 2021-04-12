
import java.text.DecimalFormat;
public class MyPoint {
    private int x;
    private int y;

    public MyPoint(){

    };

    public MyPoint(int x, int y){
        this.x=x;
        this.y=y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int[] getXY(){
        int[] number1 = {this.x, this.y};
        return number1;
    }

    public void setXY(int x, int y){
        this.x=x;
        this.y=y;
    }

    @Override
    public String toString() {
        return "(" + x +
                "," + y +
                ")";
    }

    public double distance(int x2, int y2){
        DecimalFormat format = new DecimalFormat("##.00");
        return Double.parseDouble(format.format(Math.sqrt(Math.pow((x2-this.x),2) + Math.pow((y2-this.y),2))));
    }

    public double distance(MyPoint another){
        DecimalFormat format = new DecimalFormat("##.00");
        return Double.parseDouble(format.format(Math.sqrt(Math.pow((another.getX()-this.x),2) + Math.pow((another.getY()-this.y),2))));
    }

    public double distance(){
        DecimalFormat format = new DecimalFormat("##.00");
        return Double.parseDouble(format.format(Math.sqrt(Math.pow((this.x),2) + Math.pow((this.y),2))));
    }


}