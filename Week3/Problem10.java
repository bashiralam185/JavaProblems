import java.util.Scanner;

public class Problem10 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String x= input.next();
        String y = input.next();
        String scissor ="sc";
        String rock = "rc";
        String paper = "pp";
        if(x.equals(scissor) &&  y.equals(paper)){
            System.out.println("Winner is Player1");
        }
        else if(x.equals(rock) && y.equals(scissor)){
            System.out.println("Winner is Player1");
        }
        else if(x.equals(paper) && y.equals(rock)){
            System.out.println("Winner is Player1");
        }
        else if (y.equals(scissor) && x.equals(paper)){
            System.out.println("Winner is Player2");
        }
        else if( y.equals(paper) && x.equals(rock)){
            System.out.println("Winner is Player2");
        }
        else if(y.equals(rock) && x.equals(scissor)){
            System.out.println("Winner is Player2");
        }
        else{
            System.out.println("Draw");
        }
    }
}
