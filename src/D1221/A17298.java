package D1221;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class A17298 {
    // 다시 풀어야함
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());

        int A[] = new int[N];
        int ans[] = new int[N];

        Stack<Integer> myStack = new Stack<Integer>();

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        myStack.push(0);
        for(int i = 0; i < N; i++){
            while(!myStack.isEmpty()&&A[myStack.peek()]<A[i]){
                ans[myStack.pop()] = A[i];
            }
            myStack.push(i);

        }

        while(!myStack.isEmpty()){
            ans[myStack.pop()] = -1;
        }

        for(int i = 0; i < N; i++){
            System.out.print(ans[i]+" ");
        }


    }
}
