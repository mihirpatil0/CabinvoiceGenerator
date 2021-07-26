package com.bridgelabz.cabinvoicegenerator;

public class InvoiceSummary
{
    public int numberOfRides;
    public double totalFare;
    public double avarage;

    public InvoiceSummary(int ofRides, int numberOfRides, double totalFare)
    {
        this.numberOfRides = numberOfRides;
        this.totalFare = totalFare;
        this.avarage = avarage;
    }

    @Override
    public String toString() {
        return "InvoiceSummary{" +
                "numberOfRides=" + numberOfRides +
                ", totalFare=" + totalFare +
                ", avarage=" + avarage +
                '}';
    }

    @Override
    public boolean equals(Object obj)
    {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        InvoiceSummary other = (InvoiceSummary) obj;
        return Double.doubleToLongBits(avarage) == Double.doubleToLongBits(other.avarage)
                && numberOfRides == other.numberOfRides
                && Double.doubleToLongBits(totalFare) == Double.doubleToLongBits(other.totalFare);
    }
}
