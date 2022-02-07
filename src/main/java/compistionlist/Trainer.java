package compistionlist;

import java.util.ArrayList;
import java.util.List;

public class Trainer {

    private String name;

    private List<Address> addresses; // = new ArrayList<>();

    public List<Address> getAddresses() {
        return addresses;
    }

//    public void

    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }

//    private List<Address> addresses;

    public void addAddress(Address address) {
        addresses.add(address);
    }

    public Trainer(String name,List<Address> addresses) {
        this.name = name;
        this.addresses = addresses;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
