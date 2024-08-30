package set.exe01;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Program {

    public static void main(String[] args) {

        // hashSet();
        // treeSet();
        // linkedHashSet();
        testes();
    }

    public static void hashSet() {

        Set<String> set = new HashSet<>();

        set.add("TV");
        set.add("Tablet");
        set.add("Notebook");
        set.add("Tablet"); // does not accept repetition

        System.out.println(set.contains("Notebook")); // true

        // HashSet doesn't guarantee the order you placed
        for (String p : set) {
            System.out.println(p);
        }
    }

    public static void treeSet() {

        Set<String> set = new TreeSet<>();

        set.add("TV");
        set.add("Tablet");
        set.add("Notebook");
        set.add("Tablet"); // does not accept repetition

        System.out.println(set.contains("Notebook")); // true

        // TreeSet sorts the data (compareTo)
        for (String p : set) {
            System.out.println(p);
        }
    }

    public static void linkedHashSet() {

        Set<String> set = new LinkedHashSet<>();

        set.add("TV");
        set.add("Tablet");
        set.add("Notebook");
        set.add("Tablet"); // does not accept repetition

        System.out.println(set.contains("Notebook")); // true

        // LinkedHashSet guarantee the order you placed
        for (String p : set) {
            System.out.println(p);
        }
    }

    // some methods tests
    public static void testes() {

        Set<String> set = new LinkedHashSet<>();

        set.add("TV");
        set.add("Tablet");
        set.add("Tablet");
        set.add("frango");
        set.add("abobora");
        set.add("cafe");
        set.add("Notebook");

        set.remove("Tablet");
        set.removeIf(x -> x.length() > 7);

        for (String p : set) {
            System.out.println(p);
        }

        Set<Integer> a = new TreeSet<>(Arrays.asList(0, 2, 4, 5, 6, 8, 10));
        Set<Integer> b = new TreeSet<>(Arrays.asList(5, 6, 7, 8, 9, 10));

        // union
        Set<Integer> c = new TreeSet<>(a);
        c.addAll(b);
        System.out.println(c);

        // difference
        Set<Integer> d = new TreeSet<>(a);
        d.removeAll(b);
        System.out.println(d);

        // intersection
        Set<Integer> e = new TreeSet<>(a);
        e.retainAll(b);
        System.out.println(e);
    }
}
