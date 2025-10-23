package ch08.interfaces;

public class Level2Main {
    public static void main(String[] args) {
        String password = "비밀번호";
        CryptInterface crypt = CryptFactory.createCrypt(args[0]);
        if(crypt == null) { return; }

        crypt.encode(password);

        crypt.decode(password);


    }
}
