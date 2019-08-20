package ARP;

public class Alice extends Human {

	Toyota toyota;

	public Alice(double height, double weight, Toyota toyota) {
		super(height, weight);
		this.toyota = toyota;
	}

	public void display() {
		System.out.println(height + "," + weight);
		toyota.display();
		toyota.start();
		toyota.stop();
		toyota.run();
	}

}



