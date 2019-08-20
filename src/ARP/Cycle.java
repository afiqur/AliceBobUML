package ARP;

public class Cycle extends Vehicle {

	public Cycle(double price) {
		super(price);
	}

	public void display() {
		System.out.println(price);
	}

	public void run() {
		System.out.println("Running at the same speed with Toyota...");

	}
}


