
public class Customer {
	
	private int  id;
	private String name;
	private String gender;
	private String phone;
	private Birthdate birthdate;
	private Address address;
	
	public Customer(int id,String name,Birthdate birthdate,Address address,String phone,String gender){
		this.id=id;
		this.name=name;
		this.birthdate=birthdate;
		this.address=address;
		this.phone=phone;
		this.gender=gender;
		
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
		public String getGender() {
			return this.gender;
		}
		public void setGender(String gender) {
			this.gender=gender;
		}
		public String getPhone() {
			return this.phone;
		}
		public void setPhone(String phone) {
			this.phone=phone;
		}
		public Birthdate getBirthdate() {
			return this.birthdate;
		}
		
		public void setBirthdate(Birthdate birthdate) {
			this.birthdate=birthdate;
		}
		public Address getAddress() {
			return this.address;
		}
		public void setAddress(Address address) {
			this.address=address;
		}
		public void addCustomer() {
			
		}
		public void deleteCustomer() {
			
		}
		public void displayCustomer() {
			
		}

}
