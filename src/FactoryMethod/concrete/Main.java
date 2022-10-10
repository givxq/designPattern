package FactoryMethod.concrete;

import FactoryMethod.framework.Item;
import FactoryMethod.framework.ItemCreator;

public class Main {

    public static void main(String[] args) {
        ItemCreator creator;
        Item item;

        creator = new HpCreator();
        item = creator.create();

        creator = new MpCreator();
        item = creator.create();

    }
}
