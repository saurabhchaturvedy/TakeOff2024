package BackToBasics.MSOA.Next.ParkingLot;

public class Address {


    String street;
    String locality;
    String city;

    String state;
    String country;

    String zipCode;


    public Address(String street, String locality, String city, String state, String country, String zipCode) {
        this.street = street;
        this.locality = locality;
        this.city = city;
        this.state = state;
        this.country = country;
        this.zipCode = zipCode;
    }
}
