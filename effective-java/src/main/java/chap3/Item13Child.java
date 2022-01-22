package chap3;

public class Item13Child extends Item13Parent {

    @Override
    public String toString() {
        return "Item13Child{}";
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        System.out.println("child clone...");
        return super.clone();
    }
}
