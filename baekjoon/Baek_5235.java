package baekjoon;

import java.io.*;

public class Baek_5235 {
    public static void main(String[] args) throws IOException {
        // evensum
        // oddsum
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int repeat = Integer.parseInt(br.readLine());
        String [] st ;
        int evensum,oddsum;
        for(int i=0;i<repeat;i++){
            evensum =0;
            oddsum = 0;
            st = br.readLine().split(" ");
            for(int j=1;j<=Integer.parseInt(st[0]);j++){
                int val = Integer.parseInt(st[j]);
                if(val%2 ==0)
                    evensum+=val;
                else
                    oddsum+=val;
            }
            if(evensum > oddsum)
                bw.write("EVEN\n");
            else if(evensum < oddsum)
                bw.write("ODD\n");
            else
                bw.write("TIE\n");
        }
        bw.flush();
        bw.close();

    }
}
