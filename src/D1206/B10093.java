package D1206;

import java.io.*;
import java.util.*;

public class B10093 {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        long f_num = sc.nextLong();
        long s_num = sc.nextLong();

        long cal = 0;

        if(f_num > s_num){
            cal = f_num - s_num;
            System.out.println(cal - 1);

            for(long i = s_num +1; i<f_num; i++){
                System.out.print(i + " ");
            }

        }
        else if(s_num > f_num){
            cal = s_num - f_num;
            System.out.println(cal - 1);

            for(long i = f_num + 1; i<s_num; i++){
                System.out.print(i + " ");
            }

        }
        else{
            System.out.println(cal);
        }

    }
}


