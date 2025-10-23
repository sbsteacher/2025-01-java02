package ch02.sec10;

import java.util.Scanner;

public class Mission02Result {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("숫자를 입력해 주세요> "); //3335
        String strNum = scanner.next();

        char[] chars = strNum.toCharArray();
        int[] oddEven = new int[2];
        for(char ch : chars) {
            int num = Character.getNumericValue(ch);
            oddEven[num % 2]++;
        }
        System.out.println("홀수: " + oddEven[1]);
        System.out.println("짝수: " + oddEven[0]);
        //입력 한 숫자의 홀수 갯수, 짝수 갯수 출력해 주세요.
        //홀수: 2
        //짝수: 3
    }
}
