
public class ArmstrongNumbers {
    private String[] num;
    public boolean isArmstrongNumber(int number){
        this.num = Integer.toString(number).split("");
        int sum = 0;
        int pow = num.length;
        for (int i = 0; i < num.length; i++) {
            sum+=Math.pow(Integer.parseInt(num[i]),pow);
        }
        return sum==number;
    }
}