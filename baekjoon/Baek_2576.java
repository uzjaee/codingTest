package baekjoon;

import java.io.*;

public class Baek_2576 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int sum = 0;
        int min = 999999;
        for (int i = 0; i<7; i++){
            int val = Integer.parseInt(br.readLine());
            if (val %2 != 0 ){
                sum+= val;
                if (min >val)
                    min = val;
            }
        }
        if (sum == 0 ) {
            bw.write(String.valueOf(-1));
            bw.flush();
            bw.close();
        }
        else {
            bw.write(String.valueOf(sum) +  "\n");
            bw.write(String.valueOf(min));
            bw.flush();
            bw.close();
        }
    }
}
