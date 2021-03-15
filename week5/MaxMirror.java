import java.util.Scanner;

public class MaxMirror {
    public static void main(String [] args){
//        Scanner console = new Scanner(System.in);
        Scanner input= new Scanner(System.in);
        String[] stringNumbers = input.nextLine().trim().split(" ");

        try {
            int[] numbers = new int[stringNumbers.length];
            for (int k = 0; k < numbers.length; k++) {
                numbers[k] = Integer.parseInt(stringNumbers[k]);
            }
            System.out.println(maxMirror(numbers));

        } catch (NumberFormatException e) {
            System.out.println("Error");
        }

    }
    public static int maxMirror(int[] mainArray){
        int totalCount=0;
        for( int i =0; i< mainArray.length; i++){

            if(i==0){
                continue;
            }
            else{
                for(int j=i;j>0; j-- ){
                    int count=0;

                    if(mainArray[j-1]==mainArray[i]){
                        count++;
                        int k=j;
                        int l=i;
                        while (true){
                            if (k<=1 || l==mainArray.length-1){
                                break;
                            }
                            else if(mainArray[k-2]==mainArray[l+1]){
                                count++;
                                k--;
                                l++;
                            }
                            else{
                                break;
                            }
                        }
                    }
//                    System.out.println(count);
                    if(totalCount<count){
                        totalCount=count;
                    }
                }
            }

        }
        return totalCount;
    }
}
