package ch02.sec10;

import java.util.Scanner;

public class Mission02Result2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("숫자를 입력해 주세요> "); //3335
        String strNum = scanner.next();
        int[] oddEven = new int[2];

        int value = Integer.parseInt(strNum);
        do {
          int digit = value % 10;
          oddEven[digit % 2]++;
        } while((value /= 10) > 0);

        System.out.println("홀수: " + oddEven[1]);
        System.out.println("짝수: " + oddEven[0]);
    }
}
