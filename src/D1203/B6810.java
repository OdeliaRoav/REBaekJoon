package D1203;

import java.io.*;
import java.util.*;

public class B6810 {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);


        int f_num = sc.nextInt();
        int s_num = sc.nextInt();
        int t_num = sc.nextInt();

        int num [] = new int[13];
        num[0] = 9;
        num[1] = 7;
        num[2] = 8;
        num[3] = 0;
        num[4] = 9;
        num[5] = 2;
        num[6] = 1;
        num[7] = 4;
        num[8] = 1;
        num[9] = 8;
        num[10] = f_num;
        num[11] = s_num;
        num[12] = t_num;


        int sum = 0;

        for(int i = 0; i<=12; i++){
            if((i+1)%2!=0){
                sum = sum + num[i]*1;
            }
            else{
                sum = sum + num[i]*3;
            }
        }

        System.out.print("The 1-3-sum is " + sum);

        //9780921418948
    }
}
