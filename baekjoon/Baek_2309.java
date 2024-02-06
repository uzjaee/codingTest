package baekjoon;
import java.util.Arrays;
import java.io.*;
public class Baek_2309{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int [] arr = new int[9];
        for(int i =0; i<arr.length;i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);
        for(int i =0; i<7;i++){
            bw.write(String.valueOf(arr[i])+ "\n");
        }
        bw.flush();
        bw.close();
    }
}