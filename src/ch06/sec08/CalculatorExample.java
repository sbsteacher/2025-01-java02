package ch06.sec08;

public class CalculatorExample {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        int result = cal.plus(1, 2);
        System.out.println("result: " + result);
        System.out.println("result2: " + cal.plus(10, 20));
        System.out.println("result2: " + 30);

        for(int i=0; i<2000; i++) {
            cal.powerOn();
        }

        cal.powerOff();


        System.out.println("끝");
    }
}
