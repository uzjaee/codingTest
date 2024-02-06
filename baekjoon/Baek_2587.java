package baekjoon;
import java.io.*;
import java.util.Arrays;

public class Baek_2587{
    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int [] arr = new int[5];
        int sum = 0;
        for(int i = 0; i <5; i++){
            arr[i] = Integer.parseInt(br.readLine());
            sum += arr[i];
        }
        Arrays.sort(arr);
        bw.write(String.valueOf(sum/5)  +"\n");
        bw.write(String.valueOf(arr[2]));
        bw.flush();
        bw.close();
    }
}
