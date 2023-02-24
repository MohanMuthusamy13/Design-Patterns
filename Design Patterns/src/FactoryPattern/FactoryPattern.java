package FactoryPattern;


// 2.. FACTORY DESIGN PATTERN

// THE MAIN IDEA OF THE FACTORY DESIGN PATTERN IS TO HIDE THE CREATION OF OBJECTS FROM THE CLIENT
// THIS STATIC FACTORY METHOD IN THE FACTORY CLASS CREATES AND RETURNS THE OBJECTS AS PER THE USER REQUIREMENTS

interface OS {
    public void ability();
    public void getName();
}

class Android implements OS {
    @Override
    public void ability() {
        System.out.println("ANDROID Iam Powerfull...");
    }

    @Override
    public void getName() {
        System.out.println("ANDROID");
    }
}

class Apple implements OS {
    @Override
    public void ability() {
        System.out.println("APPLE Iam Secured");
    }

    @Override
    public void getName() {
        System.out.println("APPLE");
    }
}

class Windows implements OS {
    @Override
    public void ability() {
        System.out.println("Iam Weird");
    }

    @Override
    public void getName() {
        System.out.println("WINDOWS");
    }
}

class MobileFactory {
    static public OS getInstance(String s) {
        if (s.equals("Powerful Phone")) {
            return new Android();
        }
        else if (s.equals("Security Phone")) {
            return new Apple();
        }
        else {
            return new Windows();
        }
    }
}
public class FactoryPattern {
    public static void main(String[] args) {
        OS powerPhone = MobileFactory.getInstance("Powerful Phone");
        powerPhone.getName();
        powerPhone.ability();

    }
}



/*

// THE METHOD WHICH KEEPS ON CHANGING FOR EACH INSTANT
interface Vehicle {
    public void getVehicle();
}

// SEPARATE CLASS FOR EACH INDIVIDUAL BEHAVIOUR ENCAPSULATED UNDER VEHICLE INTERFACE
class TwoWheeler implements Vehicle {
    @Override
    public void getVehicle() {
        System.out.println("It is two wheeler");
    }
}

class ThreeWheeler implements Vehicle {
    @Override
    public void getVehicle() {
        System.out.println("It is three wheeler");
    }
}

class FourWheeler implements Vehicle {
    @Override
    public void getVehicle() {
        System.out.println("It is four wheeler");
    }
}

class UnknownVehicle implements Vehicle {
    @Override
    public void getVehicle() {
        System.out.println("Not yet implemented :) ");
    }
}

// Factory method for creation of objects :)
class VehicleFactory {
    public Vehicle getInstance(int wheelNumber) {
        if (wheelNumber == 2) {
            return new TwoWheeler();
        }
        else if (wheelNumber == 3) {
            return new ThreeWheeler();
        }
        else if (wheelNumber == 4) {
            return new FourWheeler();
        }
        else {
            return new UnknownVehicle();
        }
    }
}


public class Main {
    public static void main(String[] args) {
        VehicleFactory vf = new VehicleFactory();
        Vehicle twowheel = vf.getInstance(2); // hiding the logic of object creation from the client
        twowheel.getVehicle();
    }
}

 */