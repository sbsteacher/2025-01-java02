package ch06.sec09;

public class StaticCarExample02 {
    public static void main(String[] args) {
        StaticCar car1 = new StaticCar("벤츠");
        car1.setSpeed(100);
        car1.run(); // A: 벤츠, 100

        StaticCar car2 = new StaticCar("포르쉐");
        car2.setSpeed(200);
        car2.run(); // B: 포르쉐, 200

        car1.run(); // C:
        StaticCar.run(); // D:
    }
}
