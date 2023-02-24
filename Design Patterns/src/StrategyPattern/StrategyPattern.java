package StrategyPattern;

// 1... STRATEGY PATTERN
// DUCK EXAMPLE

class Duck {
    FlyBehaviour flyBehaviour;
    QuackBehaviour quackBehaviour;

    public void performFly() {
        flyBehaviour.fly();
    }

    public void performQuack() {
        quackBehaviour.quack();

    }

    public void setFlyBehaviour(FlyBehaviour fb) {
        flyBehaviour = fb;
    }

    public void setQuackBehaviour(QuackBehaviour qb) {
        quackBehaviour = qb;
    }

    public void swim() {
        System.out.println("I can swim in water :)))");
    }

    public void eat() {
        System.out.println("I eat things that are present in the pond :)");
    }

}

interface FlyBehaviour {
    public void fly();
}


class FlyWithWings implements FlyBehaviour{
    @Override
    public void fly() {
        System.out.println("I can fly with wings :) ");
    }

}

class FlyWithNoWings implements FlyBehaviour {
    @Override
    public void fly() {
        System.out.println("I cant fly high but atleast a lil distance from ground :) ");
    }
}


interface QuackBehaviour {
    public void quack();
}

class SqeakQuack implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("Sqeak ! :) ");
    }
}

class MuteQuack implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("I dont really quack :)");
    }
}


class RubberDuck extends Duck {

    public RubberDuck() {
        flyBehaviour = new FlyWithNoWings();
        quackBehaviour = new MuteQuack();
    }

    // SETTER FOR CHANGING THE BEHAVIOUR OF A PARTICULAR INSTANCE DYNAMICALLY


    public void display() {
        System.out.println("Iam rubber duckky");
    }
}

class RedHeadDuck extends Duck{
    public RedHeadDuck() {
        flyBehaviour = new FlyWithWings();
        quackBehaviour = new SqeakQuack();
    }

    public FlyBehaviour getFlyBehaviour() {
        return this.flyBehaviour;
    }
}

public class StrategyPattern {
    public static void main(String[] args) {
        RubberDuck rb = new RubberDuck();
        rb.flyBehaviour.fly();

        rb.setFlyBehaviour(new FlyWithWings());
        rb.flyBehaviour.fly();

        RedHeadDuck rh = new RedHeadDuck();
        rh.getFlyBehaviour().fly();
        rb.performFly();

    }
}



// ADVENTURE GAME

/*
import java.time.chrono.Chronology;

class Character {
    WeaponBehaviour weapon;

    public void pickWeapon() {
        weapon.useWeapon();
    }

    public void setWeapon(WeaponBehaviour w) {
        this.weapon = w;
    }

    public void fight() {
        System.out.println(String.format("I can fight with ..."));
    }
}

interface WeaponBehaviour {
    public void useWeapon();
}

class KnifeBehaviour implements WeaponBehaviour {
    @Override
    public void useWeapon() {
        System.out.println("I use Knife !");
    }
}

class BowAndArrowBehaviour implements WeaponBehaviour {
    @Override
    public void useWeapon() {
        System.out.println("I use Bow and Arrow !");
    }
}

class AxeBehaviour implements WeaponBehaviour {
    @Override
    public void useWeapon() {
        System.out.println("I use Axe ! :) ");
    }
}

class SwordBehaviour implements WeaponBehaviour {
    @Override
    public void useWeapon() {
        System.out.println("I use sword ! ");
    }
}


class Mohan extends Character {
    public Mohan() {
        weapon = new BowAndArrowBehaviour();
    }

    @Override
    public void fight() {
        super.fight();
    }
}

class Mokshith extends Character {
    WeaponBehaviour weapon;

    public Mokshith() {
        this.weapon = new SwordBehaviour();
    }
    @Override
    public void fight() {
        System.out.println(String.format("I can fight well with "));
        System.out.println(weapon);
    }
}

public class Main {
    public static void main(String[] args) {
        Mohan moji = new Mohan();

        moji.pickWeapon();
        moji.fight();

        Mokshith mo = new Mokshith();
        mo.fight();
    }
}

 */