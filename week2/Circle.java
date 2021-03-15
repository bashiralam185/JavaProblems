public class Circle {
    double radius= 1.0;
    String color= "red";

    public Circle(double radius) {
        this.radius = 0;
        this.color="";
    }
    public Circle (){
        this.radius=0;
        this.color="";
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public String toString(){
        return "radius is "+ radius+" and its color is "+color;
    }
    public double getArea(){
        return 3.14*radius*radius;
    }


}
