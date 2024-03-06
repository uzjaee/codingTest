package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Baek_10807 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();
        String [] st = br.readLine().split(" ");
        int v = Integer.parseInt(br.readLine());
        int count = 0;
        for(int i =0; i<st.length;i++){
            if(v == Integer.parseInt(st[i]))
                count++;
        }
        System.out.println(count);

    }
}
