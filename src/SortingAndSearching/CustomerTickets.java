package SortingAndSearching;

import java.io.*;
import java.util.*;

public class CustomerTickets {

    static class FastScanner {
        private final InputStream in = System.in;
        private final byte[] buffer = new byte[1 << 16];
        private int ptr = 0, len = 0;

        private int read() throws IOException {
            if (ptr >= len) {
                len = in.read(buffer);
                ptr = 0;
                if (len == -1) return -1;
            }
            return buffer[ptr++];
        }

        int nextInt() throws IOException {
            int c;
            while ((c = read()) <= ' ') {
                if (c == -1) return -1;
            }

            int sign = 1;
            if (c == '-') {
                sign = -1;
                c = read();
            }

            int val = 0;
            while (c > ' ') {
                val = val * 10 + (c - '0');
                c = read();
            }
            return val * sign;
        }
    }

    public static void main(String[] args) throws Exception {
        FastScanner fs = new FastScanner();

        int n = fs.nextInt();
        int m = fs.nextInt();

        TreeMap<Integer, Integer> map = new TreeMap<>();

        for (int i = 0; i < n; i++) {
            int x = fs.nextInt();
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < m; i++) {
            int budget = fs.nextInt();

            Map.Entry<Integer, Integer> entry = map.floorEntry(budget);

            if (entry == null) {
                sb.append("-1\n");
            } else {
                int price = entry.getKey();
                sb.append(price).append('\n');

                if (entry.getValue() == 1)
                    map.remove(price);
                else
                    map.put(price, entry.getValue() - 1);
            }
        }

        System.out.print(sb);
    }
}