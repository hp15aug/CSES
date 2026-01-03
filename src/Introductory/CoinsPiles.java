package Introductory;

import java.util.*;
import java.io.*;

public class CoinsPiles {
static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
static StringTokenizer st;
static PrintWriter out = new PrintWriter(System.out);

public static void main(String[] args) throws Exception {
    int t = 1;
     t = nextInt(); // Uncomment for multiple test cases

    while(t-- > 0) {
        solve();
    }

    out.close();
}

static void solve() throws Exception {
    // Your solution here
    int a = nextInt();
    int b = nextInt();

    int ans=f(a, b);
    System.out.println(ans == 0 ? "NO":"YES");
}

private static int f(int a, int b){
        if((a + b) % 3 != 0)
            return 0;

        if(a > 2 * b || b > 2 * a)
            return 0;

        return 1;
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