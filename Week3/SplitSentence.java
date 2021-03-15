import java.util.Scanner;

public class SplitSentence {
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        String x= input.nextLine();
        String X = x.replaceAll("\\p{Punct}", "");
        X = X.replaceAll("[—123456789’‘]", "");
        String[] arrOfStr = X.split("", 100);
        String y="";
        for (String a : arrOfStr) {
            if(a==")"){
                System.out.println("this actually works");
            }
            y+=a;
        }
        System.out.println(y);

    }
}
