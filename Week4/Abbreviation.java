import java.util.Scanner;

public class Abbreviation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int text=input.nextInt();
        String string;
        for(int i=0; i<text; i++){
            string = input.next();
            if (string.length()>10){
//            System.out.println(string.charAt(0)+(string.length()-2)+string.charAt(string.length()-1));
                System.out.print(string.charAt(0));
                System.out.print(string.length()-2);
                System.out.print(string.charAt(string.length()-1));
            }
            else{
                System.out.println(string);
            }
        }

    }

//    private static char abbreviate(String word) {
//        return word.charAt(1)+(word.length()-1)+word.charAt(-1);
////        har ch1 = str.charAt(0);
//    }
}
