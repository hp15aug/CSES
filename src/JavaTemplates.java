// ============================================================================
// ESSENTIAL JAVA TEMPLATES FOR COMPETITIVE PROGRAMMING
// ============================================================================

// 1. MAIN TEMPLATE WITH FAST I/O
// ============================================================================
/*
import java.util.*;
import java.io.*;

public class  {
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
 */

// ============================================================================
// 2. ALTERNATIVE SIMPLE TEMPLATE (for beginners)
// ============================================================================
/*
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // int t = sc.nextInt(); // Multiple test cases
        // while(t-- > 0) {
            solve(sc);
        // }

        sc.close();
    }

    static void solve(Scanner sc) {
        int n = sc.nextInt();
    }
}
*/

// ============================================================================
// 3. ARRAY OPERATIONS TEMPLATE
// ============================================================================
/*
// Reading arrays
static int[] readIntArray(int n) throws Exception {
    int[] arr = new int[n];
    for(int i = 0; i < n; i++) {
        arr[i] = nextInt();
    }
    return arr;
}

static long[] readLongArray(int n) throws Exception {
    long[] arr = new long[n];
    for(int i = 0; i < n; i++) {
        arr[i] = nextLong();
    }
    return arr;
}

// Printing arrays
static void printArray(int[] arr) {
    for(int i = 0; i < arr.length; i++) {
        out.print(arr[i]);
        if(i < arr.length - 1) out.print(" ");
    }
    out.println();
}

static void printArray(long[] arr) {
    for(int i = 0; i < arr.length; i++) {
        out.print(arr[i]);
        if(i < arr.length - 1) out.print(" ");
    }
    out.println();
}

// Array utility functions
static int[] sortArray(int[] arr) {
    Arrays.sort(arr);
    return arr;
}

static long[] sortArray(long[] arr) {
    Arrays.sort(arr);
    return arr;
}
*/

// ============================================================================
// 4. MATHEMATICAL OPERATIONS TEMPLATE
// ============================================================================
/*
// GCD and LCM
static long gcd(long a, long b) {
    return b == 0 ? a : gcd(b, a % b);
}

static long lcm(long a, long b) {
    return (a / gcd(a, b)) * b;
}

// Power function
static long power(long base, long exp, long mod) {
    long result = 1;
    while(exp > 0) {
        if(exp % 2 == 1) {
            result = (result * base) % mod;
        }
        base = (base * base) % mod;
        exp /= 2;
    }
    return result;
}

// Check if number is prime
static boolean isPrime(int n) {
    if(n <= 1) return false;
    if(n <= 3) return true;
    if(n % 2 == 0 || n % 3 == 0) return false;

    for(int i = 5; i * i <= n; i += 6) {
        if(n % i == 0 || n % (i + 2) == 0) {
            return false;
        }
    }
    return true;
}

// Sieve of Eratosthenes
static boolean[] sieve(int n) {
    boolean[] isPrime = new boolean[n + 1];
    Arrays.fill(isPrime, true);
    isPrime[0] = isPrime[1] = false;

    for(int i = 2; i * i <= n; i++) {
        if(isPrime[i]) {
            for(int j = i * i; j <= n; j += i) {
                isPrime[j] = false;
            }
        }
    }
    return isPrime;
}

// Factorial with mod
static long factorial(int n, long mod) {
    long result = 1;
    for(int i = 2; i <= n; i++) {
        result = (result * i) % mod;
    }
    return result;
}
*/

// ============================================================================
// 5. STRING OPERATIONS TEMPLATE
// ============================================================================
/*
// Check if string is palindrome
static boolean isPalindrome(String s) {
    int left = 0, right = s.length() - 1;
    while(left < right) {
        if(s.charAt(left) != s.charAt(right)) {
            return false;
        }
        left++;
        right--;
    }
    return true;
}

// Count character frequency
static int[] countFreq(String s) {
    int[] freq = new int[26]; // for lowercase letters
    for(char c : s.toCharArray()) {
        freq[c - 'a']++;
    }
    return freq;
}

// Reverse string
static String reverse(String s) {
    return new StringBuilder(s).reverse().toString();
}
*/

// ============================================================================
// 6. SORTING AND SEARCHING TEMPLATE
// ============================================================================
/*
// Binary Search
static int binarySearch(int[] arr, int target) {
    int left = 0, right = arr.length - 1;

    while(left <= right) {
        int mid = left + (right - left) / 2;

        if(arr[mid] == target) {
            return mid;
        } else if(arr[mid] < target) {
            left = mid + 1;
        } else {
            right = mid - 1;
        }
    }
    return -1; // Not found
}

// Lower bound (first element >= target)
static int lowerBound(int[] arr, int target) {
    int left = 0, right = arr.length;

    while(left < right) {
        int mid = left + (right - left) / 2;

        if(arr[mid] < target) {
            left = mid + 1;
        } else {
            right = mid;
        }
    }
    return left;
}

// Upper bound (first element > target)
static int upperBound(int[] arr, int target) {
    int left = 0, right = arr.length;

    while(left < right) {
        int mid = left + (right - left) / 2;

        if(arr[mid] <= target) {
            left = mid + 1;
        } else {
            right = mid;
        }
    }
    return left;
}

// Custom comparator for sorting
static void sortBySecondElement(int[][] arr) {
    Arrays.sort(arr, (a, b) -> Integer.compare(a[1], b[1]));
}
*/

// ============================================================================
// 7. GRAPH ALGORITHMS TEMPLATE
// ============================================================================
/*
// Graph representation
static List<List<Integer>> adj;
static boolean[] visited;

// Initialize graph
static void initGraph(int n) {
    adj = new ArrayList<>();
    for(int i = 0; i <= n; i++) {
        adj.add(new ArrayList<>());
    }
    visited = new boolean[n + 1];
}

// Add edge (undirected)
static void addEdge(int u, int v) {
    adj.get(u).add(v);
    adj.get(v).add(u);
}

// DFS
static void dfs(int node) {
    visited[node] = true;

    for(int neighbor : adj.get(node)) {
        if(!visited[neighbor]) {
            dfs(neighbor);
        }
    }
}

// BFS
static void bfs(int start) {
    Queue<Integer> queue = new LinkedList<>();
    queue.add(start);
    visited[start] = true;

    while(!queue.isEmpty()) {
        int node = queue.poll();

        for(int neighbor : adj.get(node)) {
            if(!visited[neighbor]) {
                visited[neighbor] = true;
                queue.add(neighbor);
            }
        }
    }
}

// BFS for shortest path
static int[] bfsDistance(int start, int n) {
    int[] dist = new int[n + 1];
    Arrays.fill(dist, -1);

    Queue<Integer> queue = new LinkedList<>();
    queue.add(start);
    dist[start] = 0;

    while(!queue.isEmpty()) {
        int node = queue.poll();

        for(int neighbor : adj.get(node)) {
            if(dist[neighbor] == -1) {
                dist[neighbor] = dist[node] + 1;
                queue.add(neighbor);
            }
        }
    }
    return dist;
}
*/

// ============================================================================
// 8. DYNAMIC PROGRAMMING TEMPLATE
// ============================================================================
/*
// 1D DP example - Fibonacci
static long fibonacci(int n) {
    if(n <= 1) return n;

    long[] dp = new long[n + 1];
    dp[0] = 0;
    dp[1] = 1;

    for(int i = 2; i <= n; i++) {
        dp[i] = dp[i-1] + dp[i-2];
    }

    return dp[n];
}

// 2D DP example - Grid paths
static int uniquePaths(int m, int n) {
    int[][] dp = new int[m][n];

    // Initialize first row and column
    for(int i = 0; i < m; i++) dp[i][0] = 1;
    for(int j = 0; j < n; j++) dp[0][j] = 1;

    for(int i = 1; i < m; i++) {
        for(int j = 1; j < n; j++) {
            dp[i][j] = dp[i-1][j] + dp[i][j-1];
        }
    }

    return dp[m-1][n-1];
}

// LCS (Longest Common Subsequence)
static int lcs(String text1, String text2) {
    int m = text1.length(), n = text2.length();
    int[][] dp = new int[m + 1][n + 1];

    for(int i = 1; i <= m; i++) {
        for(int j = 1; j <= n; j++) {
            if(text1.charAt(i-1) == text2.charAt(j-1)) {
                dp[i][j] = dp[i-1][j-1] + 1;
            } else {
                dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
            }
        }
    }

    return dp[m][n];
}
*/

// ============================================================================
// 9. DATA STRUCTURES TEMPLATE
// ============================================================================
/*
// Segment Tree (Range Sum Query)
class SegmentTree {
    int[] tree;
    int n;

    SegmentTree(int[] arr) {
        n = arr.length;
        tree = new int[4 * n];
        build(arr, 0, 0, n - 1);
    }

    void build(int[] arr, int node, int start, int end) {
        if(start == end) {
            tree[node] = arr[start];
        } else {
            int mid = (start + end) / 2;
            build(arr, 2 * node + 1, start, mid);
            build(arr, 2 * node + 2, mid + 1, end);
            tree[node] = tree[2 * node + 1] + tree[2 * node + 2];
        }
    }

    int query(int node, int start, int end, int l, int r) {
        if(r < start || end < l) return 0;
        if(l <= start && end <= r) return tree[node];

        int mid = (start + end) / 2;
        int left = query(2 * node + 1, start, mid, l, r);
        int right = query(2 * node + 2, mid + 1, end, l, r);
        return left + right;
    }

    int query(int l, int r) {
        return query(0, 0, n - 1, l, r);
    }
}

// Disjoint Set Union (Union-Find)
class DSU {
    int[] parent, rank;

    DSU(int n) {
        parent = new int[n];
        rank = new int[n];
        for(int i = 0; i < n; i++) {
            parent[i] = i;
            rank[i] = 0;
        }
    }

    int find(int x) {
        if(parent[x] != x) {
            parent[x] = find(parent[x]);
        }
        return parent[x];
    }

    void union(int x, int y) {
        int px = find(x), py = find(y);
        if(px == py) return;

        if(rank[px] < rank[py]) {
            parent[px] = py;
        } else if(rank[px] > rank[py]) {
            parent[py] = px;
        } else {
            parent[py] = px;
            rank[px]++;
        }
    }

    boolean connected(int x, int y) {
        return find(x) == find(y);
    }
}
*/

// ============================================================================
// 10. UTILITY FUNCTIONS TEMPLATE
// ============================================================================
/*
// Min and Max for multiple values
static int min(int... vals) {
    int min = vals[0];
    for(int val : vals) {
        min = Math.min(min, val);
    }
    return min;
}

static int max(int... vals) {
    int max = vals[0];
    for(int val : vals) {
        max = Math.max(max, val);
    }
    return max;
}

// Sum of array
static long sum(int[] arr) {
    long sum = 0;
    for(int x : arr) sum += x;
    return sum;
}

// Debug printing
static void debug(Object... args) {
    System.err.println(Arrays.deepToString(args));
}

// Direction arrays (for grid problems)
static int[] dx = {-1, 1, 0, 0};
static int[] dy = {0, 0, -1, 1};

// Check if coordinates are valid
static boolean isValid(int x, int y, int n, int m) {
    return x >= 0 && x < n && y >= 0 && y < m;
}
*/

// ============================================================================
// HOW TO USE THESE TEMPLATES:
//
// 1. Copy the main template (Section 1) as your base
// 2. Add specific functions from other sections as needed
// 3. For graphs: Use Section 7
// 4. For math problems: Use Section 4
// 5. For DP problems: Use Section 8
// 6. For string problems: Use Section 5
//
// REMEMBER:
// - Always test templates with sample inputs
// - Uncomment sections you need, comment out unused code
// - Modify templates based on specific problem requirements
// ============================================================================