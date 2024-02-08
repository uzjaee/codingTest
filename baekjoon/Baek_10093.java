package baekjoon;
import java.io.*;
import java.util.StringTokenizer;
public class Baek_10093{
    public static void main(String [] args) throws IOException{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            if (a > b) {
                int c = a;
                a = b;
                b = c;
            }
            if ( b - a == 1 || b == a)
            bw.write(String.valueOf(0)+ "\n");
        else
            bw.write(String.valueOf(b - a - 1)+ "\n");
        for(int i = a+1; i<b; i++)
            bw.write(String.valueOf(i) + " ");
        bw.flush();
        bw.close();
    }
}
