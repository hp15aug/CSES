package Introductory;

import java.util.*;
import java.io.*;

public class Permutations {
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

    if(n==1){
        out.print(n+ " ");
        return;
    }

    if(n==2 || n== 3){
        out.print("NO SOLUTION");
        return;
    }

    for (int i = 2; i <= n; i+=2) {
        out.print(i+ " ");
    }
    for (int i = 1; i <= n; i+=2) {
        out.print(i+ " ");
    }
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