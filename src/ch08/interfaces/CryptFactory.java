package ch08.interfaces;

public class CryptFactory {
    public static CryptInterface createCrypt(String name) {
        return switch(name) {
            case "alpha" -> new AlpahCryptImpl();
            case "beta" -> new BetaCryptImpl();
            default -> null;
        };
    }
}
