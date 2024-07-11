package BackToBasics.MSOA.Next.ParkingLot;

public class Ticket {


    String id;
    long entryTime;
    long exitTime;

    Vehicle vehicle;
    ParkingSlot parkingSlot;


    public static Ticket getTicket(Vehicle vehicle, ParkingSlot parkingSlot) {

        return new Ticket.Builder(vehicle, parkingSlot).setEntryTime(System.currentTimeMillis()).setTicket(vehicle.getRegistrationNumber() + System.currentTimeMillis()).build();
    }


    Ticket(Builder builder) {


        this.id = builder.id;
        this.entryTime = builder.entryTime;
        this.exitTime = builder.exitTime;
        this.vehicle = builder.vehicle;
        this.parkingSlot = builder.parkingSlot;

    }


    private static class Builder {

        String id;
        long entryTime;
        long exitTime;

        Vehicle vehicle;
        ParkingSlot parkingSlot;


        Builder(Vehicle vehicle, ParkingSlot parkingSlot) {

            this.vehicle = vehicle;
            this.parkingSlot = parkingSlot;
        }


        public Builder setTicket(String id) {

            this.id = id;
            return this;
        }


        public Builder setEntryTime(long entryTime) {

            this.entryTime = entryTime;
            return this;
        }

        public Builder setExitTime(long exitTime) {

            this.exitTime = exitTime;
            return this;
        }


        public Ticket build() {
            return new Ticket(this);
        }

    }
}
