package D1219;

import java.io.*;
import java.util.*;

public class B2750 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());

        int A[] = new int[N];

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
            System.out.println(A[i]);
        }
    }
}
