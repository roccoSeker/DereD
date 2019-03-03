
public class Agent {
	
	private int id;
	private String name;
	private Birthdate birthdate;
	private Address address;
	private String phone;
	private String gender;
	private double salary;
	public Agent(int id, String name, String agencyName, Birthdate birthdate, String phone, String gender,
			double salary) {
		super();
		this.id = id;
		this.name = name;
		this.birthdate = birthdate;
		this.phone = phone;
		this.gender = gender;
		this.salary = salary;
	}
	public Agent(int id,String name,Birthdate birthdate,Address address,String phone,String gender) {
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
		}
		public String getName() {
			return this.name;
		}
		public void setName(String name) {
			this.name=name;
		}
		public Birthdate getBirthdate() {
			return this.birthdate;
		}
		
		public void setBirthdate(Birthdate birthdate) {
			this.birthdate=birthdate;
		}
		public String getPhone() {
			return this.phone;
		}
		public void setPhone(String phone) {
			this.phone=phone;
		}
		public String getGender() {
			return this.gender;
		}
		public void setGender(String gender) {
			this.gender=gender;
		}
		public double getSalary() {
			return this.salary;
		}
		public void setSalary(double salary) {
			this.salary=salary;
		}
		public void deleteAgent() {
			
		}
		public void displayAgents() {
			
		}
		public void listAgents() {
			
		}
		
		
		
		
		
		
		
		
}
