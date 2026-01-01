package Introductory;

import java.util.*;
import java.io.*;

public class PalindromeReorder {
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
    String s=next();

    int[] freq=new int[26];

    for (int i = 0; i < s.length(); i++) {
        freq[s.charAt(i) - 'A']++;
    }

    int countOdd=0; char odd='a';
    for (int i = 0; i < 26; i++) {
        if(freq[i]%2 == 1){
            countOdd++;
            odd= (char) (i+65);
//            System.out.println(odd);
        }
    }

    if(countOdd > 1){
        System.out.println("NO SOLUTION");
        return;
    }

    StringBuilder sb=new StringBuilder();
    for (int i = 0; i < 26; i++) {
        char ch=(char)(i+'A');
        if(freq[i]>0){
            sb.append(String.valueOf(ch).repeat(freq[i] / 2));
        }
    }
//    sb.append(odd);
    StringBuilder ans=new StringBuilder(sb);
    if(countOdd == 1){
        ans.append(odd);
    }

    for(int i=sb.length()-1; i>= 0; i--){
        ans.append(sb.charAt(i));
    }

    System.out.println(ans.toString());
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