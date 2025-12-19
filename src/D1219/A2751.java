package D1219;

import java.io.*;
import java.util.*;

public class A2751 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        int A [] = new int [N];

        for(int i = 0; i < N; i++){
            A[i] = Integer.parseInt(br.readLine());
        }

        int temp = 0;
        for(int i = 0; i < N-1; i++){
            for(int j = 0; j < N - i -1 ; j++){
                if(A[j]>A[j+1]){
                    temp = A[j];
                    A[j] = A[j+1];
                    A[j+1] = temp;
                }
            }
        }

        for(int i = 0; i < N; i++){
            sb.append(A[i] + "\n");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
