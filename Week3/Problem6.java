import java.util.Scanner;

public class Problem6 {
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        int x= input.nextInt();
        if (x>=18 && x<=50){
            System.out.println("Old enough!");
        }
        else if(x>=9 && x<18){
            System.out.println("Too young");
        }
        else{
            System.out.println("Incorrect age");
        }
    }
}
