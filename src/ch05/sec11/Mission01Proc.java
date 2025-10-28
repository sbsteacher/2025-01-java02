package ch05.sec11;

public class Mission01Proc {
    public static void main(String[] args) {
        final String WEIGHT_UNIT = "kg";
        final String HEIGHT_UNIT = "cm";

        String weight = args[0].toLowerCase();
        String height = args[1].toLowerCase();

        if(!weight.contains(WEIGHT_UNIT)) {
            System.out.println("몸무게를 확인해 주세요.");
            return;
        } else if(!height.contains(HEIGHT_UNIT)) {
            System.out.println("키를 확인해 주세요.");
            return;
        }
        double weightValue = Double.parseDouble(weight.replace(WEIGHT_UNIT, ""));
        double heightValue = Double.parseDouble(height.replace(HEIGHT_UNIT, ""));
        double meterHeight = heightValue * 0.01;
        double resultBMI = weightValue / Math.pow(meterHeight, 2);
        System.out.printf("키: %s, 몸무게: %s, BMI: %.2f\n", height, weight, resultBMI);
    }
}
