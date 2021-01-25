/*
    this program is demonstates first steps into classes in java
*/

/* class Vehicle {
    int passengers;
    int fuelcap;
    int milepergallon;
}

class VehicleDemo {
    public static void main (String args[]) {
        Vehicle minivan = new Vehicle();
        int range;

        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.milepergallon = 21;

        range = minivan.fuelcap * minivan.milepergallon;
        System.out.println("Minivan can transport " + minivan.passengers + " passangers for " + range + " miles");
    }
} */

/* class Vehicle {
    int passengers;
    int fuelcap;
    int milepergallon;
}

class VehicleDemo {
    public static void main (String args[]) {
        Vehicle minivan = new Vehicle();
        Vehicle sportcar = new Vehicle();

        int rangeMinivan, rangeSportcar;

        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.milepergallon = 21;

        sportcar.passengers = 2;
        sportcar.fuelcap = 14;
        sportcar.milepergallon = 12;

        rangeMinivan = minivan.fuelcap * minivan.milepergallon;
        rangeSportcar = sportcar.fuelcap * sportcar.milepergallon;

        System.out.println("Minivan can transport " + minivan.passengers + " passangers for " + rangeMinivan + " miles");
        System.out.println("Sportcar can transport " + sportcar.passengers + " passangers for " + rangeSportcar + " miles");
    }
} */

/* class Vehicle {
    int passengers;
    int fuelcap;
    int milepergallon;

    void rangePrintln() {
        System.out.println("Range is -- " + fuelcap*milepergallon + " miles");
    }
}

class VehicleDemo {
    public static void main (String args[]) {
        Vehicle minivan = new Vehicle();
        Vehicle sportcar = new Vehicle();

        int rangeMinivan, rangeSportcar;

        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.milepergallon = 21;

        sportcar.passengers = 2;
        sportcar.fuelcap = 14;
        sportcar.milepergallon = 12;

        minivan.rangePrintln();
        sportcar.rangePrintln();
    }
} */

/* class Vehicle {
    int passengers;
    int fuelcap;
    int milepergallon;

    int range() {
        return fuelcap * milepergallon;
    }
}

class VehicleDemo {
    public static void main (String args[]) {
        Vehicle minivan = new Vehicle();
        Vehicle sportcar = new Vehicle();

        int rangeMinivan, rangeSportcar;

        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.milepergallon = 21;

        sportcar.passengers = 2;
        sportcar.fuelcap = 14;
        sportcar.milepergallon = 12;

        //rangeMinivan = minivan.range();
        //rangeSportcar = sportcar.range();

        //System.out.println("Minivan can transport " + minivan.passengers + " passangers for " + rangeMinivan + " miles");
        //System.out.println("Sportcar can transport " + sportcar.passengers + " passangers for " + rangeSportcar + " miles");

        System.out.println("Minivan can transport " + minivan.passengers + " passangers for " + minivan.range() + " miles");
        System.out.println("Sportcar can transport " + sportcar.passengers + " passangers for " + sportcar.range() + " miles");
    }
} */


class Vehicle {
    int passengers;
    int fuelcap;
    int milepergallon;

    int range() {
        return fuelcap * milepergallon;
    }

    double fuelneeded(int milesNeeded) {
        return (double) milesNeeded/milepergallon;
    }

    Vehicle(int p, int f, int m) {
        passengers = p;
        fuelcap = f;
        milepergallon = m;
    }
}

class VehicleDemo {
    public static void main (String args[]) {
        Vehicle minivan = new Vehicle(7, 16, 21);
        Vehicle sportcar = new Vehicle(2, 14, 12);
        double gallons;

        int distance = 252;



        System.out.println("For minivan\'s way for " + distance + " miles the voluem of " + minivan.fuelneeded(distance) + " gallons of fuel needed");
        System.out.println("For sportcar\'s way for " + distance + " miles the voluem of " + sportcar.fuelneeded(distance) + " gallons of fuel needed");
    }
}