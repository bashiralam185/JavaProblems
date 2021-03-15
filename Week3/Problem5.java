import java.util.Scanner;

public class Problem5 {
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        int x= input.nextInt();
        if (x>=0 && x<=5){
            System.out.println("Good night!");
        }
        else if ( x<10){
            System.out.println("Good morning!");
        }
        else if(x<20){
            System.out.println("Good day!");
        }
        else{
            System.out.println("Good evening!");
        }
    }
}
