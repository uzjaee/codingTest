package programmers;

import java.util.Scanner;

public class pr_0013 {
    public int solution(int num) {
        int count = 0;
        if (num == 1)
            return 0;
        while (num != 1) {
            if (num % 2 == 0) {
                num = num / 2;
            } else  if (num % 2 == 1){
                num = (num * 3) + 1;
            }
            count++;
            if (count == 500 & num != 1) {
                return -1;
            }
        }
        return count;
    }
}

