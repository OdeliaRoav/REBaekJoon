package D1202;

import java.io.*;
import java.util.*;

public class B4892 {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int count = 1;

        while(true){
            int a = sc.nextInt();
            if (a == 0) {
                break;
            }
            else{
                if((a*3)%2 == 0){
                    System.out.print(count + ". even" + " ");
                    a = a*3;
                    a = a/2;
                    a = a*3;
                    a = a/9;
                    System.out.print(a);
                }
                else if ((a*3)%2 != 0){
                    System.out.print(count + ". odd" + " ");
                    a = a*3;
                    a = (a+1)/2;
                    a = a*3;
                    a = a/9;
                    System.out.print(a);
                }
            }
            System.out.println(); //이거 안해서 틀림 ㄷㄷ;;
            count++;
        }
    }
}
