import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class PrimaryCode {
    public static void main(String[] args){
        int [] arr = {6,94,1,2};
        System.out.println(func2(arr,3));




    }

    // 시간복잡도 관련 1
    public static int func1(int n){
        int result = 0;
        for (int i =1; i <=n; i++){
            if (i % 3 == 0 || i % 5 ==0){
                result +=i;
            }
        }
        return result;
    }

    // 시간 복잡도 관련 2
    public static int func2(int[] arr, int N){
        // 1부터 99까지의 배열을 생성
        int [] check = new int[100];
        // 숫자를 확인하고 대열에 저장
        for (int i =0; i<N;i++){
            if(check[100-arr[i]] == 1)
            {
                return 1;
            }
            else
            {
                check[arr[i]]=1;
            }
        }
        return 0;

    }

    // 시간 복잡도 관련 3
    public static int func3(int N){
        int result = 0;
        for (int i =1; i<=N; i++){
            if (i*i ==N)
            {
                return 1;
            }
        }
        return result;
    }
    // 시간 복잡도 관련 4

    public static int func4(int N){
        int val = 1;
        while(2*val <=N){
            val *=2;
        }
        return val;
    }
    // integer overflow
    public static void func5(){
        for (char s =0; s<65535; s++){
            System.out.println("hi");
        }
    }
    public static void func6(int a ){
        a = 5;
    }
    public static void func7(int[] a){
        System.out.println(System.identityHashCode(a));
        System.out.println(a);
        a[0] = 10;
    }
    public static class pt{
        public int x;
        public static int y = 2;
        pt(int x){
            this.x = x;
        }
    }
    public static void func8(pt a){
        a.x = 10;
    }


}
