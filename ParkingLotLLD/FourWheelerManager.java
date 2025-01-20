package LowLevelDesign.ParkingLotLLD;

import java.util.List;

public class FourWheelerManager extends ParkingSpotManager {
    public FourWheelerManager(List<ParkingSpot> spots) {
        super(spots);
    }

    @Override
    public ParkingSpot findParkingSpace() {
        // Add logic to find the nearest parking spot for Four-Wheelers
        return null;
    }
}