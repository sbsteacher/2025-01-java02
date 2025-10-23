package ch05.sec11;

public class Mission01Result {
    public static void main(String[] args) {
        //args이용하여 각 방에 있는 값들을 모두 더한 값을 출력
        int sum = 0;
        for(String item : args) {
            int val = Integer.parseInt(item);
            sum += val;
        }
        System.out.println("sum: " + sum);
    }
}
