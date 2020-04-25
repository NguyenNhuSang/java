import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IterateOverArrayListExample {
    public static void main(String[] args) {
        List<String> tvShows = new ArrayList<>();
        tvShows.add("Breaking Bad");
        tvShows.add("Game of Thrones");
        tvShows.add("Friends");
        tvShows.add("Prison break");

        System.out.println("=== Iterate using Java 8 forEach and lambda ===");
        tvShows.forEach(tvShow -> {
            System.out.println(tvShow);
        });

        System.out.println("\n=== Iterate using an iterator() ===");
        Iterator<String> tvShowsIterator = tvShows.iterator();
        while (tvShowsIterator.hasNext()) {
            String tvShow = tvShowsIterator.next();
            System.out.println(tvShow);
        }

        System.out.println("\n=== Iterating using an iterator() and Java 8 forEachRemaining() method ===");
        tvShowsIterator = tvShows.iterator();
        tvShowsIterator.forEachRemaining(tvShow -> {
            System.out.println(tvShow);
        });

        System.out.println("\n=== Iterate using a listIterator() to traverse in both direction ===");
        ListIterator<String> tvShowListIterator = tvShows.listIterator(tvShows.size());
        while (tvShowListIterator.hasPrevious()) {
            String tvShow = tvShowListIterator.previous();
            System.out.println(tvShow);
        }

        System.out.println("\n=== Iterate using simple for-each loop ===");
        for (String tvShow: tvShows) {
            System.out.println(tvShow);
        }

        System.out.println("\n=== Iterator using for loop with index ===");
        for (int i = 0 ; i < tvShows.size(); i++ ) {
            System.out.println(tvShows.get(i));
        }
    }
}
