package LowLevelDesign.ParkingLotLLD;

import java.util.List;

public abstract class ParkingSpotManager {
    List<ParkingSpot> spots;

    public ParkingSpotManager(List<ParkingSpot> spots) {
        this.spots = spots;
    }

    public abstract ParkingSpot findParkingSpace();

    public void parkVehicle(Vehicle v) {
        ParkingSpot spot = findParkingSpace();
        spot.parkVehicle(v);
    }

    public void removeVehicle(Vehicle v) {
        for (ParkingSpot spot : spots) {
            if (spot.vehicle != null && spot.vehicle.equals(v)) {
                spot.removeVehicle();
                break;
            }
        }
    }
}