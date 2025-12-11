package D1212;

import java.io.*;
import java.util.*;

public class A12891 {
    static int myArr[];
    static int checkArr[];
    static int checkSecret;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int S = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());

        int result = 0;
        checkSecret = 0;
        myArr = new int[4];
        checkArr = new int[4];
        char A[] = new char[S];
        A = br.readLine().toCharArray();

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i<4; i++){
            checkArr[i] = Integer.parseInt(st.nextToken());
            if (checkArr[i] == 0) {
                checkSecret++;
            }
        }

        for(int i = 0; i<P; i++){
            Add(A[i]);
        }
        if(checkSecret == 4){
            result++;
        }

        for(int i = P; i<S; i++){
            int j = i-P;
            Add(A[i]);
            remove(A[j]);
            if(checkSecret == 4){
                result++;
            }

        }
        System.out.println(result);

    }
    private static void Add(char C){
        switch(C){
            case 'A':
                myArr[0]++;
                if(myArr[0] == checkArr[0]){
                    checkSecret++;
                }
                break;
            case 'C':
                myArr[1]++;
                if(myArr[1] == checkArr[1]){
                    checkSecret++;
                }
                break;
            case 'G':
                myArr[2]++;
                if(myArr[2] == checkArr[2]){
                    checkSecret++;
                }
                break;
            case 'T':
                myArr[3]++;
                if(myArr[3] == checkArr[3]){
                    checkSecret++;
                }
                break;
        }
    }

    private static void remove(char C){
        switch(C){
            case 'A':
                if(myArr[0] == checkArr[0]){
                    checkSecret--;
                }
                myArr[0]--;
                break;
            case 'C':
                if(myArr[1] == checkArr[1]){
                    checkSecret--;
                }
                myArr[1]--;
                break;
            case 'G':
                if(myArr[2] == checkArr[2]){
                    checkSecret--;
                }
                myArr[2]--;
                break;
            case 'T':
                if(myArr[3] == checkArr[3]){
                    checkSecret--;
                }
                myArr[3]--;
                break;
        }
    }
}
