package shop;

import toys.doll;
import toys.toy;

public class dollshop implements toyshop {
    @Override
    public toy createToy(int id, int weight, String name) {
        return new doll(id, weight, name);
    }
}