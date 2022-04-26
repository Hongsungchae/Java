package Animal;

import java.util.ArrayList;

public class AnimalMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lion lion = new Lion();
		Rabbit rabbit = new Rabbit();
		
		lion.attack();
		rabbit.attack();
		
		Animal a1 = new Lion();
		Animal a2 = new Rabbit();
		
		Animal arr[] = new Animal[3];
		
		arr[0] = a1;
		arr[1] = a2;
		
		arr[0].attack();
		arr[1].attack();
		ArrayList<Animal> al = new ArrayList<Animal>();
		al.add(a1);
		al.add(a2);
		
		for(Animal a:al) {
			a.moving();
			a.attack();
		}

		Lion l = (Lion) a1;
		
		l.sleep();
		
		
		
	}

}
