package LowLevelDesign.ParkingLotLLD;

import java.util.List;

public class EntranceGate {
    ParkingSpotManagerFactory factory;

    public EntranceGate(ParkingSpotManagerFactory factory) {
        this.factory = factory;
    }

    public ParkingSpot findParkingSpace(VehicleType vehicleType, List<ParkingSpot> spots) {
        ParkingSpotManager manager = factory.getParkingSpotManager(vehicleType, spots);
        return manager.findParkingSpace();
    }

    public Ticket generateTicket(Vehicle vehicle, ParkingSpot parkingSpot) {
        return new Ticket(System.currentTimeMillis(), parkingSpot, vehicle);
    }
}