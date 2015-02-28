
public class Cycle {

	static int numberOfWheels, weight;
	
	public Cycle(int numberOfWheels, int weight){
		
		this.numberOfWheels = numberOfWheels;
		this.weight = weight; 
	}
	
	public Cycle(){
		
		this(100, 1000);
	}
	
	public String toString() {
		return "Number of Wheels: " + numberOfWheels + " \nWeight: " + weight + "\n";
	}
	
}
