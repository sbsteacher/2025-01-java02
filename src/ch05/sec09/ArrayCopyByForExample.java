package ch05.sec09;

import java.util.Arrays;

public class ArrayCopyByForExample {
    public static void main(String[] args) {
        int[] oldIntArray = new int[3]; //길이가 3인 배열 공간 생성

        //1, 2, 3 대입해주세요.
        for(int i=0; i<oldIntArray.length; i++) {
            oldIntArray[i] = i + 1;
        }

//        int[] newIntArray = new int[oldIntArray.length];
//        for(int i=0; i<newIntArray.length; i++) {
//            newIntArray[i] = oldIntArray[i];
//        }
        int[] newIntArray = oldIntArray;


        System.out.println("1:" + Arrays.toString(oldIntArray)); //1, 2, 3
        System.out.println("2:" + Arrays.toString(newIntArray)); //1, 2, 3

        newIntArray[0] = 10;
        System.out.println("3:" + Arrays.toString(oldIntArray)); //10, 2, 3
        System.out.println("4:" + Arrays.toString(newIntArray)); //1, 2, 3
    }
}
