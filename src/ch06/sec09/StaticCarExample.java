package ch06.sec09;

public class StaticCarExample {
    public static void main(String[] args) {
        StaticCar.model = "벤츠";
        StaticCar.setSpeed(200);
        StaticCar.run(); // A: 벤츠, 200

        Math.random();

        StaticCar car1 = new StaticCar("BMW");
        car1.setSpeed(100);
        car1.run();

        StaticCar.model = "GV80";

        StaticCar.run(); // B: BMW, 100
    }
}
