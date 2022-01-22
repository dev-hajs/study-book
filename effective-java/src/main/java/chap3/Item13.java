package chap3;

public class Item13 {

    public static void main(String[] args) {

        Item13Child child = new Item13Child();
        System.out.println(child);
        Item13Parent parent = new Item13Parent();
        System.out.println(parent);

        try {
            Object child2 = child.clone();
            System.out.println(child2);
            Object parent2 = parent.clone();
            System.out.println(parent2);

            Item13Child child3 = (Item13Child) child.clone();
            System.out.println(child3);

            Item13Parent parent3 = (Item13Parent) parent.clone();
            System.out.println(parent3);

        } catch (Exception e) {
            System.out.println("=== error ===");
            System.out.println(e);
        } finally {
            System.out.println("=== finally ===");
        }

    }
}
