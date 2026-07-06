package SortingAndSearching;

import java.io.*;
import java.util.*;

public class SumOfTwoValues{

static FastScanner fs = new FastScanner();
static PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

public static void main(String[] args) throws Exception {
    int t = 1;
    // t = fs.nextInt();

    while (t-- > 0) {
        solve();
    }

    out.flush();
    out.close();
}

static void solve() throws Exception {
    int n=fs.nextInt();
    int x=fs.nextInt();

    int[] arr=new int[n];
    for (int i = 0; i < n; i++) {
        arr[i] = fs.nextInt();
    }

    int[] ans=f(arr, x);

    if (ans[0] == -1 || ans[1] == -1) {
        out.println("IMPOSSIBLE");
        return;
    }

    out.println(ans[0] + " "+ ans[1]);

}
static  int[] f(int[] arr, int target){
    int[] ans={-1, -1};
    Map<Integer, Integer> hm=new HashMap<>();

    for (int i = 0; i < arr.length; i++) {
        int rem=target-arr[i];
        if(hm.containsKey(rem)){
            ans[0]=hm.get(rem)+1;
            ans[1]=i+1;
            return ans;
        }
        hm.put(arr[i], i);
    }
    return ans;
}

static class FastScanner {
    private final InputStream in = System.in;
    private final byte[] buffer = new byte[1 << 16];
    private int ptr = 0, len = 0;

    private int read() throws IOException {
        if (ptr >= len) {
            len = in.read(buffer);
            ptr = 0;
            if (len == -1) return -1;
        }
        return buffer[ptr++];
    }

    int nextInt() throws IOException {
        int c;
        while ((c = read()) <= ' ') {
            if (c == -1) return -1;
        }

        int sign = 1;
        if (c == '-') {
            sign = -1;
            c = read();
        }

        int val = 0;
        while (c > ' ') {
            val = val * 10 + (c - '0');
            c = read();
        }
        return val * sign;
    }

    long nextLong() throws IOException {
        int c;
        while ((c = read()) <= ' ') {
            if (c == -1) return -1;
        }

        int sign = 1;
        if (c == '-') {
            sign = -1;
            c = read();
        }

        long val = 0;
        while (c > ' ') {
            val = val * 10 + (c - '0');
            c = read();
        }
        return val * sign;
    }

    String next() throws IOException {
        int c;
        while ((c = read()) <= ' ') {
            if (c == -1) return null;
        }

        StringBuilder sb = new StringBuilder();
        while (c > ' ') {
            sb.append((char) c);
            c = read();
        }
        return sb.toString();
    }

    double nextDouble() throws IOException {
        return Double.parseDouble(next());
    }

    String nextLine() throws IOException {
        StringBuilder sb = new StringBuilder();
        int c;

        while ((c = read()) != '\n' && c != -1) {
            if (c != '\r') sb.append((char) c);
        }

        return sb.toString();
    }
}
}