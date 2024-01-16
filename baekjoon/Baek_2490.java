package baekjoon;

import java.util.Scanner;
public class Baek_2490{
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        String[] res = {"D","C","B","A","E"};
        for (int j = 0; j<3; j++){
            int result = 0;
            for (int i=0; i<4; i++){
                 result += in.nextInt();
            }
            System.out.println(res[result]);
        }


    }
}