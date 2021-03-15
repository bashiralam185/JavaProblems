import java.util.Scanner;
public class ZeroFront {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String[] numArray = input.nextLine().trim().split(" ");
        try {
            int[] numArrayInt = new int[numArray.length];
            for (int k = 0; k < numArray.length; k++) {
                numArrayInt[k] = Integer.parseInt(numArray[k]);
            }
            int[] returnArray = zeroFront(numArrayInt);
            for (int k : returnArray) System.out.print(k + " ");

        } catch (NumberFormatException e) {
            System.out.println("Input Error");
        }
    }
    public static int[] zeroFront(int[] numbers){
        int lenght= numbers.length;
        System.out.println(lenght);
        try{
            int i=0;
            int j=0;
            for(int count: numbers){
                if(count==0){
                    System.out.println(count);
                    int x= numbers[i];
                    numbers[i]=count;
                    numbers[j]=x;
                    i++;
                }
                j++;
            }
        }
        catch (Exception e){
            System.out.println("invalid input");
        }
        return numbers;
        }
    }
