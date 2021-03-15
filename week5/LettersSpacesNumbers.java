import java.util.Scanner;

public class LettersSpacesNumbers {
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        String string = input.nextLine();
        counting(string);
    }
    public static void counting(String string){
        int letters=0;
        int space=0;
        int number=0;
        int other=0;

        for(int i=0; i<string.length(); i++){
            if(Character.isDigit(string.charAt(i))){
                number++;
            }
            else if(Character.isAlphabetic(string.charAt(i))){
                letters++;
            }
            else if(Character.isSpaceChar(string.charAt(i))){
                space++;
            }
            else{
                other++;
            }

        }
        System.out.println("letter: "+ letters);
        System.out.println("space: "+ space);
        System.out.println("number: "+ number);
        System.out.println("other: "+other);

    }
}
