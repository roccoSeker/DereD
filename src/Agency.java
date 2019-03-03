
public class Agency {
	private int id;
	private String name;
	private Address address;
	private String phone;
	
	public Agency(int id, String name, Address address, String phone) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.phone = phone;
	}
	public Agency() {
		this.id = id;
		this.name = name;
		this.address = address;
		this.phone = phone;
	}
	public Agency(int id2, String name2, String street, String neighborhood, String city, String phone2) {
		// 
	}
	public int getId() {
		
	return this.id;
	}
	public void setId(int id) {
		this.id=id;
		if(id<=0) {
			System.out.println("Hatalý id girdiniz.");
		}
		
	}
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name=name;
	}
	
	
	public String getPhone() {
		return this.phone;
	}
	public void setPhone(String phone) {
		this.phone=phone;
	}
	
	/*public static Agency createAgency(int id,String name,Address address,String phone) {
		return new Agency(id,name,address,phone);
	}*/
	
	public static Agency createAgency(int id,String name,String street,String neighborhood,String city,String phone) {
		return new Agency(id,name,street,neighborhood,city,phone);
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
