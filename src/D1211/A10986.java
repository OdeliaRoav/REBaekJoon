package D1211;

import java.io.*;
import java.util.*;

public class A10986 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        long A[] = new long[N];
        long C[] = new long[M];

        st = new StringTokenizer(br.readLine());
        A[0] = Integer.parseInt(st.nextToken());
        for(int i = 1; i<N; i++){
            A[i] = A[i-1] + Integer.parseInt(st.nextToken());
        }

        long count = 0;

        for(int i = 0; i<N; i++){
            int remainder = (int)(A[i] % M);

            if(remainder == 0){
                count++;
            }
            C[remainder]++;
        }

        for(int i = 0; i<M; i++){
            if(C[i]>1){
                count = count + (C[i]*(C[i]-1)/2);
            }

        }
        System.out.println(count);

    }

}
