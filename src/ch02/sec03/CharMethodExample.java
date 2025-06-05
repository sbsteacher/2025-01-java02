package ch02.sec03;

public class CharMethodExample {
    public static void main(String[] args) {
        printCharToInt('c');
        printCharToInt('가');
        printCharToInt('!');

        int val = getCharToInt('c');
        System.out.println("val: " + val);
    }

    public static int getCharToInt(char ch) {
        return (int)ch;
    }

    //return 메소드, void 메소드
    //리턴타입, 메소드명, 파라미터, 구현부
    public static void printCharToInt(char ch) {
        System.out.printf("%c: %d\n", ch, (int)ch);
    }
}
