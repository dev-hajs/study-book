package chap3;

public class Item13Parent implements Cloneable {

    @Override
    public String toString() {
        return "Item13Parent{}";
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        System.out.println("parent clone...");
//        return new Item13Parent(); // castClassException 발생!!
        return super.clone();
    }
}
