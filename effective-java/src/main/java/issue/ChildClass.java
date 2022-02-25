package issue;

public class ChildClass implements InterfaceA {

    @Override
    public String printJuso() {
        return "서울시 송파구";
    }

//    @Override
    public String printName() {
        System.out.println("printName - Child");
        return "하지수";
    }
}
