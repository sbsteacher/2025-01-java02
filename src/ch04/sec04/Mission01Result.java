package ch04.sec04;

public class Mission01Result {
    public static void main(String[] args) {
        //20~30까지 모두 더한 결과값을 출력해주세요.
        //for문 사용
        int sum = 0;
        for(int i=20; i<31; i++) {
            sum = sum + i;
        }
        System.out.println("sum: " + sum);
//        sum = sum + 20;
//        sum = sum + 21;
//        sum = sum + 22;
//        sum = sum + 23;
//        //....
//        sum = sum + 30;
    }
}
