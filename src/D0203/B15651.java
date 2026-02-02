package D0203;

import java.io.*;
import java.util.*;

public class B15651 {
    static int N, M;
    static int A[];
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        A = new int[N];

        backtracking(0);
        System.out.print(sb);

    }

    static void backtracking(int length) {
        if(length == M){
            for(int i = 0; i < M; i++){
                sb.append(A[i] + 1 + " ");
            }
            sb.append("\n");
            return;
        }

        for(int i = 0; i < N; i++){
            A[length] = i;
            backtracking(length + 1);
        }
    }


}
