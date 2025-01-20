package LowLevelDesign.ParkingLotLLD;

import java.util.List;

public class TwoWheelerManager extends ParkingSpotManager {
    public TwoWheelerManager(List<ParkingSpot> spots) {
        super(spots);
    }

    @Override
    public ParkingSpot findParkingSpace() {
        // Add logic to find the nearest parking spot for Two-Wheelers
        return null;
    }
}