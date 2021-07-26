package com.bridgelabz.cabinvoicegenerator;

import java.util.HashMap;

/*******************************************************
 * @author mihir
 * @since 27-July-2021
 *
 * This class contains all the methods that are required
 * to generate cab invoice.
 *******************************************************/

public class CabInvoiceGenerator
{
    public HashMap<Integer,Ride[]> rideRepository = new HashMap<>();
    private static final double FARE_PER_KM = 10;
    private static final double FARE_PER_MINUTE = 1;
    private static final double MINIMUM_FARE = 5;

    /**
     * Name : getfare
     *
     * Description : Calculate fare based on distance and time.
     *
     * @param distance
     * @param time
     * @return
     *
     * Modification : First commit 27-July-2021
     */
    public double getfare(double distance, double time)
    {
        double fare = distance*FARE_PER_KM + time*FARE_PER_MINUTE;
        return Math.max(MINIMUM_FARE, fare);
    }

    /**
     * Name : calculateTotalFare.
     *
     * Description : Calculating total fare based on rides.
     *
     * @param userId
     * @param rides
     * @return
     *
     * Modificaation : 27-July-2021.
     */
    public InvoiceSummary calculateTotalFare(int userId,Ride[] rides)
    {
        double totalFare = 0;
        for (Ride ride : rides)
        {
            totalFare+=getfare(ride.distance, ride.time);
        }
        rideRepository.put(userId,rides);
        return  new InvoiceSummary(userId,rides.length, totalFare);
    }
}
