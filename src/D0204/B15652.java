package D0204;

import java.io.*;
import java.util.*;

public class B15652 {
    static int N, M;
    static boolean V[];
    static int A[];

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        A = new int[N];

        backtracking(0, 0);
    }
    static void backtracking(int length, int start){
        if(length == M){
            printArray();
            return;
        }
        for(int i = start; i < N; i++){
            A[length] = i;
            backtracking(length+1, i);
        }
    }
    static void printArray(){
        for(int i = 0; i < M; i++){
            System.out.print(A[i] + 1 + " ");
        }
        System.out.println();
    }

}
