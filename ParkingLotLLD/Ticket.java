package LowLevelDesign.ParkingLotLLD;

public class Ticket {
    long entryTime;
    ParkingSpot parkingSpot;
    Vehicle vehicle;

    public Ticket(long entryTime, ParkingSpot parkingSpot, Vehicle vehicle) {
        this.entryTime = entryTime;
        this.parkingSpot = parkingSpot;
        this.vehicle = vehicle;
    }
}