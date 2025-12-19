package D1220;

import java.io.*;
import java.util.*;

public class A1874 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());

        Stack<Integer> stack = new Stack<>();

        int count = 1;
        boolean flag = true;
        for(int i = 0; i < N; i++){
            int now = Integer.parseInt(br.readLine());
            while(count <= now){
                stack.push(count++);
                sb.append("+\n");
            }

            if(!stack.isEmpty()&&stack.peek() == now){
                stack.pop();
                sb.append("-\n");
            }
            else{
                flag = false;
            }

        }

        if(flag){
            bw.write(sb.toString());
        }
        else{
            System.out.println("NO");
        }
        bw.flush();
        bw.close();
    }
}
