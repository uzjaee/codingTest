package baekjoon;

import java.io.*;

public class Baek_2440 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        for (int i =0; i<T;i++){
            for(int j =T-i; j>0; j--) bw.write("*");
            bw.write("\n");
        }
        bw.flush();
        bw.close();
    }
}
