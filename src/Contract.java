
public class Contract {
 private int id;
 private Birthdate birthdate;
 
 
 public Contract(int id,Birthdate birthdate) {
	 this.id=id;
	 this.birthdate=birthdate;
	 
 }
 public Contract(int id,String birthdate) {
	 this.id=id;
	birthdate=birthdate;
 }
 public int getId() {
	 return this.id;
 }
 public void setId(int id) {
	 this.id=id;
	 
 }
 public Birthdate getBirthdate() {
	 return this.birthdate;
 }
 public void setBirthdate() {
	 this.birthdate=birthdate;
 }
}
