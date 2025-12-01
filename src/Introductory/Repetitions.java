package Introductory;

import java.util.*;
import java.io.*;

public class Repetitions {
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
    String str=next();

    int c=1;
    int max=1;

    if(str.isEmpty()){
        out.print(0);
        return;
    }

    for (int i = 1; i < str.length(); i++) {
        if(str.charAt(i) == str.charAt(i-1)) {
            c++;
        }
        else{
            c=1;
        }
        max=Math.max(max, c);
    }
    System.out.println(max);
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