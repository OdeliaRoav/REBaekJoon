package D1216;

import java.io.*;
import java.util.*;

public class A10986 {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        long A[] = new long[N];
        long C[] = new long[M];

        A[0] = sc.nextInt();
        for(int i = 1; i < N; i++){
            A[i] = A[i-1] + sc.nextInt();
        }

        long count = 0;

        for(int i = 0; i < N; i++){
            int contrainter = (int)(A[i]%M);

            if(contrainter == 0){
                count++;
            }
            C[contrainter]++;
        }

        for(int i = 0; i < M; i++){
            if(C[i]>1){
                count = count + (C[i]*(C[i]-1)/2);
            }
        }

        System.out.println(count);
    }
}
