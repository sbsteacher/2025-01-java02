package blackjack;

public class Card {
    private String pattern;
    private String denomination;

    public Card(String pattern, String denomination) {
        this.pattern = pattern;
        this.denomination = denomination;
    }

    public String getPattern() {
        return pattern;
    }

    public String getDenomination() {
        return denomination;
    }

    @Override
    public String toString() {
        return String.format("%s (%s)", this.pattern, this.denomination);
    }

    //getters 만든다.


    //기본 생성자


    //생성자는 왜 만들어요?


    //생성자, 메소드 차이, 다른 2가지


}
