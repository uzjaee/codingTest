package programmers;

import java.util.Arrays;

public class pr_0019 {
    public int[] solution(int[] arr) {
        if(arr.length<=1) return new int[]{-1};
        int [] arr2 = Arrays.copyOf(arr,arr.length);
        Arrays.sort(arr2);
        return Arrays.stream(arr).filter(num -> num !=arr2[0]).toArray();
    }
}
