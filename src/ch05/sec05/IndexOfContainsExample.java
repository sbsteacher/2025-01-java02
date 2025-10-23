package ch05.sec05;

public class IndexOfContainsExample {
    public static void main(String[] args) {
        String subject = "자바 프로그래밍 나이쓰 프로그래밍";
        int idx = subject.indexOf("프로그래밍");
        System.out.println("idx: " + idx);

        int idx2 = subject.indexOf("닝닝");
        System.out.println("idx2: " + idx2);

        System.out.println(subject.indexOf("그"));
        System.out.println(subject.lastIndexOf("그"));

        //해당문자열에 내가 찾는 문자열이 있는가????
        boolean result = subject.contains("나이쑤");
        System.out.println("result: " + result);
    }
}
