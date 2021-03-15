import java.util.Scanner;

public class ShiftLeft {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String number =userGet(input);
        System.out.println("Enter N:");
        int num= input.nextInt();
        shift(number, num);
    }
    public static String userGet(Scanner input){
        System.out.println("Enter your numbers, press return to end.");
//        Scanner input = new Scanner(System.in);
        String string="";
        while(true){
            String number=input.nextLine();
            try {
                int num= Integer.parseInt(number);
                string+=num+" ";
            }
            catch (Exception e){
                if (number.isEmpty()){
                    break;
                }
                else{
                    System.out.println("Not a legal number. Try again!");
                }
            }
//            System.out.println(number);

        }
        return string;
    }
    public static void shift(String number, int num){
        String[] intInputNumbers = number.split(" ");
        String [] shiftLeft= new String[intInputNumbers.length];
        while(num>intInputNumbers.length){
            num-=intInputNumbers.length;
        }
        for(int j= num; j<intInputNumbers.length; j++){
            System.out.print(intInputNumbers[j]);
//            System.out.print(",");
        }
        for(int i=0; i<num; i++){
            System.out.print(intInputNumbers[i]);
////            if(i!=num-1){
////                System.out.print(",");
//            }
        }
    }
}
