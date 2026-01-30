package D0131;

import java.io.*;
import java.util.*;

public class A13023 {
    static ArrayList<Integer>[] A;
    static boolean visited[];
    static boolean arrive;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        A = new ArrayList[N];
        visited = new boolean[N];
        arrive = false;
        for(int i = 0; i < N; i++) {
            A[i] = new ArrayList<>();
        }

        for(int i = 0; i < M; i++){
            st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            A[a].add(b);
            A[b].add(a);

        }
        for(int i = 0; i < N; i++) {
            DFS(i, 1);
            if(arrive){
                break;
            }
        }


        if(arrive){
            System.out.println(1);
        }
        else{
            System.out.println(0);
        }


    }

    static void DFS(int num, int depth){
        if(depth == 5 || arrive){
            arrive = true;
            return;
        }
        visited[num] = true;
        for(int i : A[num]){
            if(visited[i]==false){
                DFS(i,depth+1);
            }
        }
        visited[num] = false;
    }
}
