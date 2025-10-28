package ch06.sec04;

public class StudentExample {
    String s3;

    public static void main(String[] args) {
        String s3;

        StudentExample se = new StudentExample();
        System.out.println(se.s3);

        Student s1 = new Student();
        Student s2 = new Student();

        s1.introduce(); // 기본 생성자 호출!
        s2.introduce(); // 기본 생성자 호출!

        s1.name = "홍길동";
        s2.name = "신사임당";

        s1.introduce(); // 안녕 내 이름은 홍길동이라고 해
        s2.introduce(); // 안녕 내 이름은 신사임당이라고 해
    }
}
