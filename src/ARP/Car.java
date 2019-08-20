package ARP;

public class Car extends Vehicle {

	public Car(double price) {
		super(price);
	}

	public void display() {
		System.out.println(price);
	}

	public void run() {
		System.out.println("Running at the same speed with Roadshow...");

	}

}

