public class Cylider  extends  Cricle{
    public double height=1.0;

//    constructors


    public Cylider() {

    }

    public Cylider(double radius) {
//        super(radius);
        this(radius, 1.0);

    }

    public Cylider(double radius, double height) {
//        super(radius);
        this(radius, "radius", 1.0);
        this.height = height;
    }

    public Cylider(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

//    get height and set height

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume(){
//        return Math.PI*Math.pow(getRadius(), 2)*height;
        return super.getArea()*height;
    }
}
