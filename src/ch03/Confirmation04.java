package ch03;

public class Confirmation04 {
    public static void main(String[] args) {
        int value = 556;

        //1. 3.56
        //2. 3.56 > 3
        //3. 3 * 100
        System.out.println((int)(value * 0.01) * 100);

        //1. 3 (나누기)
        //2. 3 * 100
        System.out.println(value / 100 * 100);

        //1. 56구한다
        //2. 356 - 56 뺀다.
        System.out.println(value - value % 100);

        System.out.println(); //300
    }
}
