package ch04.sec04;

public class Mission04Result {
    public static void main(String[] args) {
        int dan = (int)(Math.random() * 8.0) + 2; //2~9 랜덤값

        //구구단 출력
        for(int i=1; i<10; i++) {
            System.out.printf("%d x %d = %d\n", dan, i, dan * i);
        }

    }
}
