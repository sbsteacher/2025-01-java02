package ch04.sec02;

import java.util.Scanner;

public class Mission03Result {
    public static void main(String[] args) {
        //BMI 계산할수 있는 프로그램
        //체중(kg), 키cm로 입력받아서 BMI를 계산하여 출력해 주세요.
        //체중(kg)을 키(cm)의 제곱으로 나누는 것

        /*
        BMI (kg / m²)를 구하는 방법은 (몸무게) / (키)²로서,
        단위에서 알 수 있듯이 몸무게는 kg, 키는 m이다.
        예를 들자면, 몸무게 55kg에 키 168cm(= 1.68m)인 사람의 BMI는 55kg / (1.68m)² = 19.4이다.
         */
        Scanner scan = new Scanner(System.in);
        System.out.print("키(cm)를 입력해 주세요 > ");
        String strHeight = scan.next();
        System.out.print("몸무게(Kg)를 입력해 주세요 > ");
        String strWeight = scan.next();

        double height = Double.parseDouble(strHeight);
        double weight = Double.parseDouble(strWeight);

        double meterHeight = height * 0.01;

        double resultBMI = weight / Math.pow(meterHeight, 2);
        System.out.printf("키: %.1fcm, 몸무게: %.1fkg, BMI: %.2f\n", height, weight, resultBMI);


    }
}
