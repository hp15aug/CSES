package Introductory;

import java.util.*;
import java.io.*;

public class TwoSets {
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
    boolean[] vis=new boolean[n+1];

    long sum= (long) n *(n+1)/2;
    if(sum%2 == 1){
        out.println("NO");
        return;
    }

    out.println("YES");
    long tar=sum/2;

    ArrayList<Integer> set1 = new ArrayList<>();
    ArrayList<Integer> set2 = new ArrayList<>();

    for (int i = n; i >= 1; i--) {
        if(tar >= i){
            set1.add(i);
            tar-=i;
        }else{
            set2.add(i);
        }
    }

    out.println(set1.size());
    for (Integer integer : set1) {
        out.print(integer + " ");
    }
    out.println();

    out.println(set2.size());
    for (Integer integer : set2) {
        out.print(integer + " ");
    }
    out.println();
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