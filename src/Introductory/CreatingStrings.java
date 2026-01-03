package Introductory;

import java.util.*;
import java.io.*;

public class CreatingStrings {
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

    Set<String> ans=new HashSet<>();
    f("", str, ans);

    List<String> res=new ArrayList<>(ans);
    Collections.sort(res);

    out.println(res.size());
    for (String s:res){
        out.println(s);
    }
}

    private static void f(String curr, String str, Set<String> set) {
        if (str.isEmpty()) {
            set.add(curr);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            String nextCurr = curr + str.charAt(i);
            String nextStr = str.substring(0, i) + str.substring(i + 1);
            f(nextCurr, nextStr, set);
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