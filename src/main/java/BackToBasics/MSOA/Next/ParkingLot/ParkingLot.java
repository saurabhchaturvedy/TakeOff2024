package BackToBasics.MSOA.Next.ParkingLot;

import java.util.List;
import java.util.Map;

public class ParkingLot {


    String name;
    Address address;

    List<ParkingFloor> parkingFloors;
    static ParkingLot parkingLot = null;


    ParkingLot(String name, Address address, List<ParkingFloor> parkingFloors) {

        this.name = name;
        this.address = address;
        this.parkingFloors = parkingFloors;
    }


    public static ParkingLot getInstance(String name, Address address, List<ParkingFloor> parkingFloors) {

        if (parkingLot == null) {

            return new ParkingLot(name, address, parkingFloors);
        }

        return parkingLot;
    }


    public void addFloor(String name, Map<ParkingSlotType, Map<String, ParkingSlot>> parkingSlots) {

        ParkingFloor parkingFloor = new ParkingFloor(name, parkingSlots);
        parkingFloors.add(parkingFloor);
    }


    public void removeFloor(ParkingFloor parkingFloor) {

        parkingFloors.remove(parkingFloor);
    }


    public Ticket generateTicket(Vehicle vehicle) {

        ParkingSlot parkingSlot = getRelevantSlot(vehicle);
        if (parkingSlot == null) return null;
        Ticket ticket = printTicket(vehicle, parkingSlot);
        return ticket;
    }

    private Ticket printTicket(Vehicle vehicle, ParkingSlot parkingSlot) {

        return Ticket.getTicket(vehicle, parkingSlot);
    }

    private ParkingSlot getRelevantSlot(Vehicle vehicle) {


        ParkingSlot parkingSlot = null;

        for (ParkingFloor parkingFloor : parkingFloors) {

            parkingSlot = parkingFloor.getParkingSlot(vehicle);
            if (parkingSlot != null) {
                break;
            }
        }

        return parkingSlot;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<ParkingFloor> getParkingFloors() {
        return parkingFloors;
    }

    public void setParkingFloors(List<ParkingFloor> parkingFloors) {
        this.parkingFloors = parkingFloors;
    }
}
