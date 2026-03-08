package D0205;

import java.io.*;
import java.util.*;

public class B15657 {
    static int N, M;
    static int A[];
    static int S[];
    static boolean V[];

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        A = new int[N];
        S = new int[N];
        V = new boolean[N];

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++){
            A[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(A);
        backtracking(0, 0);

    }


    static void backtracking(int length, int start){
        if(length == M){
            printArray();
            return;
        }
        for(int i = start; i < N; i++) {
            S[length] = A[i];
            backtracking(length + 1, i);
        }
    }

    static void printArray(){
        for(int i = 0; i < M; i++){
            System.out.print(S[i] + " ");
        }
        System.out.println();
    }

}
