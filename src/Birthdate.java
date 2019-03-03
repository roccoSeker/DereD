
public class Birthdate {
private int day;
private int month;
private int year;
private String birthdate;

public Birthdate(int day, int month, int year,String birthdate) {
	super();
	this.day = day;
	this.month = month;
	this.year = year;
	this.birthdate=birthdate;
}
public Birthdate(String birthdate) {
	this.birthdate=birthdate;
}
public int getDay() {
	return day;
}
public void setDay(int day) {
	this.day = day;
}
public int getMonth() {
	return month;
}
public void setMonth(int month) {
	this.month = month;
}
public int getYear() {
	return year;
}
public void setYear(int year) {
	this.year = year;
}
	
}
