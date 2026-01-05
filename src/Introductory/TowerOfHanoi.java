package Introductory;

import java.util.*;
import java.io.*;

public class TowerOfHanoi {
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

    out.println((int) Math.pow(2,n)-1);

    StringBuilder res=new StringBuilder();
    f(n, 1, 3, 2, res);

    out.println(res);
}

static void f(int n, int a, int c, int b, StringBuilder res){
    if(n==1){
        res.append(a).append(" ").append(c).append("\n");
        return;
    }

    f(n-1, a, b, c, res);
    res.append(a).append(" ").append(c).append("\n");
    f(n-1, b, c, a, res);
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