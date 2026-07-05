import java.util.*;
import java.io.*;

public class Test {
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
    // Your solution here
    int n = nextInt();
    int[] arr=new int[n];

    for (int i = 0; i < n; i++) {
        arr[i]=nextInt();
    }

    int fINd=high(arr);
    int highElement=arr[fINd]; //8
//    System.out.println(highElement);



}

static int high(int[] arr){
    int idx=0;

    for (int i = 1; i < arr.length; i++) {
        if(arr[i-1] > arr[i]){
            idx=i-1;
        }
    }
    return idx;
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