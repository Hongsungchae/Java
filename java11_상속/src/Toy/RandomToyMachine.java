package Toy;

import java.util.ArrayList;
import java.util.Random;

public class RandomToyMachine{
	
	ArrayList<Toy> al = new ArrayList<Toy>();
	Random r = new Random();
	
	public void addToy(Toy toy) {
		al.add(toy);
	}
	public Toy getToy() {
		int ran = r.nextInt(al.size());
		return al.get(ran);
	}
	
}
