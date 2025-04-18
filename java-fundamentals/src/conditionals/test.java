package conditionals;

import java.util.Optional;
public class test {
  //"get the city from user object"
  public static void main(String[] args) {
    String city = "ohio";
    Address address = new Address(city);
    User user = new User(Optional.of(address));
    String city1 = user.getAddress().map(Address::getCity).orElse(null);
    
    System.out.println("******" + user.getAddress().map(Address::getCity).orElse(null));

  }
}
 
class Address {
    private String city;
 
    public Address(String city) {
        this.city = city;
    }
 
    public String getCity() {
        return city;
    }
}
 
class User {
    private Optional<Address> address;
 
    public User(Optional<Address> address) {
        this.address = address;
    }
 
    public Optional<Address> getAddress() {
        return address;
    }
}

