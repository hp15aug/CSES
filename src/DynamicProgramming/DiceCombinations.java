package DynamicProgramming;

import java.util.*;
import java.io.*;

public class DiceCombinations {
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
    long mod=1000000007;

    long[] dp=new long[n+1];

    dp[0]=1;
    for (int i = 1; i <= n; i++) {
        for (int die = 1; die <= 6; die++) {
            if(i - die>= 0)
                dp[i]=(dp[i]+dp[i-die])%mod;
        }
    }
    out.println(dp[n]);
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