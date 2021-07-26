package com.bridgelabz.cabinvoicegeneratorTest;

import com.bridgelabz.cabinvoicegenerator.CabInvoiceGenerator;
import com.bridgelabz.cabinvoicegenerator.InvoiceSummary;
import com.bridgelabz.cabinvoicegenerator.Ride;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/****************************************************
 * @author mihir
 *
 * This is a test case class.
 * This class holdes all the related test cases that,
 * test all the methods od the project.
 * **************************************************/

public class CabInvoiceGeneratorTest
{
    @Test
    public void givenDistanceAndTime_ShouldReturnTotalFare()
    {
        CabInvoiceGenerator cabInvoiceGenerator = new CabInvoiceGenerator();
        double distance = 5.0;
        double time = 2;
        double totalfare =  cabInvoiceGenerator.getfare(distance,time);
        Assertions.assertEquals(52, totalfare,0.0);
    }

    @Test
    public void givenDistanceAndTime_WhenLessThanMinimumFare_ShouldReturnTotalFare()
    {
        CabInvoiceGenerator cabInvoiceGenerator = new CabInvoiceGenerator();
        double distance = 0.1;
        double time = 2;
        double totalfare =  cabInvoiceGenerator.getfare(distance,time);
        Assertions.assertEquals(5, totalfare,0.0);
    }

    @Test
    public void givenMultipleRides_ShouldReturnInvoiceSummary()
    {
        CabInvoiceGenerator cabInvoiceGenerator =new CabInvoiceGenerator();
        Ride[] rides = { new Ride(5.0,2),new Ride(0.1,2)};
        double summary =  cabInvoiceGenerator.calculateTotalFare(rides);
        InvoiceSummary  expectedSummary = new InvoiceSummary(2,57.0);
        Assertions.assertEquals(expectedSummary,summary);
    }
}
