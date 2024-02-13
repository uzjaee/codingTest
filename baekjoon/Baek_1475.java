package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class Baek_1475 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int [] arr = new int[9];
        String [] st = br.readLine().split("");
        for(int i=0; i<st.length; i++){
            int v = Integer.parseInt(st[i]);
            if (v ==9)
                arr[6]++;
            else
                arr[v]++;
        }
        if (arr[6]%2 == 0)
            arr[6] /=2 ;
        else
            arr[6] = (arr[6]/2 )+ 1;
        Arrays.sort(arr);
        System.out.println(arr[8]);

    }
}
