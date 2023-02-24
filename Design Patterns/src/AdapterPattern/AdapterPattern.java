package AdapterPattern;

// 5.. ADAPTER PATTERN

// PEN EXAMPLE


class PilotPen {
    public void mark(String str) {
        System.out.println(str);
    }
}

interface Pen {
    public void write(String str);
}

class PenAdapter implements Pen {
    PilotPen pp = new PilotPen();
    @Override
    public void write(String str) {
        pp.mark(str);
    }
}
class AssignmentWork {
    private Pen pen;

    public Pen getP() {
        return pen;
    }

    public void setP(Pen p) {
        this.pen = p;
    }

    public void writeAssignment(String str) {
        pen.write(str);
    }
}

public class AdapterPattern {
    public static void main(String[] args) {
        Pen pp = new PenAdapter();
        AssignmentWork aw = new AssignmentWork();
        aw.setP(pp);
        aw.writeAssignment("I can glide in the paper :) ");
    }
}

// BIRD TOY ADAPTER

/*
interface Bird {
    public void fly();
    public void makeSound();
}

class Sparrow implements Bird {
    @Override
    public void fly() {
        System.out.println("Uff flying on the clouds :) ");
    }

    @Override
    public void makeSound() {
        System.out.println("Chrip ...");
    }
}

class Pigeon implements Bird {
    @Override
    public void fly() {
        System.out.println("Pige fly");
    }

    @Override
    public void makeSound() {
        System.out.println("Pige Pigew :)");
    }
}

interface ToyBird {
    public void fly();
    public void makeSound();
}

class ToyPigeon implements ToyBird {
    @Override
    public void fly() {
        System.out.println("Runnny");
    }

    @Override
    public void makeSound() {
        System.out.println("Blah blah");
    }
}

class BirdAdapter implements ToyBird {
    Bird b;
    public BirdAdapter(Bird b) {
        this.b = b;
    }

    @Override
    public void fly() {
        b.fly();
    }

    @Override
    public void makeSound() {
        b.makeSound();
    }
}

class ToyAdapter implements Bird {

    ToyBird tb;
    public ToyAdapter(ToyBird tb) {
        this.tb = tb;
    }
    @Override
    public void fly() {
        tb.fly();
    }

    @Override
    public void makeSound() {
        tb.makeSound();
    }
}

public class Main {
    public static void main(String[] args) {
        Sparrow sparrow = new Sparrow();
        ToyBird tb = new ToyPigeon();
        tb.makeSound();
        ToyBird b = new BirdAdapter(sparrow);
        b.makeSound();

        ToyPigeon tbe = new ToyPigeon();
        tbe.makeSound();

        ToyBird bi =  new BirdAdapter(sparrow);
        // TOY BIRD CAN NOW DO BIRD SOUND
        bi.makeSound();

        Bird bd = new ToyAdapter(tbe);
//        BIRD CAN NW MAKE THE TOYS SOUND
        bd.makeSound();

    }

 */