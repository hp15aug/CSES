//package SortingAndSearching;

import java.util.*;
import java.io.*;

public class Apartments {
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
    int m= nextInt();
    int k= nextInt();

    int[] applicants =new int[n];
    for (int i = 0; i < n; i++) {
        applicants[i]=nextInt();
    }
    Arrays.sort(applicants);
    // 45 60 60 80

    int[] apartment =new int[m];
    for (int i = 0; i < m; i++) {
        apartment[i]=nextInt();
    }
    Arrays.sort(apartment);
    // 30 60 75

    int i,j;
    i=j=0;

    int count=0;

    while(i<n && j<m){
        int max=applicants[i]+k;
        int min=applicants[i]-k;

        if (Math.abs(applicants[i] - apartment[j]) <= k){
            count++;
            i++;
            j++;
        }
        else if(min > apartment[j]){
            j++;
        }
        else{
            i++;
        }
    }
        out.println(count);
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