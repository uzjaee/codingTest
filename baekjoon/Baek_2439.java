package baekjoon;


import java.io.*;

public class Baek_2439 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        for (int i = 1; i <= T; i++) {
            // 여백 찍기
            for(int j =0;j<T-i;j++) bw.write(" ");
            // 별 찍기
            for(int k =0;k<i;k++) bw.write("*");
            bw.write("\n");
        }
        bw.flush();
        bw.close();

    }
}
