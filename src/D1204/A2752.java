package D1204;


import java.io.*;

public class A2752 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int temp = 0;

        int R = Integer.parseInt(br.readLine());

        int A[] = new int[R];

        for(int i = 0; i<R; i++){
            A[i] = Integer.parseInt(br.readLine());
        }

        for(int i = 0; i<R; i++){
            for(int j = i+1; j<R; j++){
                if(A[i] >A[j]){
                    temp = A[i];
                    A[i] = A[j];
                    A[j] = temp;
                }
            }
        }

        for(int i = 0; i<R; i++){
            bw.write(A[i] + " ");
        }

        bw.flush();



    }
}
