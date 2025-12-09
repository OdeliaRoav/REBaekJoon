package D1210;

import java.io.*;
import java.util.*;

import static javax.swing.text.html.HTML.Attribute.N;

public class B2798 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int A[] = new int[N];

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i<N; i++){
            A[i] = Integer.parseInt(st.nextToken());
        }


        System.out.println(find(A, N, M));

    }
    static int find(int[] A, int N , int M){
        int max = 0;

        for(int i = 0; i<N-2; i++){
            for(int j = i+1; j<N-1; j++){
                for(int k = j+1; k<N; k++){
                    int result = A[i] + A[j] + A[k];

                    if(result == M){
                        return result;
                    }
                    if(max<result && result<M){
                        max = result;
                    }

                }
            }
        }
        return max;
    }

}
