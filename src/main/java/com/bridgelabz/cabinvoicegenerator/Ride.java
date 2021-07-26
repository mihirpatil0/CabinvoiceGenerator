package com.bridgelabz.cabinvoicegenerator;

/**************************************
 * @author mihir
 *
 * This class acts as a pojo class.
 * Holedes information related to rides.
 **************************************/

public class Ride
{
    public double distance;
    public double time;

    public Ride(double distance, double time)
    {
        this.distance = distance;
        this.time = time;
    }

    @Override
    public String toString() {
        return "Ride{" +
                "distance=" + distance +
                ", time=" + time +
                '}';
    }
}
