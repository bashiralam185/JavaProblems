import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        int x= input.nextInt();
        if (x%2==0){
            System.out.println("This number is even");
        }
        if(x==0){
            System.out.println("0 is not odd nor even");
        }
        else{
            System.out.println("This number is odd");
        }
    }
}
