import java.util.Scanner;


public class Calculator {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String input = console.nextLine().trim();
        String[] check = input.split(" ", -1);
        int a = Integer.parseInt(check[0]);
        int b = Integer.parseInt(check[2]);
        if (b==0 && check[1].equals("/") | check[1].equals("%")){
            System.out.println("Error");
        }else {
            switch (check[1]){
                case "%":
                    System.out.println(modulo(a,b));
                    break;
                case "*":
                    System.out.println(multiplication(a,b));
                    break;
                case "/":
                    System.out.println(division(a,b));
                    break;
                case "-":
                    System.out.println(subtraction(a,b));
                    break;
                case "+":
                    System.out.println(addition(a,b));
                    break;
            }
        }
    }

    private static int addition(int number1, int number2) {

        return number1+number2;
    }

    private static int subtraction(int number1, int number2) {
        return number1-number2;
    }

    private static int multiplication(int number1, int number2) {
        return number1*number2;
    }

    private static int division(int dividend, int divisor) {
        return dividend/divisor;
    }

    private static int modulo(int dividend, int divisor){
        return dividend%divisor;
    }
}