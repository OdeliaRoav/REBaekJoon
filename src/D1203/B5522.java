package D1203;

import java.io.*;
import java.util.*;

public class B5522 {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int sum = 0;

        for(int i = 0; i<5; i++){
            int num = sc.nextInt();
            sum += num;
        }
        System.out.print(sum);
    }
}
