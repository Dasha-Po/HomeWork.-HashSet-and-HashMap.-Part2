import java.util.ArrayList;
import java.util.List;

public class WordsChecker {
    protected String text;

    //  конструктор
    public WordsChecker(String text) {
        this.text = text;
    }

    // метод поиска слова
    public boolean hasWorld(String word) {
        List<String> worlds = new ArrayList<>();
        worlds = List.of(text.split("\\P{IsAlphabetic}+"));
        if (worlds.contains(word)) {
            return true;
        }
        return false;
    }
}
