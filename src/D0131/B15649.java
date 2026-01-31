package D0131;

import java.io.*;
import java.util.*;

public class B15649 {
    static int N,M;
    static boolean v[];
    static int s[];

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        v = new boolean[N];
        s = new int[M];

        backtracking(0);



    }
    static void backtracking(int length){
        if(length == M){
            printArray();
            return;
        }
        for(int i = 0; i < N; i++){
            if(v[i] == false){
                v[i] = true;
                s[length] = i;
                backtracking(length + 1);
                v[i] = false;
            }
        }

    }

    static void printArray(){
        for(int i = 0; i < M; i++){
            System.out.print(s[i]+1 + " ");
        }
        System.out.println();
    }

}
