package org.roopsai.javatutorial.classesandobjects;

public class Bicycle {

    // the Bicycle class has
    // three fields
    private int gear;
    private int speed;
    private int cadence;

    // the Bicycle class has one constructor
    public Bicycle(int cadence, int gear, int speed)
    {
        this.cadence = cadence;
        this.gear = gear;
        this.speed = speed;
    }

    // the Bicycle class has four methods
    public void setCadence(int newCadence)
    {
        cadence = newCadence;
    }

    public void setGear(int newGear)
    {
        gear = newGear;
    }

    public void applyBrake(int decrement)
    {
        speed -= decrement;
    }

    public void speedUp(int increment)
    {
        speed += increment;
    }

    // access the fields
    public int getGear()
    {
        return gear;
    }

    public int getSpeed()
    {
        return speed;
    }

    public int getCadence()
    {
        return cadence;
    }

}
