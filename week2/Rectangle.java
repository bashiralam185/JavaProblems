public class Rectangle {
    float length= 1.0f;
    float width= 1.0f;


    public Rectangle(){
        this.length=1.0f;
        this.width=1.0f;
    }
    public  Rectangle(float length, float width){
        this.width=width;
        this.length=length;
    }

    public float getLength() {
        return length;
    }

    public float getWidth() {
        return width;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public void setWidth(float width) {
        this.width = width;
    }
    public double getArea(){
        return width*length;

    }
    public double getPerimeter(){
        return 2*(length+width);
    }

    public String toString(){
        return "Rectange[Lenght="+length+", width="+width+"]";
    }
}
