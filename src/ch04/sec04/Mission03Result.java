package ch04.sec04;

public class Mission03Result {
    public static void main(String[] args) {
        int star = (int)(Math.random() * 6.0) + 3; // 3~8 랜덤값 생성
        System.out.println("star: " + star);

        for(int z=0; z<star; z++){
            //B
            for (int i = 0; i < star; i++) {
                System.out.print("*"); //A
            }
            System.out.println();
        }
        //star: 6
        //******
        //******
        //******
        //******
        //******


    }
}
