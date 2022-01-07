package chap3;

public class Item11ToString {

    private String phone1;
    private String phone2;
    private String phone3;

    public void setPhone1(String phone1) {
        this.phone1 = phone1;
    }

    public void setPhone2(String phone2) {
        this.phone2 = phone2;
    }

    public void setPhone3(String phone3) {
        this.phone3 = phone3;
    }

    @Override
    public String toString() {
        return "Item11ToString{" +
                "phone1='" + phone1 + '\'' +
                ", phone2='" + phone2 + '\'' +
                ", phone3='" + phone3 + '\'' +
                '}';
//        return phone1 + "-" + phone2 + "-" + phone3;
    }
}
