public class Cricle {
    private double radius=1.0;
    private String color="red";

//constructor

    public Cricle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public Cricle(double radius) {
        this.radius = radius;
    }

    public Cricle() {
    }


//    getter and stters

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


//    Tostring and area method
    public String toString(){
        return "Circle[radius="+radius+",color="+color+"]";
    }

    public double getArea(){
        return 2*Math.pow(radius, 2)*Math.PI;
    }

}
