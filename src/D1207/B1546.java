package D1207;

import java.io.*;
import java.util.*;

public class B1546 {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int A[] = new int[N];

        for(int i = 0; i < N; i++){
            A[i] = sc.nextInt();
        }

        Arrays.sort(A);

        double Max = A[N-1];
        double sum = 0;

        for(int i =0; i<N; i++){
            sum += A[i]/Max * 100.0;
        }

        System.out.println(sum/N);

    }
}
