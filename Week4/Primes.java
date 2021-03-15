import java.util.Scanner;

public class Primes {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int number= input.nextInt();
        if(number>=2){
            System.out.print(2+ " ");
        }
        for( int i =2; i<=number; i++){
            if (i%2==0){
                continue;
            }
            else{
                int count=0;
                for(int j=2; j<i; j++){
                    if(i%j==0){
                        count++;
                    }
                }
                if (count==0){
                    System.out.print(i+" ");
                }
            }
        }
    }
}
