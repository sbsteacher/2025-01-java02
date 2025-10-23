package ch02.sec04;

public class FloatDoubleExample {
    public static void main(String[] args) {

        //실수 리터럴을 float변수에 대입할 때는 항상 끝에 'f' or 'F'를 붙인다.
        long l1 = 10L;
        float f1 = l1;

        double var000 = 0.1f;

        float var0 = 0.1f;
        float var00 = (float)0.1;

        //정밀도 확인
        float var1 = 0.1234567890123456789F;
        double var2 = 0.123456789012345671;
        System.out.println("var1: " + var1);
        System.out.println("var2: " + var2);
    }
}
