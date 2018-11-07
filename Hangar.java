public class Hangar{
	
	public static void main(String[] args) {
	Car Clio = new Car("Clio" ,10);
	Car Ferrarie = new Car("Ferrarie",20);
	Boat Titanic = new Boat("Titanic",20);
	Boat Black_Pearl = new Boat ("Black Pearl",50);
	
	System.out.println(Clio.doStuff());
	System.out.println(Ferrarie.doStuff());
	System.out.println(Titanic.doStuff());
	System.out.println(Black_Pearl.doStuff());
		
	}
	
}