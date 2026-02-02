package D0203;

import java.io.*;
import java.util.*;

public class A15649 {
    static int N, M;
    static int A[];
    static boolean V[];

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        A = new int[N];
        V = new boolean[N];
        backtracking(0);




    }
    static void backtracking(int length){
        if(length == M){
            printArray();
            return;
        }
        for(int i = 0; i < N; i++){
            if(V[i] == false){
                V[i] = true;
                A[length] = i;
                backtracking(length + 1);
                V[i] = false;
            }
        }

    }
    static void printArray(){
        for(int i = 0; i < M; i++){
            System.out.print(A[i] + 1 + " ");
        }
        System.out.println();
    }

}
