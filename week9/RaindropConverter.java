import java.util.ArrayList;
import java.util.List;

public class RaindropConverter {
    public String converter(int num) {
        String rDrops = "";

        if (num % 3 == 0) {
            rDrops += "Pling";
        }

        if (num % 5 == 0) {
            rDrops += "Plang";
        }

        if (num % 7 == 0) {
            rDrops += "Plong";
        }

        if (rDrops.length() == 0){
            rDrops += Integer.toString(num);
        }
        return rDrops;
    }
}