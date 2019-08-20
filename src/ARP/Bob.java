package ARP;

public class Bob extends Human {

	Roadshow roadshow;

	public Bob(double height, double weight, Roadshow roadshow) {
		super(height, weight);
		this.roadshow = roadshow;
	}

	public void display() {
		System.out.println(height + "," + weight);
		roadshow.display();
		roadshow.start();
		roadshow.stop();
		roadshow.run();
	}

}

