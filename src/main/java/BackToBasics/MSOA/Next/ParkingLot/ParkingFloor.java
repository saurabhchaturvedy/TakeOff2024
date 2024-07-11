package BackToBasics.MSOA.Next.ParkingLot;

import java.util.Map;

public class ParkingFloor {


    String name;
    Map<ParkingSlotType, Map<String, ParkingSlot>> parkingSlots;


    ParkingFloor(String name, Map<ParkingSlotType, Map<String, ParkingSlot>> parkingSlots) {

        this.name = name;
        this.parkingSlots = parkingSlots;
    }


    ParkingSlot getParkingSlot(Vehicle vehicle) {

        VehicleType vehicleType = vehicle.getType();
        ParkingSlotType parkingSlotType = getParkingSlotType(vehicleType);
        Map<String, ParkingSlot> stringParkingSlotMap = parkingSlots.get(parkingSlotType);
        ParkingSlot parkingSlot = null;

        for (Map.Entry<String, ParkingSlot> entry : stringParkingSlotMap.entrySet()) {

            if (entry.getValue().isAvailable()) {

                parkingSlot = entry.getValue();
                parkingSlot.addVehicle(vehicle);
                break;
            }
        }

        return parkingSlot;
    }

    private ParkingSlotType getParkingSlotType(VehicleType vehicleType) {


        switch (vehicleType.name()) {

            case "TWO_WHEELER":
                return ParkingSlotType.SMALL;
            case "HATCH_BACK":
            case "SEDAN":
                return ParkingSlotType.COMPACT;
            case "SUV":
                return ParkingSlotType.MEDIUM;
        }

        return ParkingSlotType.LARGE;
    }
}
