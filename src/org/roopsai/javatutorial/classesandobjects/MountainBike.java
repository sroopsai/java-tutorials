package org.roopsai.javatutorial.classesandobjects;

public class MountainBike extends Bicycle {

    // the MountainBike subclass has
    // one field

    private int seatHeight;

    // the MountainBike subclass has one constructor
    public MountainBike(int seatHeight, int cadence, int gear, int speed)
    {
        super(cadence, gear, speed);
        this.seatHeight = seatHeight;
    }

    // the MountainBike subclass has
    // one method

    public void setSeatHeight(int newSeatHeight)
    {
        seatHeight = newSeatHeight;
    }
}
