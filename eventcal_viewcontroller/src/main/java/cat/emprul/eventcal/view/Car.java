package cat.emprul.eventcal.view;

public class Car {
	
	  int id;
	  int year;
	  String brand;
	  String color;
	  
	  
	public Car(int id, int year, String brand, String color) {
		super();
		this.id = id;
		this.year = year;
		this.brand = brand;
		this.color = color;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}

}
