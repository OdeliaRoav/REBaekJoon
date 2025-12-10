package D1211;

import java.io.*;
import java.util.*;

public class A2018 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());

        int start = 1;
        int end = 1;
        int count = 1;
        int sum = 1;

        while(end != N){
            if(sum == N){
                count++;
                end++;
                sum = sum + end;
            }
            else if(sum > N){
                sum = sum - start;
                start++;
            }
            else if(sum < N){
                end ++;
                sum = sum + end;
            }
        }
        System.out.println(count);
    }
}
