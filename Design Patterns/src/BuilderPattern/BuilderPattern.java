package BuilderPattern;


// 4... BUILDER PATTERN

class Phone {
    private String name;
    private int price;
    private String os;
    private long battery;

    public Phone(String name, int price, String os, long battery) {
        super();
        this.name = name;
        this.price = price;
        this.os = os;
        this.battery = battery;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", os='" + os + '\'' +
                ", battery=" + battery +
                '}';
    }
}

class PhoneBuilder {
    private String name;
    private int price;
    private String os;
    private long battery;

    public PhoneBuilder setName(String str) {
        this.name = str;
        return this;
    }

    public PhoneBuilder setPrice(int price) {
        this.price = price;
        return this;
    }

    public PhoneBuilder setOS(String os) {
        this.os = os;
        return this;
    }

    public PhoneBuilder setBattery(long battery) {
        this.battery = battery;
        return this;
    }

    public Phone getPhone() {
        return new Phone(name, price, os, battery);
    }

}
public class BuilderPattern {
    public static void main(String[] args) {
//        Phone p = new Phone("Vivo", 350, "Android", 3500);
//        System.out.println(p.toString());

//        PhoneBuilder p = new PhoneBuilder();
//        p.setName("Vivo");
//        p.setBattery(3500);
//        p.setOS("Android");
//        System.out.println(p.getPhone());

        Phone sony = new PhoneBuilder().setName("Sony").setBattery(3500).setOS("SecureWeirdOS").setPrice(450).getPhone();
        System.out.println(sony);
    }
}