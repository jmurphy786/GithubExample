
public class Main {

	public static void main(String[] args) {
		
		Motorcycle suzuki = new Motorcycle();
		suzuki.setCC(200);
		suzuki.setColour("blue");
		suzuki.setEngine("DualCylinder");
		suzuki.setManufacturer("Suzuki");
		
		Car toyota = new Car();
		toyota.setSeats(4);
		toyota.setColour("blue");
		toyota.setEngine("DualCylinder");
		toyota.setManufacturer("toyota");
		
		Garage gar = new Garage();
		
		gar.putVehicle(toyota);
		System.out.println(gar.getCost());
		
		

	}
}
