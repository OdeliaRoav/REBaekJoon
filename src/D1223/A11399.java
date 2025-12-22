package D1223;

import java.io.*;
import java.util.*;

public class A11399 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());

        int A[] = new int[N];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++){
            A[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(A);

        int S[] = new int[N];
        S[0] = A[0];

        for(int i = 1; i < N; i++){
            S[i] = S[i-1] + A[i];
        }
        int sum = 0;
        for(int i = 0; i < N; i++){
            sum = sum + S[i];
        }
        System.out.println(sum);

    }
}
