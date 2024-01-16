package baekjoon;

import java.io.*;
import java.util.StringTokenizer;


public class Baek_2490{
    public static void main(String [] args) throws IOException {
        String[] res = {"D","C","B","A","E"};
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        for (int j = 0; j<3; j++){
            int result = 0;
            st = new StringTokenizer(bf.readLine());
            for (int i=0; i<4; i++){
                 result += Integer.parseInt(st.nextToken());
            }
            bw.write(res[result] + "\n");
            bw.flush();
        }
        bw.close();
    }
}