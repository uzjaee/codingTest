package baekjoon;


import java.io.*;

public class Baek_2577 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int val = Integer.parseInt(br.readLine())*Integer.parseInt(br.readLine())*Integer.parseInt(br.readLine());
        String   r = String.valueOf(val);
        int [] arr = new int[10];
        for(int i = 0; i <r.length(); i++)
            arr[r.charAt(i) - '0']++;
        // 혹은   arr[Charater.getNumericValue(r.charAt(i))]++;   char형을 INT 형으로 변환
        for(int i : arr) {
            bw.write(String.valueOf(i));
            bw.newLine();
        }
        bw.flush();
        bw.close();

    }
}
