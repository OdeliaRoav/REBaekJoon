package D1219;

import java.io.*;
import java.util.*;

public class B2751 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        int A[] = new int[N];

        for(int i = 0; i < N; i++){
            A[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(A);

        for(int i = 0; i < N; i++){
            sb.append(A[i] + "\n");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();

    }
}
