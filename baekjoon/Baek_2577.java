package baekjoon;


import java.io.*;

public class Baek_2577 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int val = Integer.parseInt(br.readLine())*Integer.parseInt(br.readLine())*Integer.parseInt(br.readLine());
        int [] arr = new int[10];
        while(val !=0){
            arr[val%10]++;
            val/=10;
        }
        for(int i :arr)
            System.out.println(i);
    }
}
