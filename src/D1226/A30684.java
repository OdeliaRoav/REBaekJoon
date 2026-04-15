package D1226;

import java.io.*;
import java.util.*;

public class A30684 {

    public static void main(String[] args) throws Exception {
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         StringTokenizer st = new StringTokenizer(br.readLine());

         int N = Integer.parseInt(st.nextToken());

         String name = "ZZZ";

         for(int i = 0; i < N; i++){
             String member = br.readLine();

             if(member.length() != 3){
                 continue;
             }
             if(member.compareTo(name) < 0){
                 name = member;
             }
         }
         
         System.out.println(name);
    }
}
