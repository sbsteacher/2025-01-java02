package ch04.sec04;

public class Mission02Result {
    public static void main(String[] args) {
        //1, 2, 3, 4, 5, 6, 7, 8, 9, 10

        System.out.print(1);
        for(int i=2; i<11; i++) {
            System.out.printf(", %d", i);
        }
        System.out.println();

        System.out.println("---------------");
        for(int i=1; i<11; i++) {
            if(i > 1) {
                System.out.print(", ");
            }
            System.out.print(i);
        }
    }
}
