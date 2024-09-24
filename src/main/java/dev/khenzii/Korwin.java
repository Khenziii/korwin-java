package dev.khenzii;

import java.util.Random;
import java.util.ArrayList;

public class Korwin {
    public static String generateStatement() {
        ArrayList<String> quote = new ArrayList<>();
        Random numberGenerator = new Random();
        
        for (String[] quotes : data.KORWIN_QUOTES) {
            int randomIndex = numberGenerator.nextInt(quotes.length);
            String randomQuote = quotes[randomIndex];

            quote.add(randomQuote);
        }

        return String.join(" ", quote);
    }
}
