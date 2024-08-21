package programmers;

import java.io.*;
import java.util.StringTokenizer;

public class pr_0028 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++)
                bw.write("*");
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}
