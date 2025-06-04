package ch02.sec01.method;

public class VariableUseMethodExample {
    public static void main(String[] args) {
        printTime(10, 20); //10:20
        printTime(2, 9); //02:09

        printTime(2, 9, 2); //02:09:02
        printTime(12, 9, 22); //12:09:22
    }

    public static void printTime(int hour, int min, int sec) {
        //System.out.printf("%02d:%02d\n", hour, min);
        String strHour = hour < 10 ? "0" + hour : String.valueOf(hour);
        System.out.print(strHour + ":");
        printTime(min, sec);
    }

    public static void printTime(int time1, int time2) {
        //System.out.printf("%02d:%02d\n", hour, min);
        String strTime1 = time1 < 10 ? "0" + time1 : String.valueOf(time1);
        String strTime2 = time2 < 10 ? "0" + time2 : String.valueOf(time2);
        System.out.println(strTime1 + ":" + strTime2);
    }

}
