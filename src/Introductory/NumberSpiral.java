//package Introductory;

import java.util.*;
import java.io.*;

public class NumberSpiral {
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

    long y = nextLong();
    long x=nextLong();

    long z=Math.max(x, y);

    if(z%2 == 0){
        long res;
        if(y == z){
            res = ( z * z) - x + 1;
        }else{
            res = (z - 1) * (z - 1) + y;
        }
        out.println(res);
    }else{
        long res;
        if(y == z){
            res = (long) (z - 1) * (z - 1) + x;
        }else{
            res = ((long) z * z) - y + 1;
        }
        out.println(res);
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