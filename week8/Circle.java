public class Circle extends Shape{
//    private double radius=1.0;
    protected double radius;
    public Circle() {

    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return Math.PI*2*Math.pow(radius, 2);
    }
    public double getPerimeter(){
        return Math.PI*2*radius;
    }
    public  String toString(){
        return "Circle[Shape[color="+getColor()+",filled="+isFilled()+"],radius="+radius+"]";
    }
}
