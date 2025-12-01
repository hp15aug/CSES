package SlidingWindow;

import java.util.*;
import java.io.*;

public class SlidingWindowMin {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) throws Exception {
        int t = 1;
        // t = nextInt(); // Uncomment for multiple test cases

        while(t-- > 0) {
            solve();
        }

        out.close();
    }

    static void solve() throws Exception {
        // Your solution here
        int n = nextInt();
        int k= nextInt();

        long x = nextLong();
        long a = nextLong();
        long b = nextLong();
        long c = nextLong();

        int[] arr=generate(n, x, a, b, c);

        int[] queue=new int[n];
        int head=0;
        int tail=0;
        long xor=0;

        for (int i = 0; i < n; i++) {
            while(head < tail && arr[queue[tail-1]] >= arr[i])
                tail--;

            queue[tail++]=i;

            if(queue[head] <= i-k)
                head++;

            if(i>= k-1)
                xor^=arr[queue[head]];
        }

        out.println(xor);
    }

    private static int[] generate(int n, long x, long a, long b, long c) {
        int[] arr = new int[n];
        arr[0] = (int) x;

        for (int i = 1; i < n; i++) {
            arr[i] = (int) ((a * arr[i - 1] + b) % c);
        }
        return arr;
    }

    // Fast I/O methods
    static String next() throws Exception {
        while(st == null || !st.hasMoreElements()) {
            st = new StringTokenizer(br.readLine());
        }
        return st.nextToken();
    }

    static int nextInt() throws Exception {
        return Integer.parseInt(next());
    }

    static long nextLong() throws Exception {
        return Long.parseLong(next());
    }

    static double nextDouble() throws Exception {
        return Double.parseDouble(next());
    }

    static String nextLine() throws Exception {
        return br.readLine();
    }
}