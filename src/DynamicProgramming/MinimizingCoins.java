package DynamicProgramming;

import java.util.*;
import java.io.*;

public class MinimizingCoins {
static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
static StringTokenizer st;
static PrintWriter out = new PrintWriter(System.out);
    static final int INF = (int)1e9;

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
    int target=nextInt();

    int[] arr=new int[n];
    for (int i = 0; i < n; i++) {
        arr[i]=nextInt();
    }

    int ans= minimize(arr, target);
    System.out.println(ans == INF ? -1 : ans);
}

     static int minimize(int[] coins, int target) {
        int max = target + 1;
        int[] dp = new int[target + 1];
        Arrays.fill(dp, max);

        // Base case: 0 coins are needed to make the sum 0
        dp[0] = 0;

        // Iterate through every sum from 1 to target
        for (int i = 1; i <= target; i++) {
            // Try every coin available
            for (int coin : coins) {
                if (i - coin >= 0) {
                    // Update dp[i] if using this coin results in a smaller count
                    dp[i] = Math.min(dp[i], dp[i - coin] + 1);
                }
            }
        }

        // If dp[target] is still 'max', it means the sum is unreachable
        return dp[target] > target ? -1 : dp[target];
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