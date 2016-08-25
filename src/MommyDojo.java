import java.util.Arrays;
import java.util.List;

public class MommyDojo {

    private static final String MOMMY = "mommy";
    private String source;
    private List<String> vowels = Arrays.asList("a", "e", "i", "o", "u");

    public MommyDojo(String source) {
        this.source = source.toLowerCase();
    }

    public String translate() {
        String result = "";
        boolean isLastVowels = false;
        if (!lessThanThirtyPercent()) {
            for (int loop = 0; loop < source.length(); loop++) {
                if (vowels.contains((String.valueOf(source.charAt(loop))))) {
                    if (!isLastVowels) {
                        result += MOMMY;
                        isLastVowels = true;
                    }
                } else {
                    result += source.charAt(loop);
                    isLastVowels = false;
                }
            }
            return result;
        }
        return source;
    }

    private boolean lessThanThirtyPercent() {
        if (source.isEmpty()) {
            return true;
        }
        int numberOfVowels = 0;
        for (int loop = 0; loop < source.length(); loop++) {
            if (vowels.contains(String.valueOf(source.charAt(loop)))) {
                numberOfVowels++;
            }
        }
        double percent = (numberOfVowels * 100 / source.length());
        return (percent < 30) ? true : false;
    }
}
