package D0317;

import java.io.*;
import java.util.*;

public class B1764 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        String[] c = new String[a];
        HashSet<String> set = new HashSet<>();

        for (int i = 0; i < a; i++) {
            c[i] = br.readLine();
            set.add(c[i]);
        }

        int count = 0;
        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < b; i++) {
            String name = br.readLine();
            if (set.contains(name)) {
                count++;
                list.add(name);
            }
        }

        Collections.sort(list);

        sb.append(count).append("\n");
        for (int i = 0; i < list.size(); i++) {
            sb.append(list.get(i)).append("\n");
        }

        System.out.print(sb);
    }
}