import java.util.Random;
import java.util.ArrayList;

public class korwin {
    public static String generateStatement() {
        ArrayList<String> quote = new ArrayList<>();

        for (String[] quotes : data.KORWIN_QUOTES) {
            Random numberGenerator = new Random();
            int randomIndex = numberGenerator.nextInt(quotes.length);
            String randomQuote = quotes[randomIndex];

            quote.add(randomQuote);
        }

        return String.join(" ", quote);
    }
}
