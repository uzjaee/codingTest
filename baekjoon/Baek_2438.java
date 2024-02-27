package baekjoon;


import java.io.*;

public class Baek_2438 {
public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        for(int i =1;i<=T; i++){
            int j = i;
            while(j != 0){
                bw.write("*");
                j--;
            }
            bw.write("\n");
        }
        bw.flush();
        bw.close();
    }
}
