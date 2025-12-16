package D1216;

import java.io.*;
import java.util.*;

public class B1874 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(st.nextToken());

        Stack<Integer> stack = new Stack<>();

        int next = 1;
        boolean flag = true;

        for(int i = 0; i < N; i++){
            int now = Integer.parseInt(br.readLine());

            while(next <= now){
                stack.push(next++);
                sb.append("+\n");
            }

            if(!stack.isEmpty()&&stack.peek() == now){
                stack.pop();
                sb.append("-\n");
            }
            else{
                flag = false;
                break;
            }


        }

        if(flag){
            bw.write(sb.toString());
        }
        else{
            bw.write("NO");
        }
        bw.flush();


    }
}
