package baekjoon;

import java.io.*;


public class Baek_1267 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();
        String [] st = br.readLine().split(" ");
        int y = 0, m = 0;
        for(int i =0; i<st.length; i++){
            y += ((Integer.parseInt(st[i])/30 )+1)*10;
            m += ((Integer.parseInt(st[i])/60) +1)*15;
        }
        if (y>m)
            System.out.println("M " +m);
        else if (y<m)
            System.out.println("Y " +y);
        else
            System.out.println("Y M "+y);
    }
}
