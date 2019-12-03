package _01_AnimalFarm;

import java.util.ArrayList;

public class Farm {
static Sheep asheep = new Sheep();
static Pig apig = new Pig();
static Horse ahorse = new Horse();
static Cow acow = new Cow();

	public static void main(String[] args) {
		ArrayList<Animal> farm = new ArrayList<Animal>();
		
	farm.add(asheep);
	farm.add(apig);
	farm.add(ahorse);
	farm.add(acow);
	
		for(int i = 0; i < farm.size(); i++) {
			farm.get(i).makeNoise();
			farm.get(i).eat();
		}
	}
}
