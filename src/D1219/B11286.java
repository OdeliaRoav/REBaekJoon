package D1219;

import java.io.*;
import java.util.*;

public class B11286 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> MyQueue = new PriorityQueue<>((o1, o2)->{
            int first = Math.abs(o1);
            int second = Math.abs(o2);

            if(first == second){
                return o1 > o2 ? 1 : -1;
            }
            else {
                return first - second;
            }
        });

        for(int i = 0; i < N; i++){
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

    }
}
// 이거는 우선순위 큐 구현 방식을 제대로 이해해야 할 듯
