package D1207;

import java.io.*;
import java.util.*;


public class A11720 {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        String s = sc.next();
        int sum = 0;
        char C[] = new char[N];

        for(int i = 0; i< N; i++){
            C[i] = s.charAt(i);
        }

        for(int i = 0; i<N; i++){
            sum = sum + Integer.parseInt(String.valueOf(C[i]));
        }

        System.out.println(sum);
    }
}
