package ch05.sec06;

public class ArrayCreateByValueListExample1 {
    public static void main(String[] args) {
        String[] season = { "Spring", "Summer", "Fall", "Winter" };

        System.out.println("season[0]: " + season[0]);
        System.out.println("season[1]: " + season[1]);

        season[0] = "봄";
        System.out.println("season[0]: " + season[0]);

        int[] scores = { 83, 90, 87 };

        int sum = 0;
        for(int item : scores) {
            sum += item;
        }
        //총합
        System.out.printf("총합: %d\n", sum);
        //평균
        double avg = (double)sum / scores.length;
        System.out.printf("평균: %.2f\n", avg);

    }
}
