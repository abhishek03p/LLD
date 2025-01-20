package LowLevelDesign.ParkingLotLLD;

import java.util.ArrayList;

public class ExitGate {
    ParkingSpotManagerFactory factory;

    public ExitGate(ParkingSpotManagerFactory factory) {
        this.factory = factory;
    }

    public void removeVehicle(Ticket ticket) {
        ParkingSpotManager manager = factory.getParkingSpotManager(ticket.vehicle.vehicleType, new ArrayList<>());
        manager.removeVehicle(ticket.vehicle);
    }
}