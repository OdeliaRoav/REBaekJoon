package D1202;

import java.io.*;
import java.util.*;

public class A5217 {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int R = sc.nextInt();

        for(int i = 0; i < R; i++){
            int num = sc.nextInt();

            System.out.print("Pairs for " + num + ": ");
            int count = 0;

            for(int f_num = 1; f_num < num; f_num++){
                for(int s_num = f_num + 1; s_num < num; s_num++){
                    if(f_num + s_num == num){
                        if(count > 0){
                            System.out.print(", ");
                        }
                        System.out.print(f_num + " " + s_num);
                        count++;
                    }
                }
            }
            System.out.println();
        }
    }
}
