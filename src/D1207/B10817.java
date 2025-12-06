package D1207;

import java.io.*;
import java.util.*;

public class B10817 {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int A[] = new int[3];

        for(int i = 0; i<3; i++){
            A[i] = sc.nextInt();
        }

        int temp = 0;

        for(int i = 0; i<3; i++){
            for(int j = i+1; j<3; j++){
                if(A[i]>A[j]){
                    temp = A[j];
                    A[j] = A[i];
                    A[i] = temp;
                }
            }
        }

        System.out.print(A[1]);




    }
}
