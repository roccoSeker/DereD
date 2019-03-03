
public class RealEstate {
	
	//1 deðeri satýlýk, 2 deðeri kiralýk ,3 deðeri dolu olduðunu gösterir.
	
	
	private int id;
	private Address address;
	private String type;
	private String status;
	private double surfaceArea;
	private double price;
	private int roomNumber;
	
	public RealEstate(int id,String type,String status,Address address,double surfaceArea,double price,int roomNumber) {
		this.id=id;
		this.type=type;
		this.status=status;
		this.address=address;
		this.surfaceArea=surfaceArea;
		this.price=price;
		this.roomNumber=roomNumber;
	}
	public RealEstate(int id,String type,String status,Address address,String surfaceArea,String price,String roomNumber) {
		this.id=id;
		this.type=type;
		this.status=status;
		this.address=address;
		surfaceArea=surfaceArea;
		price=price;
		roomNumber=roomNumber;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
		if(id<=0) {
			System.out.println("Hatalý id girdiniz.");
		}
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
		if(type!="flat"||type!="villa"||type!="summer villa"||type!="farmhouse"||type!="office") {
			System.out.println("Bu tipte emlak bulunmamaktadýr.");
		}
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public double getSurfaceArea() {
		return surfaceArea;
	}
	public void setSurfaceArea(double surfaceArea) {
		this.surfaceArea = surfaceArea;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getRoomNumber() {
		return roomNumber;
	}
	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
		if(roomNumber<=0) {
			System.out.println("Hatalý oda numarasý girdiniz");
		}
	}
	
	public void deleteRealEstate() {
		
	}
	public void displayRealEstate() {
		
	}
	

}
 