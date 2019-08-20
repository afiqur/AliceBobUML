package ARP;

public abstract class Vehicle {

	protected double price;

	public Vehicle(double price) {
		this.price = price;
	}

	public abstract void display();

}

