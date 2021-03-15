import java.util.Scanner;

public class problem4 {
    public static void main(String[] args) {
        String temp = "Hello!";
        Scanner input = new Scanner(System.in);
        if(temp.indexOf(input.next())!=-1)
        {
            System.out.println("there is 'b' in temp string");
        }
        else
        {
            System.out.println("there is no 'b' in temp string");
        }

    }

}
