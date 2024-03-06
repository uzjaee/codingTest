package baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class Baek_11328 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for(int i=0;i<N;i++){
            st = new StringTokenizer(br.readLine());
            bw.write(strfry(st.nextToken(),st.nextToken()));
            bw.write("\n");
        }
        bw.flush();
        bw.close();

    }
    static String strfry(String s1, String s2){
        if(s1.length() !=s2.length())
            return "Impossible";
        int [] arr = new int[26];
        String [] sa1 = s1.split("");
        String [] sa2 = s2.split("");
        for(String c : sa1){
            int j = c.charAt(0)-97;
            arr[j] +=1;
        }
        for(String c :sa2){
            int j = c.charAt(0)-97;
            if(arr[j] ==0)
                return "Impossible";
            else
                arr[j]--;
        }
        return "Possible";
    }
}
