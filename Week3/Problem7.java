import java.util.Scanner;

public class Problem7 {
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        int x= input.nextInt();
        int y = input.nextInt();
        int z = input.nextInt();

        if (x+y>z && x+z>y && y+z>x){
            System.out.println("It is a valid triangle.");
        }
        else{
            System.out.println("It is not a valid triangle.");
        }
    }
}
