package D1215;

import java.io.*;
import java.util.*;

public class B1874 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();

        int cur = 1; // 다음에 push할 숫자

        for (int i = 0; i < n; i++) {
            int target = Integer.parseInt(br.readLine());

            // target까지 push
            while (cur <= target) {
                stack.push(cur++);
                sb.append("+\n");
            }

            // 이제 top이 target이어야 pop 가능
            if (!stack.isEmpty() && stack.peek() == target) {
                stack.pop();
                sb.append("-\n");
            } else {
                System.out.println("NO");
                return;
            }
        }

        System.out.print(sb.toString());
    }
}
