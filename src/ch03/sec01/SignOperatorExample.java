package ch03.sec01;

public class SignOperatorExample {
    public static void main(String[] args) {
        int x = -100;
        int x2 = 100 * -1;
        x2 = x2 * -1;
        System.out.println("x: " + x);
        x = -x;
        System.out.println("x: " + x);

        byte b = 100;
        int y = -b;
        System.out.println("y: " + y);
    }
}
