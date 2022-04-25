package Toy;

import java.util.Random;
import java.util.Scanner;

public class RandomToyMachineMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Toy p1,p2,p3,p4;
		Train train = new Train();
		Ball ball = new Ball();
		Gun gun = new Gun();
		RandomToyMachine rtm = new RandomToyMachine();

		rtm.addToy(train);
		rtm.addToy(ball);
		rtm.addToy(gun);
		
		rtm.getToy().play();
 	}

}
