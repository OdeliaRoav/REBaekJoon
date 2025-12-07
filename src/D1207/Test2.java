package D1207;

import java.io.*;
import java.util.*;

public class Test2 {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        String s = sc.next();

        char c[] = new char[N];

        for(int i = 0; i < N; i++){
            c[i] = s.charAt(i);
        }
        int sum = 0;
        /*for(int i = 0; i < N; i++){
            sum = sum + Integer.parseInt(String.valueOf(c[i]));
        }
*/

        for(int i = 0; i < N; i++){
            sum = sum + (c[i] - '0');

        }

        System.out.println(sum);


    }
}
