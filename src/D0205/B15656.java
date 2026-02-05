package D0205;

import java.io.*;
import java.util.*;

public class B15656 {
    static int N, M;
    static int A[];
    static int S[];
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        A = new int[N];
        S = new int[N];

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++){
            A[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(A);
        backtracking(0);
        System.out.print(sb);
    }

    static void backtracking(int length){
        if(length == M){
            printArray();
            return;
        }
        for(int i = 0; i < N; i++){
            S[length] = A[i];
            backtracking(length + 1);
        }
    }
    static void printArray(){
        for(int i = 0; i < M; i++){
            sb.append(S[i] + " ");
        }
        sb.append("\n");
    }
}
