public class Boat extends Vehicule{
	
	public Boat(String brand, int Kilometres) {
		super(brand, Kilometres);
	}

	public String doStuff() {
		return "Je suis "+ this.getBrand() + " et je fais glou glou !";
	}
	
}