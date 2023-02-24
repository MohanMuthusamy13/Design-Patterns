package SingletonPattern;

// 3...SINGLETON DESIGN

// EARLY INITIALIZATION

/*

class SingletonClass {
    private String name;
    private long id;

    public static SingletonClass instance = new SingletonClass(); // GLOBALLY ACCESSIBLE OBJECT
    private SingletonClass() {} // PRIVATE CONSTRUCTOR

    public void setName(String s) {
        this.name = s;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public long getId() {
        return id;
    }

    public SingletonClass accessMethod() {
        return instance;
    }


}


 */

// LATE INITIALIZATION


class SingletonClass {
    private String name;
    private int id;

    public static SingletonClass instance;
    private SingletonClass() {}

    public static SingletonClass getInstance() {
        if (instance == null) {
            instance = new SingletonClass();
        }
        return instance;
    }

}

public class SingletonPattern {
    public static void main(String[] args) {
        SingletonClass instance = SingletonClass.getInstance();
        System.out.println(instance);
    }
}