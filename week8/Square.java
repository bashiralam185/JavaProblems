public class Square extends Rectangle{
    public Square() {
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }
    public double getSide(){
        return getWidht();
    }
    public void setSide(double side){
        setLenght(side);
        setWidht(side);
    }
    public void setWidht(double side){
        super.setWidht(side);
    }
    public void setLenght(double side){
        super.setLenght(side);
    }

    public String toString(){
        return "Square[Rectangle[Shape[color="+getColor()+",filled="+isFilled()+"],width="+getWidht()+",lenght="+getLenght()+"]]";
    }


}
