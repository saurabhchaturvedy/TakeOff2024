package BackToBasics.MSOA.Next.ParkingLot;

public class Vehicle {


    String registrationNumber;
    VehicleType type;


    Vehicle(VehicleType type,String registrationNumber)
    {

        this.registrationNumber = registrationNumber;
        this.type = type;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public VehicleType getType() {
        return type;
    }

    public void setType(VehicleType type) {
        this.type = type;
    }
}
