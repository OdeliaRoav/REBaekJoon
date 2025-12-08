package D1209;

import java.io.*;
import java.util.*;

public class A1940 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(st.nextToken());

        int A[] = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(A);

        int i = 0;
        int j = N-1;
        int count = 0;

        while (i<j){
            if(A[i]+A[j] == M){
                count++;
                i++;
                j--;
            }
            else if(A[i]+A[j] > M){
                j--;
            }
            else if(A[i]+A[j] < M){
                i++;
            }
        }


        System.out.println(count);

    }
}
