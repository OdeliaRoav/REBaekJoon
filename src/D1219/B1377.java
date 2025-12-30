package D1219;

import java.io.*;
import java.util.*;

public class B1377 {
    //버블 소트는 pass당 작은 애는 왼쪽으로 한 칸, 큰 애는 오른쪽으로 제한 없음
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        mData[] A = new mData[N];
        for(int i = 0; i<N; i++){
            A[i] = new mData(Integer.parseInt(br.readLine()),i);
        }
        Arrays.sort(A);
        int max = 0;
        for(int i = 0; i<N; i++){
            if(max<A[i].index-i){
                max = A[i].index-i;
            }
        }
        System.out.println(max+1);
        //버블 소트에서는 정렬이 끝나도 확인 pass가 존재한다.
    }

    

    static class mData implements Comparable<mData> {
        int value;
        int index;

        public mData(int value, int index) {
            super();
            this.value = value;
            this.index = index;
        }
        @Override
        public int compareTo(mData o) {
            return this.value - o.value;
        }
    }
}
