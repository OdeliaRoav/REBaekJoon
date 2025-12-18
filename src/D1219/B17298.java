package D1219;

import java.io.*;
import java.util.*;

public class B17298 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());

        int A[] = new int[N];
        int ans[] = new int[N];

        Stack<Integer> stack = new Stack<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++){
            A[i] = Integer.parseInt(st.nextToken());
        }
        stack.push(0);
        for(int i = 0; i < N; i++){
            while(!stack.isEmpty()&&A[stack.peek()]<A[i]){
                ans[stack.pop()] = A[i];
            }
            stack.push(i);
        }

        while(!stack.isEmpty()){
            ans[stack.pop()] = -1;
        }

        for(int i = 0; i < N; i++){
            bw.write(ans[i]+" ");
        }
        bw.flush();
        bw.close();
    }
}
