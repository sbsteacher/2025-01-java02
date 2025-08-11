package ch08.interfaces;

public class BetaCryptImpl implements CryptInterface {
    private BetaCrypt crypt = new BetaCrypt();

    @Override
    public void encode(String str) {
        crypt.mcc(str);
    }

    @Override
    public void decode(String str) {
        crypt.mdd(str);
    }
}
