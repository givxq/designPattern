package FactoryMethod.framework;

abstract class ItemCreator {

    public Item create() {
        Item item;
        return item;
    }

    //아이템을 생성하기 전에 데이터 베이스에서 아이템 정보를 요청합니다.
    abstract protected void requstItemsInfo();
}