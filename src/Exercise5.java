import java.util.List;
import java.util.ArrayList;
import java.util.function.Function;

public class Exercise5<T> {
    private List<T> items;

    public Exercise5() {
        items = new ArrayList<>();
    }

    public void addItem(T item) {
        items.add(item);
    }

    public void removeItem(T item) {
        items.remove(item);
    }

    public List<T> getItems() {
        return items;
    }

    public List<T> searchItems(String keyword, Function<T, String> fieldExtractor) {
        List<T> results = new ArrayList<>();
        for (T item : items) {
            if (fieldExtractor.apply(item).contains(keyword)) {
                results.add(item);
            }
        }
        return results;
    }
}
