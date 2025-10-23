package ch04.sec02;

public class MyMath {
    public static double pow(double val, int n) {
        if(n == 0) { return 1; }

        double result = val;
        for (int i = 1; i < n; i++) {
            result *= val;
        }
        return result;
    }
}
