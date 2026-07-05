package Introductory;

import java.util.*;

class Pair {
    final String date; // format: ddMMyyyy
    final String name;

    Pair(String date, String name) {
        this.date = date;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pair)) return false;
        Pair p = (Pair) o;
        return Objects.equals(date, p.date) &&
                Objects.equals(name, p.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(date, name);
    }
}

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Map<Pair, Integer> hm = new HashMap<>();

        // Input + aggregation
        for (int i = 0; i < n; i++) {
            String date = sc.next();   // format: ddMMyyyy
            String name = sc.next();
            int tot = sc.nextInt();

            Pair key = new Pair(date, name);
            hm.put(key, hm.getOrDefault(key, 0) + tot);
        }

        // Convert to list for sorting
        List<Map.Entry<Pair, Integer>> list = new ArrayList<>(hm.entrySet());

        // Sort: date DESC, name ASC
        list.sort((e1, e2) -> {
            Pair p1 = e1.getKey();
            Pair p2 = e2.getKey();

            int cmp = p2.date.compareTo(p1.date); // DESC date
            if (cmp == 0) {
                return p1.name.compareTo(p2.name); // ASC name
            }
            return cmp;
        });

        // Output
        for (Map.Entry<Pair, Integer> entry : list) {
            Pair p = entry.getKey();
            System.out.println(p.date + " " + p.name + " " + entry.getValue());
        }

        sc.close();
    }
}