package shop;

import toys.robot;
import toys.toy;

public class robotshop implements toyshop {
    @Override
    public toy createToy(int id, int weight, String name) {
        return new robot(id, weight, name);
    }
}