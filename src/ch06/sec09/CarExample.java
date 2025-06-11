package ch06.sec09;

public class CarExample {
    public static void main(String[] args) {
        //포르쉐, 벤츠 차 2대 객체 생성해주세요.
        Car porsche = new Car("포르쉐");
        Car benz = new Car("벤츠");

        porsche.run();
        benz.run();
    }
}
