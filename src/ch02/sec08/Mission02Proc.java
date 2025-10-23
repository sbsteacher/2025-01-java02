package ch02.sec08;

public class Mission02Proc {
    public static void main(String[] args) {
        double pi = 3.141592;

        int num = (int)(pi * 1000 + 0.5);

        double shortPi = num * 0.001;

        System.out.println("shortPi: " + shortPi); //3.142 or 3.141
    }
}
