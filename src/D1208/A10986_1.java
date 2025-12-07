package D1208;

import java.util.*;

public class A10986_1 {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int M = 3; // M인 3으로 나누면 나머지 값은 3을 넘을 수 없다. 즉 0, 1, 2로 확정됨
        long A[] = {3, 1, 4, 1, 5};
        long C[] = new long[3]; // M의 설명과 마찬가지로 나머지 값은 3의 저장 공간 할당

        for(int i = 1; i<5; i++){
            A[i] = A[i] + A[i-1];
        }

        long answer = 0;

        for(int i = 0; i<5; i++){
            int remainder = (int)(A[i] % M);

            if(remainder == 0){
                answer++;
            }
            C[remainder]++;
        }

        for(int i = 0; i<3; i++){
            answer = answer + (C[i]*(C[i]-1)/2);
        }
        System.out.println(answer);

    }
}
