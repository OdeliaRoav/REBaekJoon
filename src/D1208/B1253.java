package D1208;

import java.io.*;
import java.util.*;

public class B1253 {

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

        int count = 0;

        for(int q = 0; q < N; q++){
            int find = A[q];
            int i = 0;
            int j = N-1;

            while(i<j){
                if(A[i]+A[j] == find){
                    if(i!=q && j!=q){
                        count ++;
                        break;
                    }
                    else if(i == q){ //이 조합이 안되기 때문에 다음 i로 좋은 수를 배합, 배열 안에 중복되는 수가 있을 수 있기 때문
                        i++;
                    }
                    else if (j == q){ //이 조합이 안되기 때문에 다음 i로 좋은 수를 배합, 배열 안에 중복되는 수가 있을 수 있기 때문
                        j--;
                    }
                }
                else if(A[i]+A[j] < find){
                    i++;
                }
                else if(A[i]+A[j] > find){
                    j--;
                }
            }

        }
        System.out.println(count);

    }
}
