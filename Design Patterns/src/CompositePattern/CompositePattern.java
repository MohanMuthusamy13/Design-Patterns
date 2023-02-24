package CompositePattern;

import java.util.ArrayList;
import java.util.List;

// COMPOSITE DESIGN PATTERN

interface Identity {
    public void showAbility();
}

class Leaf implements Identity {
    private String name;
    private String ability;

    public Leaf(String s, String a) {
        this.name = s;
        this.ability = a;
    }
    @Override
    public void showAbility() {
        System.out.println(String.format("%s : %s", name, ability));
    }
}

class Composite implements Identity {
    private String name;
    private List<Identity> arrayIdentity = new ArrayList<>();

    public Composite(String name) {
        this.name = name;
    }

    public void addIdentity(Identity i) {
        arrayIdentity.add(i);
    }
    @Override
    public void showAbility() {
        System.out.println(name);
        for (Identity identity :arrayIdentity) {
            identity.showAbility();
        }
    }
}
public class CompositePattern {
    public static void main(String[] args) {

        Composite sports = new Composite("Sports");

        Composite Football = new Composite("Football");
        Composite Badminton = new Composite("Badminton");
        Composite Cricket = new Composite("Cricket");

        sports.addIdentity(Football);
        sports.addIdentity(Badminton);
        sports.addIdentity(Cricket);

        Identity Moji = new Leaf("Moji", "Dribbler");
        Identity Siva = new Leaf("Siva", "Long Range Shooter");
        Football.addIdentity(Moji);
        Football.addIdentity(Siva);

        Identity Adi = new Leaf("Aditya", "Smasher");
        Identity Hari = new Leaf("Hari", "DropReceiver");
        Badminton.addIdentity(Adi);
        Badminton.addIdentity(Hari);

        Identity Loge = new Leaf("Loganathan", "Batsman");
        Identity Sethu = new Leaf("Sethu", "Bowler");
        Cricket.addIdentity(Loge);
        Cricket.addIdentity(Sethu);

        sports.showAbility();
    }
}