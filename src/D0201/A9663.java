package D0201;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A9663 {
    static int N;
    static int A[];
    static int cnt;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        A = new int[N];
        cnt = 0;

        backtracking(0);
        System.out.println(cnt);

    }

    static void backtracking(int length) {
        if(length == N){
            cnt++;
            return;
        }
        for(int i = 0; i<N;i++) {
            A[length] = i;
            if(check(length)){
                backtracking(length+1);
            }
        }
    }
    static boolean check(int length) {
        for(int i = 0; i<length;i++) {
            if(A[i]==A[length]) return false;
            if(Math.abs(length-i)==Math.abs(A[i]-A[length])) return false;
        }
        return true;
    }
}
