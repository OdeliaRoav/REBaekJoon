package D1208;

import java.io.*;
import java.util.*;

public class B1940 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int A[] = new int[N];
        for(int i = 0; i<N; i++){
            A[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(A);

        int count = 0;

        int i = 0;
        int j = N-1;

        while(i<j){
            int sum = A[i] + A[j];
            if(sum == M){
                count++;
                i++;
                j--;
            }
            else if (sum > M){
                j--;
            }
            else if (sum < M){
                i++;
            }
        }
        System.out.println(count);


    }
}
