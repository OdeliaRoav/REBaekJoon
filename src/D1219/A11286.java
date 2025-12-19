package D1219;

import java.io.*;
import java.util.*;

public class A11286 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> MyQueue = new PriorityQueue<>((o1, o2) ->{
            int first = o1;
            int second = o2;

            if(first == second){
                return o1 > o2 ? 1 : -1;
            }else{
                return first - second;
            }
        });

       /*for(int i = 0; i < N; i++){
            int request = Integer.parseInt(br.readLine());
            if(request == 0 ){
                if(MyQueue.isEmpty()){
                    System.out.println(0);
                }
                else {
                    System.out.println(MyQueue.poll());
                }
            }else{
                MyQueue.add(request);
            }
        }
        */

        for(int i = 0; i<N; i++){
            int request = Integer.parseInt(br.readLine());
            if(request == 0 ){
                if(MyQueue.isEmpty()){
                    System.out.println(0);
                }
                else{
                    System.out.println(MyQueue.poll());
                }
            }else{
                MyQueue.add(request);
            }
        }


    }
}
