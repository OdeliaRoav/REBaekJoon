package D1219;

import java.io.*;
import java.util.*;

public class B1427 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        int A[] = new int [s.length()];

        for(int i = 0; i < s.length(); i++){
            A[i] = Integer.parseInt(s.charAt(i) + "");
        }

        for(int i = 0; i<s.length(); i++){
            int max = i;
            for(int j = i+1; j<s.length(); j++){
                if(A[j]>A[max]){
                    max = j;
                }
                if(A[i]<A[max]){
                    int temp = A[i];
                    A[i] = A[max];
                    A[max] = temp;
                }
            }
        }
        for(int i = 0; i<s.length(); i++){
            System.out.print(A[i]);
        }

    }
}
