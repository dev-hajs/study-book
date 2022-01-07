package chap3;

public class Item11 {

    public static void main(String[] args) {

        Item11ToString item11ToString = new Item11ToString();
        item11ToString.setPhone1("010");
        item11ToString.setPhone2("1234");
        item11ToString.setPhone3("5678");

        // item11ToString = chap3.Item11ToString@3f0ee7cb
        // item11ToString = Item11ToString{phone1='010', phone2='1234', phone3='5678'}
        // item11ToString = 010-1234-5678
        System.out.println("item11ToString = " + item11ToString);

    }
}