package ch05.sec06;

public class ArrayCreateByValueListExample2 {
    public static void main(String[] args) {
        //int[] scores = { 83, 90, 87 };
        int[] scores;
        scores = new int[]{ 83, 90, 87, 98 };
        //System.out.println("main: " + Arrays.toString(scores));
        printItem(scores);

        //printItem({10, 20, 30});
        int[] aaa = {10, 20, 30};
        printItem(aaa);

        printItem(new int[]{ 83, 90, 87, 98 });


        int[] arr = { 10, 20, 30, 40, 50, 100, 200 };
        printItem(arr);
    }
    //           리턴타입 메소드명 (파라미터(매개변수))
    public static void printItem(int[] arr) {
        //System.out.println("printItem: " + Arrays.toString(arr));
        for(int i=0; i<arr.length; i++) {
            System.out.printf("score[%d]: %d\n", i, arr[i]);
        }

        /*
        score[0]: 83
        score[1]: 90
        score[2]: 87
        score[3]: 98
        */
    }
}
