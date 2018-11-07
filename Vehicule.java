public abstract class Vehicule{
	private String brand;
	private int Kilometres;
	

	
public Vehicule (String brand, int Kilometres) {
	this.setBrand(brand);
	this.setKilometres(Kilometres);
}



public String getBrand() {
	return brand;
}



public void setBrand(String brand) {
	this.brand = brand;
}



public int getKilometres() {
	return Kilometres;
}



public void setKilometres(int kilometres) {
	Kilometres = kilometres;
}
public abstract String doStuff();
 































}