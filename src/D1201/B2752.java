package D1201;

import java.io.*;
import java.util.*;

public class B2752 {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int A[] = new int[3];

        for(int i = 0; i<3; i++){
            A[i] = sc.nextInt();
        }

        for(int i = 0; i<3; i++){
            for(int j = i; j<3; j++){
                if(A[i]>A[j]){
                    int temp = A[i];
                    A[i] = A[j];
                    A[j] = temp;
                }
            }
        }

        for(int i = 0; i<3; i++){
            System.out.print(A[i] + " ");
        }





        // TODO: Solve
    }
}
