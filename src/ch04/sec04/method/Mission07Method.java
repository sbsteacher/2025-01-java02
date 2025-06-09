package ch04.sec04.method;

public class Mission07Method {
    public static void main(String[] args) {
        int[] scores = { 90, 88, 100, 70, 60, 90, 77 };

        double avg = Mission07Method.getAverage(scores);
        System.out.printf("avg: %.2f\n", avg);
    }

    public static double getAverage(int[] arr) {
        int sum = Mission05Method.addAllUpArray(arr);
        return (double) sum / arr.length;
    }
}
