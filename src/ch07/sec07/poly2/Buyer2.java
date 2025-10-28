package ch07.sec07.poly2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class Buyer2 extends Buyer {
    private List<Product> purchasedList = new ArrayList<>(3);
    private Map<String, Integer> purchasedProduct = new HashMap<>();

    @Override
    public void buy(Product product) {
        super.buy(product);
        purchasedList.add(product);

        //product.getClass().getSimpleName()  >> 객체의 클래스 이름을 문자열로 얻을 때 사용.
        final String KEY = product.getClass().getSimpleName();
        if(!purchasedProduct.containsKey(KEY)) {
            purchasedProduct.put(KEY, 0);
        }
        purchasedProduct.put(KEY, purchasedProduct.get(KEY) + 1);
    }

    public void printPurchasedList() {
        System.out.println(purchasedList);
    }

    public void printPurchasedProduct() {
        AtomicInteger i = new AtomicInteger();
        purchasedProduct.forEach((key, value) -> {
            if(i.getAndIncrement() > 0) {
                System.out.print(", ");
            }
            System.out.printf("%s %d대", key, value);
        });
    }
}
