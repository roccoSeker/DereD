
public class Address {
  private String street;
 
  private String neighborhood;
  private String city;
  public Address(String street,  String neighborhood, String city) {
		super();
		this.street = street;
		
		this.neighborhood = neighborhood;
		this.city = city;
	}
  public String getStreet() {
	return street;
}
public void setStreet(String street) {
	this.street = street;
}

public String getNeighborhood() {
	return neighborhood;
}
public void setNeighborhood(String neighborhood) {
	this.neighborhood = neighborhood;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}


  
  
}
