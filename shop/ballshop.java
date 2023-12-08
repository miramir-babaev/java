package shop;

import toys.ball;
import toys.toy;

public class ballshop implements toyshop {
    @Override
    public toy createToy(int id, int weight, String name) {
        return new ball(id, weight, name);
    }
}
