
import java.util.ArrayList;
import java.util.List;

public class PangramChecker {

    public boolean isPangram (String sent){
        String[] alphs = "a b c d e f g h i j k l m n o p q r s t u v w x y z".split(" ");
        String sentenceChanged = sent.toLowerCase().replaceAll("\\s+","");

        for (String letter : alphs) {
            if (!sentenceChanged.contains(letter)){
                return false;
            }
        }
        return true;
    }
}