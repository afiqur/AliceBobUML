package ARP;

public abstract class Human {

	protected double height;
	protected double weight;

	public Human(double height, double weight) {
		this.height = height;
		this.weight = weight;
	}

	public abstract void display();

}


