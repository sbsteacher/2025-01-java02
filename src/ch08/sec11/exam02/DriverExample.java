package ch08.sec11.exam02;

public class DriverExample {
    public static void main(String[] args) {
        Bus bus = new Bus();
        Taxi taxi = new Taxi();
        Driver driver = new Driver();
        //driver.drive(bus); //버스가 달린다.
        driver.drive(taxi); //택시가 달린다.

        //Vehicle 인터페이스를 implements한 객체의
        //주소값이 vehicle변수에 들어간다.
        Vehicle vehicle = new Vehicle() {
            @Override
            public void run() {
                System.out.println("버스가 달린다.");
            }

            @Override
            public void stop() {
                System.out.println("버스가 멈춘다.");
            }

            public void openBackDoor() {
                System.out.println("버스 뒷 문이 열린다.");
            }
        };

        Vehicle vehicle2 = new Bus();
    }
}
