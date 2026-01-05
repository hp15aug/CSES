package Introductory;

import java.util.*;
import java.io.*;

public class AppleDivision  {
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
    long[] arr=new long[n];
    long sum=0;
    for (int i = 0; i < n; i++) {
        arr[i]= nextLong();
        sum+=arr[i];
    }
    out.println(f(0, 0, arr, sum));
}

static long f(int ind, long currSum, long[] arr, long tot){
    if(ind == arr.length){
        return Math.abs(tot - 2*currSum);
    }

    long include=f(ind+1, currSum+arr[ind], arr, tot);

    long exclude=f(ind+1, currSum, arr, tot);

    return Math.min(include, exclude);
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