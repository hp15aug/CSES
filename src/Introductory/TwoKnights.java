package Introductory;

import java.util.*;
import java.io.*;

public class TwoKnights {
static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
static StringTokenizer st;
static PrintWriter out = new PrintWriter(System.out);

public static void main(String[] args) throws Exception {
    int t = 1;
     t = nextInt(); // Uncomment for multiple test cases

    for (int i = 1; i <= t; i++) {
        solve(i);
    }

    out.close();
}

static void solve(int n) throws Exception {
    long tot= ((long) n *n) * (((long) n *n)-1)/2;
    long rem= 4L *(n-1)*(n-2);
    out.println(tot-rem);
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