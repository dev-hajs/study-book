package _11_primitive_obsession;

public class Order {

    private Priority priority;

    public Order(String priorityValue) {
        this(new Priority(priorityValue));
    }

    public Order(Priority priority) {
        this.priority = priority;
    }

    public Priority getPriority() {
        return priority;
    }
}
