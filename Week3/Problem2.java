import java.util.Scanner;

public class Problem2 {
    public static  void main(String[] args){
        Scanner input= new Scanner(System.in);
        System.out.println("Enter a dividend: ");
        int x= input.nextInt();
        System.out.println("Enter a divisor:");
        int y= input.nextInt();
        if (y==0){
            System.out.println("Incorrect input!");
        }
        else{
            System.out.println("Quotient is : "+x/y);
        }
    }
}
