package ch03;

public class Confirmation07 {
    public static void main(String[] args) {
        double x = 5.0;
        double y = 0.0;
        double z = x % y;
        if(Double.isNaN(z)) {
            System.out.println("0.0으로 나눌 수 없습니다.");
            return;
        }
        double result = z + 10;
        System.out.println(result);


        System.out.println(z);
    }
}
