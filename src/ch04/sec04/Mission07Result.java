package ch04.sec04;

public class Mission07Result {
    public static void main(String[] args) {
        int[] scores = { 90, 88, 100, 70, 60 };
        int sum = 0;
        for(int item : scores) {
            sum += item;
        }
        System.out.println("평균점수: " + ((double)sum / scores.length));
        //어떤 학생이 받은 점수이다.
        //평균점수를 구하라.
    }
}
