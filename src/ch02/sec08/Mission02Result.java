package ch02.sec08;

public class Mission02Result {
    public static void main(String[] args) {
        double pi = 3.141592;

        double shortPi = (int)(pi * 1000 + 0.5) * 0.001;

        System.out.println("shortPi: " + shortPi); //3.142 or 3.141
    }
}
