package D1219;

import java.io.*;
import java.util.*;

public class A2164 {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        Queue<Integer> myQueue = new LinkedList<>();

        for(int i = 1; i<= N; i++){
            myQueue.add(i);
        }

        while(myQueue.size()>1){
            myQueue.poll();
            myQueue.add(myQueue.poll());
        }
        System.out.println(myQueue.poll());


    }
}
