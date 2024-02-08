package baekjoon;
import java.util.Arrays;
import java.io.*;
public class Baek_2309{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int [] arr = new int[9];
        int [] index ;
        int sum = 0;
        int sub , first ,second;
        first = 0;
        second = 0;
        for(int i =0; i<arr.length;i++){
            arr[i] = Integer.parseInt(br.readLine());
            sum += arr[i];
        }
        Arrays.sort(arr);
        sub = sum - 100;
        index = new int[sub];
        for( int i = 0; i <arr.length; i++){
            if(arr[i] >= sub)
                continue;
            if(index[sub - arr[i]] == 1){
                first = sub- arr[i];
                second = arr[i];
            }
            else
                index[arr[i]] = 1;
        }
        for(int i = 0; i <arr.length; i++){
            if(arr[i] != first && arr[i] != second ) {
                bw.write(String.valueOf(arr[i]) + "\n");
            }
        }
        bw.flush();
        bw.close();
    }
}