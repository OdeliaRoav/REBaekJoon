package D1210;

import java.io.*;
import java.util.*;

public class A2018 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        // 이 문제 처음 접근할 때 범위 값으로 들어가는게 아니라, 상승 값으로 목표 지점까지 sum한다는 거 잊지 말기

        int start = 1;
        int end = 1;
        int sum = 1;
        int count = 1;

        while(end != N){
            if(sum == N ){
                count ++;
                end++;
                sum = sum + end;
            }
            else if(sum > N){
                sum = sum - start;
                start++;
            }
            else if(sum < N){

                end++;
                sum = sum + end;
            }
        }
        System.out.println(count);

    }
}
