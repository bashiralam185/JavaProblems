public class WaveNumbers40 {
    public static void main(String[] args){
        int counter=0;
        while (counter<40){
            System.out.print("-");
            counter++;
        }
        System.out.println("");
        for(int i=0; i<10; i++){
            System.out.print("_");
            System.out.print("-");
            System.out.print("^");
            System.out.print("-");
            System.out.print("_");

        }
        System.out.println("");
        int second=0;
        while(second<2){
            for(int i=1; i<11; i++){
                if(i==10){
                    System.out.print(0);
                    System.out.print(0);
                }
                else{
                    System.out.print(i);
                    System.out.print(i);
                }
            }
            second++;

        }
        System.out.println("");
        int third=0;
        while (third<40){
            System.out.print("-");
            third++;
        }
    }
}
