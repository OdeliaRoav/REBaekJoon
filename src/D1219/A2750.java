package D1219;

import java.io.*;
import java.util.*;

public class A2750 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int A[] = new int[N];
        for(int i = 0; i < N; i++){
            A[i] = Integer.parseInt(br.readLine());
        }

        int temp = 0;

        //버블 정렬 하는 방법은 두가지
        /*
        * for(int i = 0; i< N; i++){
        *   for(int j = i+1; j<N; j++){
        *       if(A[i] > A[j]){
        *           temp = A[i];
        *           A[i] = A[j];
        *           A[j] = temp;
        * }}
        * */
        for(int i = 0; i < N-1; i++){
            for(int j = 0; j < N-i-1; j++){
                if(A[j] > A[j+1]){
                    temp = A[j+1];
                    A[j+1] = A[j];
                    A[j] = temp;
                }
            }
        }


        for(int i = 0; i< N; i++){
            System.out.print(A[i] + " ");
        }

    }
}
