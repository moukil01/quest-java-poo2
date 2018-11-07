public class Car extends Vehicule{
	public Car(String brand, int Kilometres) {
		super(brand, Kilometres);
	}

	public String doStuff() {
		return "Je suis "+ this.getBrand() + " et je fait vroum vroum";
	}
	
}