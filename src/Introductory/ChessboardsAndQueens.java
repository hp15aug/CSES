package Introductory;

import java.util.*;
import java.io.*;

public class ChessboardsAndQueens {
static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
static StringTokenizer st;
static PrintWriter out = new PrintWriter(System.out);

    static char[][] board = new char[8][8];
    static boolean[] cols = new boolean[8];
    static boolean[] diag1 = new boolean[15];
    static boolean[] diag2 = new boolean[15];
    static int ans = 0;

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
    for (int i = 0; i < 8; i++) {
        String line = next();
        board[i] = line.toCharArray();
    }

    f(0);
    out.println(ans);
}

static void f(int y){
    if (y == 8) {
        ans++;
        return;
    }

    for (int x = 0; x < 8; x++) {
        if (board[y][x] == '*') continue;

        if (cols[x] || diag1[x + y] || diag2[x - y + 7]) continue;

        cols[x] = true;
        diag1[x + y] = true;
        diag2[x - y + 7] = true;

        f(y + 1);

        cols[x] = false;
        diag1[x + y] = false;
        diag2[x - y + 7] = false;

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