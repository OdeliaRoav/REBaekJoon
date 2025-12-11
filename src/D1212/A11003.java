package D1212;

import java.io.*;
import java.util.*;

public class A11003 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());

        Deque<Node> myDeque = new LinkedList<>();

        st = new StringTokenizer(br.readLine());
        //줄 단위로 읽어야 해서 for문 밖으로 뺌
        for(int i = 0; i < N; i++){
            int now = Integer.parseInt(st.nextToken());
            while (!myDeque.isEmpty() && myDeque.getLast().value>now){
                myDeque.removeLast();
            }
            myDeque.addLast(new Node(now, i));
            if(myDeque.getFirst().index<=i-L){
                myDeque.removeFirst();
            }
            bw.write(myDeque.getFirst().value + " ");
        }
        bw.flush();
        bw.close();

    }

    static class Node{
        int value;
        int index;

        Node(int value, int index){
            this.value = value;
            this.index = index;
        }
    }
}
