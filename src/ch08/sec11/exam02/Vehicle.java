package ch08.sec11.exam02;

/*
인터페이스는 인스턴스 멤버필드를 가질 수 없다.
static final 멤버필드는 가질 수 있다.

무조건 추상메소드만 가질 수 있다.
public abstract 생략 가능. 생략하면 자동으로 붙는다.



추상 클래스가 추상 클래스 상속 받을 수 있는가? extends
인터페이스가 인터페이스 상속 받을 수 있는가? extends

인터페이스가 클래스를 상속 받을 수 없다.
클래스가 인터페이스를 상속 받을 수 있다. implements


추상 클래스
- 다중 상속 불가능
- abstract
- 일반 메소드도 가질 수 있다.
- 객체 생성 불가능
- 추상 메소드는 자식이 오버라이딩 해야한다. (강제성이 있다.)

인터페이스
- 다중 상속 가능
- 무조건 추상 메소드만 가질 수 있다.
- 상속받을 때 implements 키워드를 사용한다.
- 인스턴스 멤버 필드를 가질 수 없다.
- public abstract는 생략하면 자동으로 붙는다.

 */

//운송수단
public interface Vehicle {
    void run();
    void stop();
}
