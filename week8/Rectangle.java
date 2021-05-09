public class Rectangle extends Shape{
//    private double width=1.0;
//    private double lenght=1.0;
    protected double width;
    protected double lenght;
    public Rectangle() {
    }

    public Rectangle(double widht, double lenght) {
        this.width = widht;
        this.lenght = lenght;
    }

    public Rectangle(double width, double lenght, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.lenght = lenght;
    }

    public double getWidht() {
        return width;
    }

    public void setWidht(double width) {
        this.width = width;
    }

    public double getLenght() {
        return lenght;
    }

    public void setLenght(double lenght) {
        this.lenght = lenght;
    }


    public double getArea(){
        return 2*lenght*width;
    }
    public double getPerimeter(){
        return 2*(width+lenght);
    }
    public String toString(){
        return "Rectangle[Shape[color="+getColor()+",filled="+isFilled()+"],width="+width+",lenght="+lenght+"]";
    }
}
