import java.util.ArrayList;

public class Garage {
	
	public static ArrayList<Vehicle> listOfObjects = new ArrayList<>();
	private int amount = 0;
	
	public void putVehicle(Vehicle veh) {
		this.listOfObjects.add(veh);
	}
	
	
	public void removeVehicleByID(String Engine) {
		for(int i = 0; i<listOfObjects.size(); i++) {
			if (((Vehicle) listOfObjects.get(i)).getEngine() == Engine) {
			listOfObjects.remove(i);
			}
	}
	}
	
	public int getCost() {
		for(int i = 0; i<listOfObjects.size(); i++) {
			if ((listOfObjects.get(i).getClass()) == Car.class) {
			amount = amount + 10;
			}
			else if((listOfObjects.get(i).getClass() == Motorcycle.class)) {
			amount = amount + 5;
			}
			}
		return amount;
	}
}



