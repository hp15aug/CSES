import java.util.*;
class Test{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
//        s="LLRR";
        int a=f(s);
        System.out.println(a);
    }
    private static int f(String s){
        int n=s.length();
        int[] pre=new int[n+1];
        for (int i = 0; i < n; i++) {
            pre[i+1]=pre[i]+(s.charAt(i) == 'L' ? 1:-1);
        }
        int count =0;
        for (int i = 1; i < n + 1; i++) {
            if(pre[i] == 0)
                count++;
        }

        int maybe=0;
        for (int i = 0; i < n - 1; i++) {
            char a=s.charAt(i);
            char b=s.charAt(i+1);
            if(a == 'L' && b=='R' && pre[i+1]==2){
                maybe=1;break;
            }
            if(a == 'R' && b=='L' && pre[i+1]==-2){
                maybe=1;break;
            }
        }
        return maybe+ count;
    }
}