package D1202;

import java.io.*;
import java.util.*;

public class B4101 {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        while(true) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (a == 0 && b == 0) {
                break;
            }
            else{
                if(a>b) {
                    System.out.println("Yes");
                }
                else{
                    System.out.println("No");
                }
            }

        }

        // TODO: Solve
    }
}
