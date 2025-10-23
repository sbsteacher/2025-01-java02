package ch02.sec10;

import java.util.Scanner;

public class Mission02JuHyun {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("숫자를 입력해 주세요> "); //3335
        String strNum = scanner.next();

        int[] intArray = new int[2];
        int digit = Integer.parseInt(strNum);
        do {
            int value = digit % 10;
            intArray[value % 2]++;
        } while ((digit /= 10) > 0);

        System.out.printf("홀수 : %d\n짝수 : %d", intArray[1], intArray[0]);
    }
}
