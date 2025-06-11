package ch06.sec08;

public class PrimitiveAndRef {
    public static void main(String[] args) {
        int num = 10;
        changeNum(num);
        System.out.println("num: " + num); //10

        Numbox aaa = new Numbox();
        aaa.num = 10;
        changeNum(aaa);
        System.out.println("numbox.num: " + aaa.num); //
    }

    public static void changeNum(int num) {
        num = 20;
    }

    public static void changeNum(Numbox numbox) {
        numbox.num = 20;
    }
}

class Numbox {
    int num;
}