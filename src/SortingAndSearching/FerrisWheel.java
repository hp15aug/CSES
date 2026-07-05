package SortingAndSearching;

import java.util.*;
import java.io.*;

public class FerrisWheel {
static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
static StringTokenizer st;
static PrintWriter out = new PrintWriter(System.out);

public static void main(String[] args) throws Exception {
    int t = 1;
    // t = nextInt(); // Uncomment for multiple test cases

    while(t-- > 0) {
        solve();
    }
    out.flush();
    out.close();
}

static void solve() throws Exception {
    // Your solution here
    int n = nextInt();
    int x=nextInt();

    int[] arr=new int[n];
    for (int i = 0; i < n; i++) {
        arr[i]=nextInt();
    }
    Arrays.sort(arr);

    // 2 3 9 10
    int i=0;
    int j=n-1;
    int c=0;

    while (i <= j) {
        if (arr[i] + arr[j] <= x) {
            i++;
            j--;
        }else{
            j--;
        }
        c++;
    }
    out.println(c);
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