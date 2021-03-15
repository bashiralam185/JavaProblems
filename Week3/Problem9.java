import java.util.Scanner;

public class Problem9 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        float total= input.nextFloat();
        if (total >=93 && total <101){
            System.out.println("A 4.0");
        }
        else  if( total >=90 && total <101){
            System.out.println("A- 3.67");
        }
        else if(total>=87 && total <101){
            System.out.println("B+ 3.33");
        }
        else if(total >=83 && total <101){
            System.out.println("B 3.0");
        }
        else if(total>=80 && total <101){
            System.out.println("B- 2.67");
        }
        else if(total>=77 && total <101){
            System.out.println("C+ 2.33");
        }
        else if(total>=70 && total <101){
            System.out.println("C 2.0");
        }
        else if(total>=60 && total <101){
            System.out.println("D 1.0");
        }
        else if(total>=0 && total <101){
            System.out.println("F 0.0");
        }
        else{
            System.out.println("Incorrect grade");
        }
    }
}
