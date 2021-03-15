public class NumbersOutput60 {
    public static void main(String[] args){
        int counter=1;
        while (counter<61){
            if (counter%10==0){
                System.out.print("|");
            }
            else{
                System.out.print(" ");
            }
            counter++;
        }
        System.out.println(" ");
        int count=1;
        int mainconter=1;
        while(count<61){
            if (count%10==0){
                System.out.print(0);
                mainconter=1;
            }
            else{
                System.out.print(mainconter);
                mainconter++;

            }
            count++;
        }
    }
}
