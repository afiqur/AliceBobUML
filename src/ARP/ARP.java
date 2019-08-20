package ARP;

public class ARP {

	public static void main(String[] args) {
		Toyota t = new Toyota(10000000.00);
	
		Alice a = new Alice(5.6, 55, t);
		a.display();

		Roadshow r = new Roadshow(10000.00);
		
		Bob b = new Bob(5.4, 50, r);
		b.display();

	}

}


