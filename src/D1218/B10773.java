package D1218;

import java.io.*;
import java.util.*;

public class B10773 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int K = Integer.parseInt(st.nextToken());


        int sum = 0;

        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i < K; i++) {
            int now = Integer.parseInt(br.readLine());

            if(now != 0){
                stack.push(now);
            }
            else if(!stack.isEmpty()&&now == 0 ){
                stack.pop();
            }

        }

        int count = stack.size();

        for(int i = 0; i < count; i++){
            sum = sum + stack.pop();
        }


        bw.write(sum + "");
        bw.flush();

    }
}
