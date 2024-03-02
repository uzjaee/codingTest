package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek3273 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int [] arr = new int[1000001];
        br.readLine();
        String [] st = br.readLine().split(" ");
        int X = Integer.parseInt(br.readLine());
        int count = 0;
        for(int i=0;i<st.length;i++){
            if(Integer.parseInt(st[i])>=X)
                continue;
            if (arr[X-Integer.parseInt(st[i])]==1)
                count++;
            else
                arr[Integer.parseInt(st[i])] =1;
        }
        System.out.println(count);

    }
}
