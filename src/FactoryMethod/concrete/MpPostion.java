package FactoryMethod.concrete;

import FactoryMethod.framework.Item;

public class MpPostion implements Item {

    @Override
    public void use() {
        System.out.println("마력 회복!");
    }
}