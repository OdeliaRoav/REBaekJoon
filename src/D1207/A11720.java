package D1207;

import java.io.*;
import java.util.*;


public class A11720 {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        String N = sc.next();

        int sum = 0;

        for(int i = 0; i<num; i++){
            sum = sum + Integer.parseInt(String.valueOf(N.charAt(i)));
        }


        System.out.println(sum);
    }
}
