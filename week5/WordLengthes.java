import java.util.Scanner;

public class WordLengthes {
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        String result= input.nextLine();
        String string = result.replaceAll("\\p{Punct}", "");
        System.out.println(string);
        wordLenght(string);

    }
    public static void wordLenght(String string){
        String words[]= string.split(" ");
        int i=1;
        for(String word : words){
            System.out.print(i+" : ");
            if (word.length()<10){
                System.out.print(word.length()+"    ");
            }
            else{
                System.out.print(word.length()+"   ");
            }
            for(int j=0; j<word.length(); j++){
                System.out.print("*");
            }
            System.out.println("");
            i++;

        }
    }
}
