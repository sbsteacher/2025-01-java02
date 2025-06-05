package ch04.sec04.method;

import ch03.sec11.ScoreMethodExample;

public class Mission03Method {
    public static void main(String[] args) {
        int star = ScoreMethodExample.getRandomValue(3, 7);
        System.out.println("star: " + star);

        // 콘솔에 출력
        // 5였다면 ***** (개행)
        // 3였다면 *** (개행)
        printSingleLine(star);
        printSingleLine(10);
        printSingleLine(20);
        System.out.println("==================");
        printMultiLine(4);
        //****
        //****
        //****
        //****

        printMultiLine(6);
        //******
        //******
        //******
        //******
        //******
        //******

        System.out.println("================");
        printTriangleLine(4);
        //*
        //**
        //***
        //****
    }
    public static void printTriangleLine(int cnt) {
        for(int i=1; i<=cnt; i++) {
            printSingleLine(i);
        }
    }

    public static void printMultiLine(int cnt) {
        for(int i=0; i<cnt; i++) {
            printSingleLine(cnt);
        }
    }

    public static void printSingleLine(int cnt) {
        for(int i=0; i<cnt; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

}
