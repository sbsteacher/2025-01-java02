package ch08.interfaces;

public class Level1Main {
    public static void main(String[] args) {
        String password = "비밀번호";

//        AlphaCrypt crypt = new AlphaCrypt();
//        crypt.maa(password);
//
//        crypt.mbb(password);

        BravoCrypt crypt = new BravoCrypt();
        crypt.mcc(password);

        crypt.mdd(password);
    }
}
