
public class Car extends Vehicle {
	String trans;
	
//	Car(String trans){
//		this.trans = trans;
//	}

	public Car(String type, int maxSpeed,String trans) {
		super(type, maxSpeed);
		//this(trans);
	}
	
}
