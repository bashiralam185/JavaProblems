import java.util.Scanner;

public class Problem8 {
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        int x= input.nextInt();
        int y = input.nextInt();
        int z= input.nextInt();

        if (x==y && y==z){
            System.out.println("They are all equal");
        }
        else if(x<y && x<z){
            System.out.println("The least of these three numbers is "+x);
        }
        else if (y<x && y<z){
            System.out.println("The least of these three numbers is "+y);
        }
        else{
            System.out.println("The least of these three numbers is "+z);
        }
    }
}
