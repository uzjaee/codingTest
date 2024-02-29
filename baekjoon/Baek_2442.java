package baekjoon;

import java.io.*;

public class Baek_2442 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        for(int i=1;i<=N;i++){
            for(int j=i;j<=N-1;j++) bw.write(" ");
            for(int j=0;j<(2*i)-1; j++) bw.write("*");
            bw.write("\n");
        }
        bw.flush();
        bw.close();
    }
}
